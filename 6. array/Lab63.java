import java.util.Scanner;

 class Lab63{
  public static void main(String[] age){
  int n,find;
  System.out.println("length of the array - ");
  Scanner s = new Scanner(System.in);
  n=s.nextInt();
  System.out.println("enter the numbers :- ");
  int number[]=new int[n];
    for (int i=0;i<number.length;i++){
        number[i]=s.nextInt();
    }
    System.out.println("enter the find number :- ");
    find=s.nextInt();
    for(int i=0; i<number.length;i++){
        if(find==number[i]){
            System.out.println("yes, number "+find+" available");
        }
    }
  }
}