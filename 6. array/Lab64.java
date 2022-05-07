import java.util.Scanner;
 class Lab64{
  public static void main(String[] age){
      int temp;
  Scanner s = new Scanner(System.in);
  System.out.println("enter the numbers :- ");
  int number[]=new int[10];
    for (int i=0;i<number.length;i++){
        number[i]=s.nextInt();
    }
    for (int i=0;i<number.length-1;i++){
        for (int j=0;j<number.length-1;j++){
            if(number[j]>number[j+1]){
                temp=number[j];
                number[j]=number[j+1];
                number[j+1]=temp;
            }
        }   
    }
    
    for (int i=0;i<number.length;i++){
        System.out.print(" "+number[i]);
    }
  }
}