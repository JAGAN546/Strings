import java.util.*;
public class Comparison {
    public static void main(String[] args) {
        String a="Kunal";
        String b="Kunal";
        String c=a;
        // ==
        System.out.println(a==c);
        String a1 =new String("Kunal");
        String b1 =new String("Kunal");
        System.out.println(a1.equals(b1));
        // System.out.println(a1==b1);
        System.out.println(a1.charAt(0));
    }
}
