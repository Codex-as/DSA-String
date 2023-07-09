package String;

public class String1 {
    public static void main(String[] args) {
        String str1  = "Hello";
        String str2 = "Hello";
        String str3  = new String("Hello");
        //reference comparision  
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        //value comparision 
        System.out.println(str1.equals(str3));

        //Immutable
        String s4 = str1.concat("abs").replace("e" , "i");
        System.out.println(s4);
        System.out.println(str1);

    }
}
