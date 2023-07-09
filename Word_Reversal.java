package String;

public class Word_Reversal {
    public static void reverseCharacter(char[] s , int i , int  j ){
        while(i< j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp ;
            i++;
            j--;
        }
    }
    static String reverseWords(String s){
       char[] c = s.toCharArray();
       int start = 0 ;
       int end = 0 ;
        for(; end <s.length() ; end++){
            if(c[end] == ' '){
                reverseCharacter(c ,start , end -1 );
                start = end + 1 ;
            }
        }
        reverseCharacter(c ,start , end -1);

        //step 2
        reverseCharacter(c , 0 , s.length()-1);
        return new String(c);
    }
    public static void main(String[] args) {
        String s1 = reverseWords("I anm the boss");
        System.out.println(s1);
    }
}
