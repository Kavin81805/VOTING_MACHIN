import java.util.Scanner;

public class voting_mesin {     
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Details D = new Details(sc);
    VoteSystem v = new VoteSystem(sc,D);
    boolean Loop = true;
    
    while (Loop) {

    System.out.println("ENTER 1 IS EDIT THE DETAILS || ENTER 2 IS START VOTING ");
    int t = sc.nextInt();
    sc.nextLine();
    switch (t) {
        case 1:
            D.INPUT();
            break;
        case 2:
        if(D.np <=0){
            System.out.println("PLEAS FILL THE DETAILS FIRST...!");
        }
        else{
            v.vote();
            Loop = false;
        }
            break;
        default: 
            Loop = false;
            break;
   }
  }
 }
}

class Details {

     Scanner sc;
     Details(Scanner scanner){
      this.sc = scanner;
     }
    int wn,np;
    String area,head;
    void INPUT(){
    System.out.print("ENTER THE WARD NUMBER : ");
    wn = sc.nextInt();
    sc.nextLine();
    System.out.print("ENTER THE AREA NAME : ");
    area = sc.nextLine();
    System.out.print("ENTER THE NUMBER OF PEOPLE :");
    np = sc.nextInt();
    sc.nextLine();
    System.out.print("ENTER THE NAME HEAD OF THE VOTING DEPARTMENT : ");
    head = sc.nextLine();
  }  
}

class VoteSystem {

    Details D;
    Scanner sc;
    VoteSystem ( Scanner scanner , Details details){
          this.sc = scanner;
          this.D = details;
    }
    char c ;
    int count ;
    int muss,hit,fran,kim;
    boolean F = true;
    
void vote(){
    for(int i = 1;i<=D.np;i++){  
      count = i;
      v_input();
    }
    Result();
}

void v_input(){
    System.out.println("\nVOTING PAGE\n");
    System.out.println("\nNUMBER"+count);
    System.out.println("\nMUSSOLINI PRESS 1\nHITLER PRESS 2\nFRANCISCO FRANCO PRESS 3\nKIM JONG UN PRESS 4");
    c = sc.nextLine().charAt(0);
    
    switch (c) {
        case '1' :
            muss++;
            System.out.println(" THANKS FOR VOTEING TO MUSSOLINI ");
            break;
     
        case '2' :
            hit++;
            System.out.println(" THANKS FOR VOTEING TO HITLER ");
            break;

        case '3' :
            fran++;
            System.out.println(" THANKS FOR VOTEING TO FRANCISCO FRANCO ");
            break;

        case '4' :
            kim++;
            System.out.println(" THANKS FOR VOTEING TO KIM JONG UN ");
            break;

        default:
            System.out.println(" SOMETHING WAS WRONG ");
            break;
        } 
}

void Result(){
      System.out.println("\nRESULT\n");
      System.out.println("HEAD NAME : "+D.head);
      System.out.println("AREA : "+D.area);
      System.out.println("WARD NUMBER : "+D.wn+"\n");
      System.out.println("MUSSOLINI : "+muss+" VOTE");
      System.out.println("HITLER : "+hit+" VOTE");
      System.out.println("FRANCISCO FRANCO : "+fran+" VOTE");
      System.out.println("KAVINKIM JONG UN : "+kim+" VOTE");
}
}