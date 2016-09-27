
/**
 * This program calculates values for the Dedekind numbers
 * 
 * @author Aubrey Laskowski
 * @version 07/21/2016
 */
public class BUU
{
    public void main(){
        
        double totalTotalTime = 0;
        System.out.println("Calculating Dedekind 6 variables...");
          for(int l=0;l<10;l++){
        int [] var = new int [7828354]; var[1] = 1; var[0] = 2;
        int Dcount = 2;
        int i; int j; int k = 1; //int n; int m;
        double startTime = System.currentTimeMillis();
        
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
        
        for(i=1;i<Dcount;i++){
            for(j=i;j<168;j++){
                if((var[i] | var[j]) == var[j]){
                    var[Dcount] = (var[i]<<k) + var[j];
                    Dcount++;
                }
            }
        }
        k *= 2;
        
        for(i=1;i<Dcount;i++){
           for(j=i;j<7581;j++){
                if((var[i] | var[j]) == var[j]){
                    //var[Dcount] = (var[i]<<k) + var[j];
                    Dcount++;
                }
            }
        }
        
//             for(i=7000000;i<7500000;i++){
//                for(j=i;j<7828354;j++){
//                     if((var[i] | var[j]) == var[j]){
//                         Dcount7++;
//                     }
//                 }
//             }
        
//          for(i=1;i<(7581);i++){
//              for(j=i;j<(7581);j++){
//                  for(n=i;n<(7581);n++){
//                      for(m=n;m<(7581);m++){
//                          if(((var[i] | var[j]) == var[j])
//                           && ((var[n] | var[m]) == var[m])
//                           && ((var[n] | var[i]) == var[n])
//                           && ((var[j] | var[m]) == var[m])){
//                              Dcount7++;
//                          }
//                      }
//                  }
//              }
//          }
        
        
        double endTime = System.currentTimeMillis();
        double totalTime = endTime - startTime;
//         System.out.println("Total runtime is " + totalTime + " ms");
//         System.out.println(Dcount1);
//         System.out.println(Dcount2);
//         System.out.println(Dcount3);
//         System.out.println(Dcount4);
//         System.out.println(Dcount5);
//         System.out.println(Dcount);

         totalTotalTime += totalTime;
        }
      
      totalTotalTime = totalTotalTime / 10;
     System.out.println(totalTotalTime + " milliseconds.");
    }
}
