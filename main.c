#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, j, k=1, Dcount = 2;
    int var[7581]; var[1]=1;

    for(i=1;i<Dcount;i++)
    {
        for(j=i;j<2;j++)
        {
            if((var[i] | var[j]) == var[j])
            {
                var[Dcount] = (var[i]<<k) + var[j];
                Dcount++;
            }
        }
    }
    k *= 2;

    for(i=1;i<Dcount;i++)
    {
        for(j=i;j<3;j++)
        {
            if((var[i] | var[j]) == var[j])
            {
                var[Dcount] = (var[i]<<k) + var[j];
                Dcount++;
            }
        }
    }
    k *= 2;

    for(i=1;i<Dcount;i++)
    {
        for(j=i;j<6;j++)
        {
            if((var[i] | var[j]) == var[j])
            {
                var[Dcount] = (var[i]<<k) + var[j];
                Dcount++;
            }
        }
    }
    k *= 2;

    for(i=1;i<Dcount;i++)
    {
        for(j=i;j<20;j++)
        {
            if((var[i] | var[j]) == var[j])
            {
                var[Dcount] = (var[i]<<k) + var[j];
                Dcount++;
            }
        }
    }
    k *= 2;

    for(i=1;i<Dcount;i++)
    {
        for(j=i;j<168;j++)
        {
            if((var[i] | var[j]) == var[j])
            {
                var[Dcount] = (var[i]<<k) + var[j];
                Dcount++;
            }
        }
    }
    k *= 2;

    for(i=1;i<Dcount;i++)
    {
        for(j=i;j<7581;j++)
        {
            if((var[i] | var[j]) == var[j])
            {
                Dcount++;
            }
        }
    }

    printf("The Dedekind number of 6 variables is %d \n", Dcount);
    return 0;
}
