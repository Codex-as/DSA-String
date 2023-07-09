package String;

public class String_BuilderAndBuffer {
    public static void main(String[] args) {
        String a = "abc";
        StringBuilder b = new StringBuilder("Hello");
        b.append("Hi");
        b.replace(0,3,"Cats");
        b.reverse();
        a.concat("hi");
        System.out.println(b);
        System.out.println(a);
    }
}
