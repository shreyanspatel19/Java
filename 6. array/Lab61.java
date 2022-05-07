import java.util.Scanner;
 class Lab61{
  public static void main(String[] age){
    int n,odd=0,even=0;
    System.out.print("length of number :- ");
    Scanner s = new Scanner(System.in);
    n=s.nextInt();
    System.out.println("enter the numers :- ");
    int number[] = new int[n];

  for(int i=0;i<n;i++){
    number[i]=s.nextInt();
    if(number[i]%2==0){
      even++;
    }
    else{
      odd++;
    }
  }
  System.out.println("even number is :- "+even);
  System.out.println("odd number is :- "+odd);
  }
}