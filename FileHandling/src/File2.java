import java.io.*;

public class File2 {

	public static void main(String[] args) throws IOException {
		File f = new File("Directory1");
		f.mkdir();
		File f1 = new File(f, "abc.txt");
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Sejal is a good girl");
		bw.newLine();
		bw.write("Sejal codes in Java");
		bw.close();
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
		// TODO Auto-generated method stub

	}

}
