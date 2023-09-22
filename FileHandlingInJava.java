import java.io.*;

import java.util.Scanner;

class FileHandlingInJava {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("Enter the operation which you want to perform:");
System.out.println("1.Create a new file\n2.Write data into file\n3.Read the data of the file"
		+ "\n4.Append data into the file\n5.Delete the file");
boolean m = true;
while (m != false) {
System.out.println("\nEnter your choice here:");
Scanner c = new Scanner(System.in);
int choice = c.nextInt();

switch(choice) {
case 1:
	File f = new File("C:\\Users\\SURAJ PRAJAPATI\\OneDrive\\Desktop\\suraj.txt");

	if(f.createNewFile()) {
		System.out.println("file create successfully");
	}
	else {
		System.out.println("file already exits");
	}
	break;
case 2:
try {
	FileWriter w = new FileWriter("C:\\Users\\SURAJ PRAJAPATI\\OneDrive\\Desktop\\suraj.txt");
	try { 
		w.write("kamal prakash sir teaches us java programming language\n");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter what you want to write in the file");
		String sp = s.nextLine();
		w.write(sp);
		
		
	}
	finally {
		w.close();
	}
	System.out.println("successfully written");
}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("Error occur while writing data");
		
	}
break;

case 3:
	try {
FileReader r = new FileReader("C:\\Users\\SURAJ PRAJAPATI\\OneDrive\\Desktop\\suraj.txt");
try {
int i;
while((i=r.read())!=-1) {
System.out.print((char)i);		
}

	}
finally {
r.close();
}

}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("Error occur while reading data");
	}
	break;
case 4:
	try {
		FileWriter p = new FileWriter("C:\\Users\\SURAJ PRAJAPATI\\OneDrive\\Desktop\\suraj.txt",true);
		try {
			System.out.println("Enter the data to be appended:");
			Scanner ap = new Scanner(System.in);
			String a = ap.nextLine();
			p.write(a);
			System.out.println(a +" appended successfully");			
		}
		finally {
			p.close();
		}
		
	}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Error occur while appending  data");
			
		}
	break;
case 5:
	File fu = new File("suraj.txt");
	if(fu.delete()) {
		System.out.println("file deleted successfully");
	}
	else {
		System.out.println("Failed to delete file");
	}
	break;
default:
	System.out.println("Invalid choice entered");
	break;

}

}	

}

	}


