
/**
 * This program generates a random boolean function of 5 variables and tests for monontonicity
 * It outputs 0 if non-monotone or 1 if monotone.
 * 
 * 
 * @author Aubrey Laskowski
 */
public class testMonoSingleCase
{
    public void main(){
        long function = 4294967296L;
        function *= Math.random();
        
        int monotonicity = testMonotone(function);
        System.out.println(Long.toBinaryString(function));
        System.out.println(monotonicity);
    }
    
    
    public int testMonotone(long function)
    {
        int result = 0;
        
        if(test5var(function)==1){
            result = 1;
        }
        
        return result;
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
    
    public int test2var(int function){
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
}
