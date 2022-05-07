import java.util.Scanner;

abstract interface Eventlistener{
   abstract void performevent();
}
interface Mouselistener extends Eventlistener{
   public void mouseclicked();
   public void mousePressed();
   public void mouseReleased();
   public void mouseMoved();
   public void mouseDragged();
}

interface Keylistner extends Eventlistener{
public void keypressed();
public void keyReleased();
}

class EventDemo implements Mouselistener,Keylistner{
    public void mouseclicked(){
        System.out.println("mouseclicked");
     }
   public void mousePressed(){
        System.out.println("mousePressed");
     }
   public void mouseReleased(){
        System.out.println("mouseReleased");
     }
   public void mouseMoved(){
        System.out.println("mouseMoved");
     }
   public void mouseDragged(){
        System.out.println("mouseDragged");
     }
   public void keypressed(){
        System.out.println("keypressed");
     }
   public void keyReleased(){
        System.out.println("keyReleased");
     }
     public  void performevent(){
         System.out.println("performevent");
     }
}


 class Lab14_2{
  public static void main(String[] age){
  EventDemo e=new EventDemo();
  e.mouseclicked();
    e.mousePressed();
    e.mouseReleased();
    e.mouseMoved();
    e.mouseDragged();
    e.keyReleased();
    e.keypressed();
    e.performevent();
  }
}