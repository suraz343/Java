import java.io.*;
class CreateFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
File f = new File("C:\\Users\\SURAJ PRAJAPATI\\OneDrive\\Desktop\\java.txt");

	if(f.createNewFile()) {
		System.out.println("file create successfully");
	}
	else {
		System.out.println("file already exits");
	}
}

	}


