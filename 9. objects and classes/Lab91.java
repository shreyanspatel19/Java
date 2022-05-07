import java.util.Scanner;
 class Lab91{
  public static void main(String[] age){
    Student s=new Student();
    s.Getstudentdetails();
    Result  r= new Result();
    r.Getstudentdetails();
    r.Displayresult(s);
  
  }
}
class Student{
   long enrollment_no;
   String student_name;
   int semester;
   Scanner s= new Scanner(System.in);
   void Getstudentdetails(){
     System.out.print("enter enrollment_no :- ");
     enrollment_no=s.nextLong();
     s.nextLine();
    System.out.print("enter student_name :- ");
     student_name=s.nextLine();
     System.out.print("enter semester :- ");
     semester=s.nextInt();
   }

  void Displyresult(){
   System.out.println(" enrollment_no :- "+enrollment_no);
     System.out.println(" student_name  :- "+student_name);
     System.out.println(" semester      :- "+semester);
   }
}
class Result{
   double cpi;
   double spi;
   Scanner s= new Scanner(System.in);
   void Getstudentdetails(){
    System.out.print("enter cpi :- ");
    cpi=s.nextDouble();
    System.out.print("enter spi :- ");
    spi=s.nextDouble();
  }
  public void Displayresult(Student s){
    s.Displyresult();
     System.out.println(" cpi           :- "+cpi);
     System.out.println(" spi           :- "+ spi);
    
  }
}