import java.io.*;
import java.util.Scanner;
class Student 
{
	private String  studName;
	private  byte studAge;
	private long studRegNo;
	private char studGender;
        private short sub1Marks,sub2Marks,sub3Marks,sub4Marks,sub5Marks,sub6Marks;
	private float studTotalMarks;	
	private float avg;
public Student()
{
	System.out.println("Welcome to Student DATABASE System"); 
  	studName="Unknown";
   	studAge=0;

   	studRegNo=-1;
   	studGender='F';
   	sub1Marks=0;
	sub2Marks=0;
	sub3Marks=0;
	sub4Marks=0;
	sub5Marks=0;	
	sub6Marks=0;
   	studTotalMarks=0;  
}
public void read() throws IOException
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Student name");
	studName=br.readLine();
	System.out.println("Enter the Student age");
	studAge=Byte.parseByte(br.readLine());
	System.out.println("Enter the Student Register number");
	studRegNo=Long.parseLong(br.readLine());
    System.out.println("Enter the Student Gender");
	studGender=(char)br.read();
	
	


public void disp()
{
	System.out.println("\nStudent Name ="+studName);
	System.out.println("\nStudent Age ="+studAge);
	System.out.println("\nStudent Register Number ="+studRegNo);
	System.out.println("\nStudent Gender="+studGender);
	System.out.println("\nStudent Marks are="+sub1Marks);
	System.out.println("\nStudent Marks are="+sub2Marks);
	System.out.println("\nStudent Marks are="+sub3Marks);
	System.out.println("\nStudent Marks are="+sub4Marks);
	System.out.println("\nStudent Marks are="+sub5Marks);
	System.out.println("\nStudent Marks are="+sub6Marks);
	
}
	

int calc(short sub1Marks,short sub2Marks,short sub3Marks,short sub4Marks,short sub5Marks,short sub6Marks)
{
	studTotalMarks=sub1Marks+sub1Marks+sub1Marks+sub1Marks+sub1Marks+sub1Marks);
	System.out.println("\nStudent Total Marks are="+studTotalMarks);
}
int calc(long studTotalMarks)
{
	avg=((studTotalMarks/600)*100)
	System.out.println("\nStudent Average Marks are="+avg);

}
byte find(String name)
{
	
	if(studName.equals(name))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
byte find(long regNo)
{
	
	if(studRegNo==regNo)
	{
		return 1;
	}	
	else
	{
		return 0;
	}
}

byte find(float totalMarks, char gender)
{
	if(studTotalMarks >=totalMarks && studGender==gender)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
}// end of class

public class Overload
{
	public static void main(String args[]) throws IOException
	{

		BufferedReader br=new BufferedReader(new 				
		InputStreamReader(System.in));
	    	
		boolean ch=true;
		byte res,res1,b1=0;
		Student ob1=new Student();
		ob1.disp();
		Student obj[]= new Student[2];
		while(ch)
		{
			System.out.println("1. read data");
			System.out.println("2. Display data");

			System.out.println("3. Search Data");
            System.out.println("4. calculate totalMarks");
			System.out.println("6. Exit");
			
			System.out.println("Enter your choice");
			res=Byte.parseByte(br.readLine());
			
			switch(res)
			{
				case 1:					
		     			 for(byte i=0;i<2;i++)
					  	 {
						    obj[i]=new Student();
						   obj[i].read();
					   }	
					break;					   
           	        case 2 :					
				 
					for(byte i=0;i<2;i++)
					   {
						   obj[i].disp();
					   }
					   
					break;					   
			     	case 3 :
         			System.out.println("\n1. By Student Name");
					System.out.println("\n2. By Student Register Number");
					System.out.println("\n3. By Total Marks and Gender");
					System.out.println("\nEnter your choice");
					res1=Byte.parseByte(br.readLine());
		          	switch(res1)
				  	{
							
				  		case 1:
					  		String n;
					  		System.out.println("Enter the name to search");
	    						n=br.readLine();
							for(byte i=0;i<2;i++)
							{
								b1=obj[i].find(n);
								if(b1==1)
								{
									obj[i].disp();
                                                                  	break;	
				  			}
                                           		if(b1==0)
					   		{
							       System.out.println("record not available");																																			System.out.println(" record not available");
					  		}
					  		}
				       		break;
					 	 case 2:
					    	 	long regNo;
							System.out.println(" Enter the Register Number to search");
							regNo=Long.parseLong(br.readLine());
							for(byte i=0;i<2;i++)
							{
								b1=obj[i].find(regNo);
								if(b1==1)
								{
									obj[i].disp();
							                break;
								}							
							}
				        
 							if(b1==0)
					  		{
                                            			System.out.println("record not available");
					  		}
							break;	  
					 		case 3:
					 			 char gender;
								 float totalMarks; 
								 System.out.println("Enter the gender to search");
								 gender=(char)br.read();
								 System.out.println("Enter the Total Marks to search");
								 br.skip(2);
					                	 totalMarks=Float.parseFloat(br.readLine());
							
							for(byte i=0;i<2;i++)
							{
								b1=obj[i].find(totalMarks,gender);
								if(b1==1)
								{
									obj[i].disp();
									break;
								}
													
							}
				        		if(b1==0)
					   		{
                                            			System.out.println("record not available");
					  		}
				          		
						        break;
					}//end of inner switch

				       break;
  
 				       case 4:
 				       			    System.out.println("Enter the 6 subject marks");
								    sub1Marks=Short.parseShort(br.readLine());
									sub2Marks=Short.parseShort(br.readLine());
									sub3Marks=Short.parseShort(br.readLine());
									sub4Marks=Short.parseShort(br.readLine());   	
									sub5Marks=Short.parseShort(br.readLine());
									sub6Marks=Short.parseShort(br.readLine());	

 				       			for(byte i=0;i<2;i++)
							{
								obj[i].calc(sub1Marks,sub2Marks,sub3Marks,sub4Marks,sub5Marks,sub6Marks);
													
							}
				        	
					        break;
	case 5:


	      			       ch=false;
				      
			  }//end of outer switch
			
		}// end of while
			
		}// end of main
	}//end of class