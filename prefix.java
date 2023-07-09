package String;

public class prefix {
      public static void findPrefix(String str ){
          int n = str.length();
          String[] arr = new String[n];
         for(int i = 0 ; i < n ; i++){
           arr[i] = str.substring(0 , i+1);
         }
         
      for(int i = 0 ; i< n ; i++){
            System.out.println(arr[i]);
         }
      }
      public static void main(String[] args) {
        String str = "apple";
        findPrefix(str);
      }
}
