
/**
 * This class will test each boolean function of all variables up to 5 (5 not tested), should output
 *              Dedekind numbers
 *              
 * I want to probabilistically extend this to Dedekind number testing of higher variables
 * 
 * @author Aubrey Laskowski
 */
public class monotonicityTestingCase
{
    public void main(){
        //double startTime = System.currentTimeMillis();
        int i=0,j=0;
        for(i=0;i<16;i++){
            if(test2var(i) == 1){
                j++;
            }
        }
        //double endTime = System.currentTimeMillis();
        //double totalTime = endTime - startTime;
        //System.out.println(totalTime/16);
        
        j=0;
        //startTime = System.currentTimeMillis();
        for(i=0;i<256;i++){
            if(test3var(i) == 1){
                j++;
            }
        }
        //endTime = System.currentTimeMillis();
        //totalTime = endTime - startTime;
        //System.out.println(totalTime/256);
        
        j=0;
        //startTime = System.currentTimeMillis();
        for(i=0;i<65536;i++){
            if(test4var(i)==1){
                j++;
            }
        }
        //endTime = System.currentTimeMillis();
        //totalTime = endTime - startTime;
        
        //System.out.println(totalTime/65536);
        
        long m=0;
        long k;
        double startTime = System.currentTimeMillis();
        for(k=0L;k<4294967296L;k++){
            if(test5var(k)==1){
                m++;
            }
        }
        double endTime = System.currentTimeMillis();
        double totalTime = endTime - startTime;
        
        System.out.println(totalTime/4294967296L);
        System.out.println(m);
    }
    
    
    
    public int test1var(int function){
        int result = 0;
        int firstHalf = function >> 1;
        int secondHalf = (function % 2);
        
        if((firstHalf | secondHalf) == secondHalf){
            result = 1;
        }
        
        return result;
    }
    
    public int test2var(int function)
    {
        // split into 2 cases
        int result = 0;
        int firstHalf = function >> 2;
        int secondHalf = (function % 4);

        if((test1var(firstHalf)==1)&&(test1var(secondHalf)==1)){
            if((firstHalf | secondHalf) == secondHalf){
                result = 1;
            }
        }
        return result;
    }
    public int test3var(int function)
    {
        //split the function into 2 cases
        int result = 0;
        int firstHalf = function >> 4;
        int secondHalf = (function % 16);
        
        if((test2var(firstHalf)==1)&&(test2var(secondHalf)==1)){
            if((firstHalf | secondHalf)==secondHalf){
                result = 1;
            }
        }
        return result;
    }
    public int test4var(int function)
    {
        //split the function into 2 cases
        int result = 0;
        int firstHalf = function >> 8;
        int secondHalf = (function % 256);
        
        if((test3var(firstHalf)==1)&&(test3var(secondHalf)==1)){
            if((firstHalf | secondHalf)==secondHalf){
                result = 1;
            }
        }
        return result;
    }
    public int test5var(long function)
    {
        int result = 0;
        int firstHalf = (int)(function >> 16);
        int secondHalf = (int)(function % 65536);
        
        if((test4var(firstHalf)==1)&&(test4var(secondHalf)==1)){
            if((firstHalf | secondHalf)==secondHalf){
                result = 1;
            }
        }
        return result;
    }
    
    
    
    public int recursion(int function)//will be used to check less than 4
    {
        int result = 0;
        
        int length = log2(function);
        
        int firstHalf = (function >> (length/2));
        int secondHalf = (function % (int)(Math.pow(2,(length/2))));
        
        if((firstHalf | secondHalf) == secondHalf){
            if(length == 2){
                result = 1;
            }
            else {
                if((recursion(firstHalf)==1)&&(recursion(secondHalf)==1));
                    result = 1;
            }
        }
        
        return result;
    }
    
    public int log2(int function)
    {
        double log = (Math.log(function))/(Math.log(2));
        int log2 = (int)log;
        return log2;
    }
}
