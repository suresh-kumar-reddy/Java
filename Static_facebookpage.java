import java.io.*;
import java.util.Scanner;
class Facebook
{
  String persName;
  private long phoneNum;
  String passWord;
  String newPassword;
  private long dateofBirth;
  public char persGender;
  static int logInCount=0;
  public Facebook()
  {
    logInCount++;
  }
  
  public void read() throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("\n\nWelcome to Facebook Creation Page........!!");
    System.out.println("\n\nEnter your name:");
    persName=br.readLine();
    System.out.println("\n\nEnter your Phone number:");
    phoneNum=Long.parseLong(br.readLine());
    System.out.println("\n\nEnter your new password:");
    newPassword=br.readLine();
    System.out.println("\n\nEnter your Date of Birth:");
    dateofBirth=Long.parseLong(br.readLine());
    System.out.println("\n\nEnter your Gender:");
    persGender=(char)br.read();
    System.out.println("\n\nSuccessfully Created the Account");
  }
  public void display()
  {
    System.out.println("\n\nThe number of Users Signed up into Facebook are: "+logInCount);
  }
  public void dispdata()
  {
                  
      System.out.println("\n\nUser Name is:"+persName);
      System.out.println("\n\nUser Phone number is:"+phoneNum);
      System.out.println("\n\nUser Password is:"+newPassword);
      System.out.println("\n\nUser Date of Birth is:"+dateofBirth);
      System.out.println("\n\nUser Gender is:"+persGender);
      
  }
}
public class Facebookpage
{
  static String fbInventor;
  static long stockValue;
  static String headQuarters;
  static long count=0;
  
  static 
  {
    fbInventor="Mark Zuckerberg";
    stockValue=200000000;
    headQuarters="U.S";  
  }
  public static void main(String args[]) throws IOException
  {
    display(); // calling normal without creating object static method
    
    System.out.println("\n\nThe inventor of the Facebook is: "+fbInventor);
    System.out.println("\n\nThe value of the Facebook is: "+stockValue);
    System.out.println("\n\nThe head quarters of the Facebook is in: "+headQuarters);
    System.out.println("\n\nUSA and Australia donated the money to Facebook are 3000,5000");
    System.out.println("\n\nEnter the Donated amount from USA and Australia Government");
    int fbDonation=Donations.fromGovernment(3000,5000);                                 // Calling Static method using class
    System.out.println("\n\nThe sum of Donation from USA and Australia is: "+fbDonation);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    byte res;
    
    Boolean ch=true;
    Facebook fb[]=new Facebook[10];
    while(ch)
    {
      System.out.println("\n\nEnter your Choice\n\n1. For Creation of an Account\n\n2. For Show how many users signed up\n\n3 For Display the users\n\n4 for Exit");
      res=Byte.parseByte(br.readLine());
      switch(res)
      {
        case 1:
                for(Byte i=0;i<=0;i++)
                {
                  fb[i]=new Facebook();
                  fb[i].read();
                  count++;
                 }
                 break;
        case 2: 
                for(Byte i=0;i<=0;i++)
                {   
                  fb[i].display();
                 }
             break;
        case 3:  try
                 {
    
                   System.out.println("\n\nThe following are the user details of the Facebook");
                   for(Byte i=0;i<=count;i++)
                    {
                      fb[i].dispdata(); 
                    }
                   }
                    catch(Exception e)
                    {
                      System.out.println(e.toString());
                     }

                 break;
        case 4:ch=false;
             break;
    }
    
  }
}
  static void display() //normal static method
  {
    System.out.println("\n\nFacebook is social media. Which has the users more than 20 billion people around the world");
  }
}
class Donations
{
  public static int fromGovernment(int m,int n)
  {
    return m+n;
  }
}
  
