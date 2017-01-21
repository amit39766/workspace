/*
ID: your_id_here
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

class test1 {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("H:\\workspace\\Java File Operations\\src\\test.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("H:\\workspace\\Java File Operations\\src\\test.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
						  // Get line, break into tokens
    int i1 = Integer.parseInt(st.nextToken());    // first integer
    int i2 = Integer.parseInt(st.nextToken());    // second integer
    out.println(i1+i2);                           // output result
    StringTokenizer sN=new StringTokenizer(f.readLine());
    int i=1;
    while(sN.hasMoreTokens()){
    	out.println("Token "+i+++": "+sN.nextToken());
    }
    out.close();                                  // close the output file
  }
}