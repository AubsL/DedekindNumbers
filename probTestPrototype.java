import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * This program calculates values for the Dedekind numbers probabilistically
 * 
 * @author Aubrey Laskowski
 * @version 11/29/2016
 */
public class probTestPrototype
{
    public void main(){
        
        
        int [] var = new int [7828354]; var[1] = 1; var[0] = 2;
        int Dcount = 2;
        int i; int j; int k = 1; //int n; int m;
        
        for(i=1;i<Dcount;i++){
            for(j=i;j<2;j++){
                if((var[i] | var[j]) == var[j]){
                    var[Dcount] = (var[i]<<k) + var[j];
                    Dcount++;
                }
            }
        }
        k *= 2;
        
        for(i=1;i<Dcount;i++){
            for(j=i;j<3;j++){
                if((var[i] | var[j]) == var[j]){
                    var[Dcount] = (var[i]<<k) + var[j];
                    Dcount++;
                }
            }
        }
        k *= 2;
        
        for(i=1;i<Dcount;i++){
            for(j=i;j<6;j++){
                if((var[i] | var[j]) == var[j]){
                    var[Dcount] = (var[i]<<k) + var[j];
                    Dcount++;
                }
            }
        }
        k *= 2;
        
         for(i=1;i<Dcount;i++){
             for(j=i;j<20;j++){
                 if((var[i] | var[j]) == var[j]){
                     var[Dcount] = (var[i]<<k) + var[j];
                     Dcount++;
                 }
             }
         }
         k *= 2;
        
//          for(i=1;i<Dcount;i++){
//              for(j=i;j<168;j++){
//                  if((var[i] | var[j]) == var[j]){
//                      var[Dcount] = (var[i]<<k) + var[j];
//                      Dcount++;
//                  }
//              }
//          } //Dcount = 7581
//          k *= 2;
        
        
        int firstIndex, secondIndex;
        int maxExpected = Dcount*(Dcount+1)/2, DStart = Dcount;
        Dcount = 0;
        int leastNeeded = maxExpected; //this means I'll run (Dcount+1)/2 simulations
        
        double average=0;
        int trials = 100;
        
        for(int m=0;m<trials;m++){
        for(i=0;i<leastNeeded;i++){
            firstIndex = (int)(DStart*Math.random());
            int range2i = DStart - firstIndex;
            secondIndex = (int)(range2i*Math.random())+firstIndex;
            int first = var[firstIndex], second = var[secondIndex];
            
            if((var[firstIndex] | var[secondIndex]) == var[secondIndex]){
                Dcount++;
            }
        }
        }
        Dcount /= trials;
        
        System.out.println(Dcount + " is the result for 5 variables\n");
        
    }
}
