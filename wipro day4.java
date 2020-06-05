//encapsulation:

import java.util.*;
import java.io.*;

class Author{
    public static String email;
   public static char gender;
    public static String name;
    Author(String n,String e,char g)
    {
        name=n;
        email=e;
        gender=g;
    }
    
    
}
class Book{
    String name1,author;
    double price;
    int qtyInStock;
    Book(String n1)
    {
        name1=n1;
        
    }
    public void setPrice()
    {
        price=100;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQtyInStock()
    {
        qtyInStock=10;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public String getName()
    {
        return name1;
    }
   public void getAuthor()
    {
       System.out.println("The name of the author is :"+Author.name);
       System.out.println("The email id is :"+Author.email);
       System.out.println("The gender is :"+Author.gender);
    }
    
}
class Books{
    public static void main(String args[])
    {
        Book b=new Book("Computer Networks");
        Author a=new Author("amy","xxx.cse@rmd.ac.in",'f');
        b.setPrice();
        b.setQtyInStock();
        System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The stock is :"+b.getQtyInStock());
        b.getAuthor();
        
    }
}

?//Inheritance:

public class Animal {
public Animal() {
    System.out.println("A new animal has been created!");
}   
public void sleep() {
    System.out.println("An animal sleeps...");
}
public void eats() {
    System.out.println("An animal eats...");
}
}
//then bird
public class Bird  extends Animal {

public Bird() {
    super();
    System.out.println("A new bird has been created!");
    // TODO Auto-generated constructor stub
}
public void sleep() {
    System.out.println("A bird sleeps...");
}
public void eats() {
    System.out.println("A bird eats...");
}

}
//then dog

public class Dog extends Animal {

public Dog() {
    super();
    System.out.println("A new dog has been created!");
    // TODO Auto-generated constructor stub
}
public void sleep() {
    System.out.println("A dog sleeps...");
}
public void eats() {
    System.out.println("A dog eats...");
}
}
//then this main class

public class MainClass {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    Animal animal = new Animal();
    Bird bird = new Bird();
    Dog dog = new Dog();

    System.out.println();
}

}

//Palindrome or not:

import java.util.Scanner;
 
class ChkPalindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}

//Wipro is printed as pro in 3times:

public class String12 {

    public static void main(String[] args) {
        // TODO enter the string and integer as command line input
        String a,c="";
        int b,len;
        b=Integer.parseInt(args[1]);
        len=args[0].length();
        a=args[0];
        len=len-b;
        for(int i= 0;i<b;i++)
        {
            c=c+a.substring(len);
        }
        System.out.println(c);

    }

}


//Wipro is printed at 3 times:

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String seperator = in.nextLine();
        int count = in.nextInt();
        System.out.println(bigString(word, seperator, count));
    }

    static String bigString(String w, String s, int c) {
        String big = w;
        for(int i = 0; i < c-1; i++) {
            big += s;
            big += w;
        }
        return big;
    }
}