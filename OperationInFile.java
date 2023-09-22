import java.io.*;
class OperationInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
FileReader f = new FileReader("C:\\Users\\SURAJ PRAJAPATI\\OneDrive\\Desktop\\suraj.txt");
try {
	int i;
	while((i=f.read())!=-1) {
System.out.print((char)i);		
	}
	
		}
finally {
	f.close();
}
System.out.println("successfully wrote in file");
}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
