import java.util.Scanner;
class Lab54{
    public static void main(String[] args){
        int n,prime;
        System.out.print("enter the number :- ");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        prime=check(n);
        if(prime==1)
        System.out.println("prime number "+n);
        else
        System.out.println("Not  prime number "+n);
        
    }
    public static int check(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
            return 0;
            
        }
        return 1;
    }
}