import java.util.Scanner;
 class Lab33{
    public static void main(String[] age){
    int a,b,c,larg;
    System.out.println("enter the three number ;- ");
    Scanner s= new Scanner(System.in);
    System.out.println("enter the first number :");
    a= s.nextInt();
    System.out.println("enter the second number :");
    b = s.nextInt();
    System.out.println("enter the third number :");
    c = s.nextInt();
    if(a>b){
        if(c>a){
        System.out.println("so c is larg"+c);
        }
        else{
            System.out.println("so a is larg "+a);
        }
    }
    else {
        if(c>b){
            System.out.println("so c is larg"+c);
         }
        else{
                System.out.println("so b is larg "+b);
         }
    }
}
}