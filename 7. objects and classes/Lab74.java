import java.util.Scanner;
 class Lab74{
  public static void main(String[] age){
  student s = new student();
  s.getstudentdetails();
  s.displaystudentdetails();
  }
}

class student{
    int Enrollment_no;
    String student_name;
    int semester;
    int cpi;
    int spi;
    Scanner s = new Scanner(System.in);
    void getstudentdetails(){
      System.out.print("enter Enrollment_no  :- ");
      Enrollment_no=s.nextInt();
      s.nextLine();
      System.out.print("enter student_name :- ");
      student_name=s.nextLine();
      System.out.print("enter  semester  :- ");
      semester=s.nextInt();
      System.out.print("  CPI     :- ");
      cpi=s.nextInt();
      System.out.print("  SPI     :- ");
      spi=s.nextInt();
    }
    void displaystudentdetails(){
      System.out.println();
      System.out.println(" Enrollment_no  :- "+Enrollment_no);
      System.out.println(" student_name :- "+student_name);
      System.out.println("  semester  :- "+semester);
      System.out.println("  CPI     :- "+cpi);
      System.out.println("  SPI     :- "+spi);
    }
}