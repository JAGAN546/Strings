import java.util.*;
public class Upperlower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,u,l;
        System.out.print("Enter a word:");
        s=sc.nextLine();
        u=s.toUpperCase();
        l=s.toLowerCase();
        System.out.println("The words in upper case:"+u);
        System.out.println("The words in lower case:"+l);
        sc.close();
    }
}
