import java.util.Scanner;
 class Lab34{
    public static void main(String[] age){
    int s1,s2,s3,s4,s5,pr;
    System.out.println("enter the five subject mark:- ");
    Scanner s=new Scanner(System.in);
    s1=s.nextInt();
    s2=s.nextInt();
    s3=s.nextInt();
    s4=s.nextInt();
    s5=s.nextInt();
    pr=(s1+s2+s3+s4+s5)/5;
        if(pr<35){
            System.out.println("your are fail");
        }
        else if(pr>35&&pr<45){
            System.out.println("your are pass class");
        }
        else if(pr>45&&pr<60){
            System.out.println("your are second class");
        }
        else if(pr>60&&pr<70){
            System.out.println("your are first class");
        }
        else{
            System.out.println("your are distinction");
        }
    }
}