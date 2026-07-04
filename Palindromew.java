import java.util.*;
public class Palindromew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,s1,lo;
        int l,i;
        char ch;
        System.out.print("Enter a word:");
        s=sc.nextLine();
        lo=s.toLowerCase();
        s1="";
        l=lo.length();
        for(i=l-1;i>=0;i--)
        {
            ch=lo.charAt(i);
            s1=s1+ch;
        }
        if(lo.equals(s1))
            System.out.println(lo+" is palindrome word");
        else
            System.out.println(lo+" is not palindrome word");
        sc.close();
    }    
}
