import java.util.*;
public class Vowelsconsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,lo;
        int i,l,c=0,d=0;
        System.out.print("Enter a word:");
        s=sc.nextLine();
        lo=s.toLowerCase();
        l=lo.length();
        for(i=0;i<l;i++)
        {
            char ch=lo.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
                c++;
            else
                d++;
        }
        System.out.println("No. of vowels are:"+c);
        System.out.println("No. of consonants are:"+d);
        sc.close();
    }
}
