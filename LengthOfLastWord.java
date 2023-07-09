package String;

public class LengthOfLastWord {
    public  static int lengthOfLastWord(final String a){
        int len= 0;
        String  x = a.trim();
        for(int i = 0; i< x.length(); i++){
               if(x.charAt(i) == ' ')
               len = 0;
               else 
               len++;

        }
        return len ;
    }
    public static void main(String[] args) {
       // String s1 = new String();
        String a = "i am the boss";
 System.out.println("The length of last word" +lengthOfLastWord(a));
    }
}
