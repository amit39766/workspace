package amit.diu;
import java.io.*;

public class FileOperation {

	public static void main(String[] args) throws IOException {
//		//File fd=new File("E:stdinout");
//		try {
//			fd.createNewFile();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		// TODO Auto-generated method stub
		File f=new File("output.txt");
		if(!f.exists())
			f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("আমারো পরোনো যাহা চায় তুমি তাই গো , তুমি তাই");
		fw.flush();
		fw.close();
		System.out.println("আমি তোমাকে নিয়ে যে কত স্বপ্ন দেখেছি , তা তোমাকে আমি কি করে যে বোঝাবো  বল এক বার যে তুমি আমাকে ভালবাসো");
		
		
		
	}

}
/*
 *File I/O
 *File
 *FileWriter
 *FileReader
 *BufferedWriter
 *BufferedReader
 *PrintWriter
 *
 */