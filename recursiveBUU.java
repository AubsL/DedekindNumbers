
/**
 * This program recursively calculates values for the Dedekind numbers
 * 
 * @author Aubrey Laskowski
 * @version 07/21/2016
 */
public class recursiveBUU
{
    public void main(){
        
        int [] var = new int [7828355]; var[1] = 1; var[0] = 2; var[7828354] = 1;
        int numVar = 6;
        
        int Dcount = recursion(numVar, var);
        
        System.out.println(Dcount);

    }
    
    public int recursion(int numVar, int[] array){
        int i; int j; int yes = array[0];
        if(numVar == 0){
            return array[0];
        }
        
        else{
            for(i=1;i<yes;i++){
                for(j=i;j<yes;j++){
                    if((array[i] | array[j]) == array[j]){
                        array[(array[0])] = (array[i]<<(array[7828354])) + array[j];
                        array[0]++;
                    }
                }
            }
            array[7828354] *= 2;
            numVar--;
            return recursion(numVar, array);
        }
    }
}
