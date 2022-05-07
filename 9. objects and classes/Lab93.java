import java.util.Scanner;
 class Lab93{
  public static void main(String[] age){
      ok k=new ok();
      ok o=new ok();
      ok okk=new ok();
      ok.okdis();

  }
}
class ok{
    static int count=0,cont=0;
    //cons..
    ok(){
        count++;
    }
  //block..
    {
        cont++;

    }
    static void okdis(){
        System.out.println("display object count :- "+count);
        System.out.println("display object cunt :- "+cont);
    }
}