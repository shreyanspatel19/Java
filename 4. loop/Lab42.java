import java.util.Scanner;
 class Lab42{
    public static void main(String[] age){
        int f,factorial=1;
        System.out.println("enter the number to find factorial:- ");
        Scanner s = new Scanner(System.in);
        f=s.nextInt();

        for(int i=1;i<=f;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial = "+factorial);
    }
}