import java.io.*;

class BCA implements Serializable
{
	private int regno;
	private String name;
	private float java;
	private float java_lab;

	public void read()throws IOException{
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("\n\nEnter the registration number: ");
			regno=Integer.parseInt(br.readLine());
			System.out.println("Enter the name: ");
			name=br.readLine();
			System.out.println("Enter the marks in java: ");
			java=Float.parseFloat(br.readLine());
			System.out.println("Enter the marks in java lab: ");
			java_lab=Float.parseFloat(br.readLine());
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}//end of read function

	public int getregno() {
        return this.regno;
    }
    public String getname(){
    	return this.name;
    }
    public float getjava(){
    	return this.java;
    }
    public float getjava_lab(){
    	return this.java_lab;
    }


	@Override
	public String toString() {
		return new StringBuffer("Reg No. : ").append(this.regno)
				.append("Name : ").append(this.name)
				.append("Java Marks: ").append(this.java)
				.append("Java Lab Marks: ").append(this.java_lab).toString();
	}

}//end of class BCA

public class FilesSample
{
	public static void main(String[] args)throws IOException
	{
		try
		{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		byte choice=0,n=1,temp=0;
		BCA obj[] = new BCA[n];
		BCA readobj[] = new BCA[n];
		FileInputStream fis=new FileInputStream("D://4BCA//JAVA Sample.txt");
		FileOutputStream fos=new FileOutputStream("D://4BCA//Java Sample.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		ObjectInputStream ois=new ObjectInputStream(fis);
		do{
			try{
				System.out.println("\n\nMENU");
				System.out.println("1.Enter details");
				System.out.println("2.Display details");
				System.out.println("3.Exit");
				System.out.println("Enter your choice: ");
				choice=Byte.parseByte(br.readLine());
				switch(choice)
				{
					case 1 : obj[n-1]=new BCA();
							 obj[n-1].read();
							 oos.writeObject(obj[n-1]);
							 n++;
							 break;
					case 2 : System.out.println("\nWhich detail/object you want display ??\n");
							 for(int i=0;i<n-1;i++)
							 {
							 	readobj[i]=(BCA)ois.readObject();
							 	System.out.println(readobj[i].toString());
							 }
							 break;
					case 3 : break;
					default : System.out.println("Wrong Choice !!!");
							  break;
				}//end of switch
			}catch(NumberFormatException e)
			{
				System.out.println("\n\nEnter a valid input !!!");
			}
		}while(choice!=3);
		fis.close();
		fos.close();
		oos.close();
		ois.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}//end of class filesample