code day 2

1.
/* Program to accept 25 integer elements for an array then find the maximum number in the set and display 
*/
import java.util.*; public class Main
{
               public static void main(String[] args) {
               int n,max;
max=0;
               int[] a;         //declaration
               a = new int[25];      //instantiation
               for(int i=0;i<25;i++){ 
                             Scanner sc = new Scanner(System.in);
                             n=sc.nextInt();
                             a[i] = n;     //initialization values
            }
            for(int i=0;i<25;i++)
                if(a[i]>max)
                    max=a[i];
                
           
        System.out.println("max=" +max);
       
        }
}
2.
 
/* algorithm to accept 10 integer elements for an array and then find the number of times the number with the maximum value occurs in the array. */ import java.util.*; public class Main
{
               public static void main(String[] args) {
               int n,max,c;
               max=0;
               c=0;
               int[] a;         //declaration
               a = new int[10];      //instantiation
               for(int i=0;i<10;i++){ 
                              Scanner sc = new Scanner(System.in);
                             n=sc.nextInt();
                             a[i] = n;     //initialization values
            }
            for(int i=0;i<10;i++)
            {
                if(a[i]>max)
                    max=a[i];
                if(max==a[i])
                    c+=1;
            }             
        System.out.println("max count=" +c);
        
        }
}
 
 
3.
/* algorithm to calculate the factorial of a number N. The value of N is provided as an input by the user */. import java.util.*; public class Main{ 
 public static void main(String args[]){ 
     int i,n,fact=1; 
     Scanner sc = new Scanner(System.in);
     n=sc.nextInt();
     for(i=1;i<=n;i++){   
         fact=fact*i;    
         }   
         System.out.println("Factorial of "+n+" is: "+fact);   
    
 } 
}  
