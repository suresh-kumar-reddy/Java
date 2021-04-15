import java.io.*;
import java.util.Scanner;
class Person
{
    String persName;
    public short persId;
    private long phoneNum;
    String persFrom;
    
    String persDesignation;
    
    Person(Short persId) 
    {   
          setId(persId); 
    } 
    public void setId(Short s) 
    { 
      persId = s; 
    } 
    public Short getId() 
    { 
      return persId; 
    } 
    Person()
    {
      persName=" ";
      persId=0;
      phoneNum=0;
    }
    Person(String persName)
    {
      this.persName=persName;
    }
    Person(String persName, Long phoneNum)
    {
      this(persName); // constructor chaining
      this.phoneNum=phoneNum;
    }
    
    public void read()
    {
      InputStreamReader isr=new      InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
     try
    {
        System.out.println("\nEnter the Person Name");
        persName=br.readLine();
        System.out.println("\n Enter the Phone Number");
        phoneNum=Long.parseLong(br.readLine());
        System.out.println("\nEnter the Person ID");
        persId=Short.parseShort(br.readLine());
        System.out.println("\nEnter the Person from");
        persFrom=br.readLine();
        System.out.println("\nEnter the Person designation");
        persDesignation=br.readLine();
     }
     catch(Exception e)
     {
       System.out.println(e.toString());
     }

    }
    public void display()
    {
       System.out.println("The details are as follows............."); 
      System.out.println("Person Name ="+persName);
      System.out.println("Person Phone Number ="+phoneNum);
      System.out.println("Person ID="+persId);
      System.out.println("Person from="+persFrom);
      System.out.println("Person Designation="+persDesignation);
      
      
    }
}
class Staff extends Person
{
    private int staffId; 
    Staff(String persName,int staffId) 
    { 
      super(persName); 
      setStaffId(staffId); 
    } 
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }  public void read()
    
    {
      try
      {
      super.read();
           InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
   
      System.out.println("Enter rhe Staff ID");
      staffId=Integer.parseInt(br.readLine());
      
      }catch(Exception e)
     {
     System.out.println(e.toString());
     }

    }
 
    public void display() 
    { 
      super.display(); 
      System.out.println("Staff Id is  = " + staffId); 
    } 
}
class TemporaryStaff extends Staff
{
    private int days; 
    private int hoursWorked; 
    TemporaryStaff(String sname,int id,int days,int hoursWorked) 
    {      
       super(sname,id); 
       this.days  = days; 
       this.hoursWorked = hoursWorked; 
    } 
    public void read()
    {
      try
      {
      super.read();
      
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      System.out.println("Enter temporary Staff working days");
      days=Integer.parseInt(br.readLine());
      System.out.println("Enter the hours worked");
      hoursWorked=Integer.parseInt(br.readLine());
      }
      catch(Exception e)
     {
     System.out.println(e.toString());
     }

    }
    public int Salary() 
    { 
        int salary = days * hoursWorked * 50;
        
      return salary;
    } 
    
    public void display() 
    { 
      super.display(); 
      System.out.println("No. of Days = " + days); 
      System.out.println("No. of Hours Worked = " + hoursWorked); 
      System.out.println("Total Salary = " + Salary()); 
    } 
}
public class MultiLevelInheritance
{
    public static void main(String args[])throws IOException
    {
        TemporaryStaff ts = new TemporaryStaff("suresh",20,52,56);
        ts.read();
        ts.display();
    }
}