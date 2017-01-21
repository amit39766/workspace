import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class PleaseTest {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      PriorityQueue<Student> qu=new PriorityQueue<Student>(10,new Comparator<Student>(){
          public int compare(Student s1,Student s2){
        	  if((s1.getCgpa()==s2.getCgpa()) && (s1.getFname().equals(s2.getFname())))
                  return (s1.getToken()>s2.getToken())?1:-1;
              else if(s1.getCgpa()==s2.getCgpa()){
                  return s1.getFname().compareTo(s2.getFname());
              }
              else{
                  return s1.getCgpa()<(s2.getCgpa())?1:-1;
              }
          }

      });
      while(totalEvents>0){
         String event = in.next();
         if(event.equals("ENTER")){
             String name=in.next();
             double cgp=in.nextDouble();
             int id=in.nextInt();
             qu.add(new Student(id,name,cgp));
         }
          else{
              if(qu.isEmpty())
                  System.out.println("EMPTY");
              else{
            	     qu.poll();
             }
          }
    totalEvents--;
    }
      while(true) {
          Student unServed = qu.poll();
          if(unServed == null) {
              break;
          }
          System.out.println(unServed.getFname()+" Id: "+unServed.getToken());
      }
}
}
