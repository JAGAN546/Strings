import java.util.*;
public class Countchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,l,c=0,d=0,sp=0;
        char ch;
        System.out.print("Enter a word with digit,specialcharacters:");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetter(ch))
                c++;
            else if(Character.isDigit(ch))
                d++;
            else
                sp++;
        }
        System.out.println("No. of letters are:"+c);
        System.out.println("No. of digits are:"+d);
        System.out.println("No. of special characters are:"+sp);
        sc.close();
    }
}
