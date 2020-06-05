1)program to find whether given string is palindrome or not

public class Palindrome
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
2)given a string of even length return the first half so the string "CATDOG" yields"CAT".If the string  length is oddnumber then return null
import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        String abc= sc.nextLine();
       
        String bcd=null;
        int lenght=abc.length();
        int n=lenght/2;
        if(lenght%2==0)
        { bcd="";
            for(int i=0;i<n;i++){
                bcd=bcd+abc.charAt(i);
               
            }
            System.out.print(bcd);
        }
        else
        System.out.println(bcd);
        sc.close();
    }

}
3)given two string if the first or last chars 'x' return the string without those 'x'chars and otherwise return the string unchanged
public String withoutX(String str) {  
  if (str.length() == 0)
    return str;
  if (str.length() == 1){
    if (str.charAt(0) == 'x')
      return "";
    else
      return str;
  }
  
  if (str.charAt(0) == 'x')
    str = str.substring(1,str.length());
    
  if (str.charAt(str.length()-1) == 'x')
    str = str.substring(0,str.length()-1);

  return str;
}
4)given a string return a new string made of n copies of the first two characters of the original string where n length of the string.if input is "wipro"
o/p is "WIWIWIWI"
package stringWala;
import java.util.Scanner;
/**
 * @author Parasite
 *
 */
public class String3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        String next="";
        System.out.println("Enter the string");       
        String abc= sc.nextLine();
        int lenght =abc.length();
        if(lenght<=1){
            next=abc;
           
        }
        else{
            for (int i=0;i<lenght;i++){
                next=next+abc.charAt(0)+abc.charAt(1);
            }
        }
        System.out.print(next);
    sc.close();

    }

}

