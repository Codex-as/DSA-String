package String;

public class ComputeWeightArray {
     public static int[] computeWeight(String pattern){
        //phle ek array bna lenge weight ka jo ki pattern ke length ke equal hoga 
        int[] weightArray = new int[pattern.length()];
        //fir ek length lenge or ek j pointer
        int length = 0 ;
        int j = 1;

        //fir phla index jo hoga usme 0 phle dal denge qki usy check kisi kre phla character hai 
        weightArray[0] = 0;

        //next ek loop lgaynge jbtk pattern ka length cross na kr jaye j 
        while(j < pattern.length()){
            //check krnge charAt j equal hai length ke agr hai toh length ko bdha denge or j ko v nd weightArray j index pe length dal denge

            if(pattern.charAt(j) == pattern.charAt(length)){
                length++;
                weightArray[j] = length;
                j++;
            }
            else {
                //Agar aisa ni hai to check krnge length khi 0 ke brabr to ni 

                if(length != 0 ){
                    length = weightArray[length-1];
                }
                else{
                    //mtlb nya character aya hai agr naya character aya hai toh ussy hmesa 0 hi dalenge 
                    weightArray[j] = 0 ;
                    j++;
                }
            }
        }
        return weightArray;
     }
     public static void main(String[] args) {
        String pattern  = "ababcababeab";
        int[] ans = computeWeight(pattern);
        System.out.print(ans);
     }
}
