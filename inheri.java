import java.util.Scanner;
class one   {
int d=5;
int count=1;
one(){
System.out.println("class one "+d);
System.out.println("clas -----  one on constecter");
System.out.println("count = "+count);
count++;
d=500;

}
    static{
        System.out.println("clas ----- one on stitic");
    }
}
class two extends one{
    int two=1200000001;
    two(){
    System.out.println("class two "+d);
System.out.println("clas  ------ two on constecter");
d=1223;
    }
        static{
        System.out.println("clas -----two on stitic");
    }
}
class twoo extends one{
    twoo(){
    System.out.println("class twoo "+d);
    }
}
 class inheri{
  public static void main(String[] age){
      int d=12;
  one o= new one();
//   System.out.println("ok");
  two t= new two();
  twoo tt= new twoo();
    System.out.println("class main-- "+d);

  }
}