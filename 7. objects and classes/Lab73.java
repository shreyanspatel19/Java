import java.util.Scanner;
 class Lab73{
  public static void main(String[] age){
  Employee e = new Employee();
  e.getemployeedetails();
  e.displayemployeedetails();
  }
}

class Employee{
    int employee_id;
    String employee_name;
    String designation;
    int salary;
    int age;
    Scanner s = new Scanner(System.in);
    void getemployeedetails(){
      System.out.print("enter employee id   :- ");
      employee_id=s.nextInt();
      s.nextLine();
      System.out.print("enter employee name :- ");
      employee_name=s.nextLine();
      System.out.print("enter  designation  :- ");
      designation=s.nextLine();
      System.out.print("employee salary     :- ");
      salary=s.nextInt();
      System.out.print("enter employee age  :- ");
      age=s.nextInt();
    }
    void displayemployeedetails(){
      System.out.println();
      System.out.println(" employee name :- "+employee_name);
      System.out.println(" employee id   :- "+employee_id);
      System.out.println("  designation  :- "+designation);
      System.out.println("employee salary     :- "+salary);
      System.out.println(" employee age  :- "+age);
    }
}