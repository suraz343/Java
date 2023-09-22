import java.io.*;
class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f = new File("C:\\Users\\SURAJ PRAJAPATI\\OneDrive\\Desktop\\java.txt");
if(f.exists()) {
	System.out.println("file name:" +f.getName());
	System.out.println("file location:" +f.getAbsolutePath());
	System.out.println("file writeable:" +f.canWrite());
	System.out.println("file readable:" +f.canRead());
	System.out.println("file Size:" +f.length());
//	System.out.println("file Size:" +f.delete());
	
}
else {
	System.out.println("file does not exists");
}
	}

}
