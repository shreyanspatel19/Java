import java.util.Scanner;
 class Lab92{
  public static void main(String[] age){
    Student s[]=new Student [5];
    for(int i=0;i<5;i++){
      s[i]=new Student();
      s[i].Getstudentdetails();
    }

     for(int i=0;i<5;i++){
      s[i].Displayresult();
      System.out.println();
    }
  }
}
class Student{
   long enrollment_no;
   String student_name;
   int semester;
   double cpi;
   Scanner s= new Scanner(System.in);
   void Getstudentdetails(){
     System.out.print("enter enrollment_no :- ");
     enrollment_no=s.nextLong();
     s.nextLine();
    System.out.print("enter student_name :- ");
     student_name=s.nextLine();
     System.out.print("enter semester :- ");
     semester=s.nextInt();
    System.out.print("enter cpi :- ");
    cpi=s.nextDouble();
   }

  void Displayresult(){
   System.out.println(" enrollment_no :- "+enrollment_no);
     System.out.println(" student_name  :- "+student_name);
     System.out.println(" semester      :- "+semester);
     System.out.println(" cpi           :- "+cpi);

   }
}
