import java.io.*;
public class File1{
	public static void main(String args[]) throws IOException {
		File f=new File("Directory");
		f.mkdir();
		File f1=new File(f,"abc.txt");
		f1.createNewFile();
		FileWriter fw=new FileWriter(f1);
		System.out.println("First time writing");
		fw.write("Sejal is a good girl");
		fw.write("\nSejal codes in Java");
		fw.flush();
		fw.close();
		System.out.println("First writing done");
		FileWriter fw1=new FileWriter(f1);
		System.out.println("Second time writing");
		fw1.write("Sejal");
		//fw1.close();
		//fw1.close();
		FileReader fr=new FileReader(f1);
		//this method reads character by character
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		//this method reads char array so its limit is Integer. First method recommended if length of file exceeds Integer
		//char[] ch=new char[(int)f1.length()];
		//fr.read(ch);
		//System.out.print(ch);
		fw1.close();
		fr.close();
		
		
	}
}