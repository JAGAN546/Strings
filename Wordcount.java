import java.util.*;
public class Wordcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,l,c=1;
        System.out.print("Enter a sentence:");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
                c++;
        }
        System.out.println("No. of words in above sentence are "+c);
        sc.close();
    }
}
