import java.util.Scanner;
 class Lab67{

   public static void selection_sort(int arry[]){
      int temp;
      for(int i=0;i<arry.length;i++){
       for(int j=i+1;j<arry.length;j++){
          if(arry[i]>arry[j]){
           temp=arry[i];
           arry[i]=arry[j];
           arry[j]=temp;
          }   
       }
      }

       for (int k=0;k<arry.length;k++){
        System.out.println(" "+arry[k]);
       }
    }

  public static void main(String[] age){
     int n,temp;
     System.out.print("enter the length of arrys :- ");
     Scanner s = new Scanner(System.in);
     n=s.nextInt();
     int arry[]=new int[n];

       for(int j=0;j<arry.length;j++){
           System.out.print( j+ ":- " );
          arry[j]=s.nextInt();
       }
      selection_sort(arry);
  }
}