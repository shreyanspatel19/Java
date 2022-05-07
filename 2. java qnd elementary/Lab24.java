import java.util.Scanner;
 class Lab24{
public static void main(String[] age){
int s1,s2,s3,s4,s5;
double pr;
System.out.println("enter the 5 subject mark :- ");;
Scanner s =new Scanner(System.in);
System.out.println("first:-");
s1=s.nextInt();
System.out.println("second:-");
s2=s.nextInt();
System.out.println("third:-");
s3=s.nextInt();
System.out.println("forth:-");
s4=s.nextInt();
System.out.println("five:-");
s5=s.nextInt();

pr=(s1+s2+s3+s4+s5)/5;

System.out.println("your pr is "+pr);

}
}