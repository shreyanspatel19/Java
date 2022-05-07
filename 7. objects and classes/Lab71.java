import java.util.Scanner;
 class Lab71{
  public static void main(String[] age){
    Candidate c = new Candidate();
    c.getCandidatedetails();
    c.dispalyCandidatedetails();
  }
}
class Candidate{
  int candidate_id;
  String candidate_name;
  int candidate_age;
  double candidate_weight;
  double candidate_height;
  Scanner s = new Scanner(System.in);

   void getCandidatedetails(){
    System.out.print("enter Candidate_id number :- ");
    candidate_id = s.nextInt(); 
    s.nextLine();

    System.out.print("enter Candidate_name name :- ");
    candidate_name = s.nextLine();

    System.out.print("enter Candidate_age       :- ");
    candidate_age = s.nextInt();

    System.out.print("enter Candidate_weight    :- ");
    candidate_weight = s.nextDouble();

    System.out.print("enter Candidate_height    :- ");
    candidate_height = s.nextDouble();
  }

  void dispalyCandidatedetails(){
    System.out.println("enter Candidate_id number :- "+candidate_id);
    System.out.println("enter Candidate_name name :- "+candidate_name);
    System.out.println("enter Candidate_age       :- "+candidate_age);
    System.out.println("enter Candidate_weight    :- "+candidate_weight);
    System.out.println("enter Candidate_height    :- "+candidate_height);
  }
}