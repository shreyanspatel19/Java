import java.util.Scanner;
 class Lab62{
  public static void main(String[] age){
  int n,sum=0;
  System.out.print("length of array :- ");
  Scanner s = new Scanner(System.in);
  n=s.nextInt();
    System.out.println("enter the numbers :- ");
    int number[]=new int[n];
    for (int i=0;i<number.length;i++){
        number[i]=s.nextInt();
        if(number[i]%3==0||number[i]%5==0){
            sum=number[i]+sum;
        }
    }
    System.out.println("sum of the numer divisible by 3 or 5 -- "+sum);
  }
}