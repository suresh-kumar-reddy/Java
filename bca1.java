import java.io.*;
import java.util.Scanner;
class Bca
{
  int choic,digit;
  String str;
  public void length()throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("\n\nEnter a string: ");
    str=br.readLine();    
    System.out.println("\n\nThe string length is: "+str.length());
  }
  public void upper()throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("\n\nEnter a string: ");
    str=br.readLine();
    System.out.println("\n\n1. For Lower case\n\n2 For Uppercase\n\nChoose your option: ");
    choic=Integer.parseInt(br.readLine());
     switch(choic)
      {
        
       case 1:    String lowerCase=str.toLowerCase();
    System.out.println("\n\nThe lower case string is: "+lowerCase);
               break;
        case 2:
    String upperCase=str.toUpperCase();
    System.out.println("\n\nThe Upper case string is: "+upperCase);
               break;
      
           }

  }           public void sumofdigits()throws IOException
           {
InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    
    System.out.println("\n\nEnter the digit: ");
    digit=Integer.parseInt(br.readLine());
           
           System.out.println("\n\nThe square of a number is: "+digit*digit);

    int sum=0,temp,temp1=digit;
    while(digit>0)
    {

     temp=digit%10;
     
     digit/=10;
     sum=sum+temp;

           }System.out.println("\n\nsum the digit is: "+sum);
    
     
    }
    public void replace()throws IOException
    {
     Scanner a = new Scanner (System.in);
System.out.print("Enter string: ");
String s = a.nextLine();
String[] vals = {"a", "u", "o", "e", "i"};
for(String val : vals)
    s = s.replaceAll(val, "the");
System.out.println(s);
    }
    
}
public class Bca1
{
  public static void main(String args[]) throws IOException
  {
    Bca obj=new Bca();
    int choice,num;
    boolean ch=true;
    System.out.println("\n\nProgram on String Functions\n\nDate: 08:01:18\n\nAuthor:Suresh");
    while(ch)
    {
      
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      System.out.println("\n\n1. For Length\n\n2. For Uppercase or Lowercase\n\n3. Sum of digit of the Integer and square of Integer\n\n4. Replace all vowels with 'THE'\n\n5 Exit\n\n");
      choice=Integer.parseInt(br.readLine());
      switch(choice)
      {
        case 1:obj.length();
               break;
        case 2:obj.upper();
               break;
        case 3:obj.sumofdigits();
               break;
        case 4:obj.replace();
               break;
        case 5: ch=false;
               break;
      }
    }
    System.out.println("\n\nThank You!!!!!!!!!");
  }
}