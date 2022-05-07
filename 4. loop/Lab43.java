import java.util.Scanner;
 class Lab43{
    public static void main(String[] age){
        int n;
        System.out.println("enter the number :- ");
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("this number is not prime ");
                break;
            }
            if(i==n-1){
                System.out.println("this number is  prime ");
            }
       }
    }
}