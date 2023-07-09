package String;

public class String_Subsequence {
       static boolean isSubsequence(String s1 , String s2 , int m , int n){
        //base case 
        if(m == 0) return true ;
        if(n == 0) return false;
  
        //if last char of two string are matching
        if(s1.charAt(m-1) == s2.charAt(n-1)) 

             return isSubsequence(s1, s2, m-1, n-1);
    //if last char are not matching
         return isSubsequence(s1, s2, m, n-1);

       }
       public static void main(String[] args) {
         String s1 = "Ashish";
         String s2 = "Vashrshaish";
         boolean res = isSubsequence(s1, s2, 0, 0);
         if(res)
           System.out.println("Matched");
           else
           System.out.println("Not Matching");
       }
}
