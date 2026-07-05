import java.util.*;
public class Whitespaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,s1;
        int i,l;
        System.out.print("Enter a string:");
        s=sc.nextLine();
        l=s.length();
        s1="";
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)!=' ')
                s1=s1+s.charAt(i);
        }
        System.out.println(s1);
        sc.close();
    }
}