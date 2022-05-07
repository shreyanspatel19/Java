import java.util.Scanner;
 class selection{
  public static void main(String[] age){
   int temp;
  Scanner s = new Scanner(System.in);
  System.out.println("enter the numbers :- ");
  int number[]=new int[5];
    for (int i=0;i<number.length;i++){
        number[i]=s.nextInt();
    }
    for (int i=0;i<number.length-1;i++){
        for (int j=i+1;j<number.length;j++){
            if(number[i]>number[j]){
                temp=number[i];
                number[i]=number[j];
                number[j]=temp;
            }
        }   
    }
    
    for (int i=0;i<number.length;i++){
        System.out.print(" "+number[i]);
    }
  }
}