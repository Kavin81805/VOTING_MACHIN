#include <iostream>
using namespace std;

class Details{
public:
   int wn,np;
   string area,head;
   
   void Input(){
    cout << "ENTER THE WARD NUMBER : ";
    cin >> wn;
    cout <<"ENTER THE AREA NAME : ";
    cin >> area;
    cout << "ENTER THE NUMBER OF PEOPLES : ";
    cin >> np;
    cout << "ENTER THE NAME OF THE HEAD OF ELECTION COMMISSION : ";
    cin >> head;
   }
};
class Voting_System{
private:

    Details D;
    int count = 0;
    int muss = 0;int hit = 0;int kim =  0;int fran = 0;
    char T;

public:
   
    Voting_System(Details details) : D (details){}
    void Vote(){
       for (int i = 1; i < D.np; i++)
       {
          count++;
          V_input();
       }
       Result();   
    }

    void V_input(){
        cout<<"\nVOTING PAGE\n";
        cout<<"COUNT : "<<count;
        cout<<"\n| MUSSOLINI PRESS 1 | HITLER PRESS 2 | KIM JONG UN PRESS 3 | FRANCISCO FRANCO PRESS 4 |\n";
        cin>>T;
        switch (T) {
        case '1' :
            muss++;
            cout<<" THANKS FOR VOTEING ";
            break;
     
        case '2' :
            hit++;
            cout<<" THANKS FOR VOTEING ";
            break;

        case '4' :
            fran++;
            cout<<" THANKS FOR VOTEING ";
            break;

        case '3' :
            kim++;
            cout<<" THANKS FOR VOTEING ";
            break;

        default:
            cout<<" SOMETHING WAS WRONG ";
            break;
        } 
    }

    void Result(){ 
       cout<<"\nRESULT\n";
       cout<<"WARD NUMBER : "<<D.wn<<"\nAREA NAME : "<<D.area<<"\nNUMBER OF PEOPLE IN THIS WARD : "<<D.np<<"\nHEAD OF THE VOTE COMMISSIONER NAME : "<<D.head;
       cout<<"\n MUSSOLINI "<<muss<<"\n HITLER "<<hit<<"\n KIM JONG UN "<<kim<<"\n FRANCISCO FRANCO "<<fran;
    }
};

int main(){
        Details d;
        Voting_System v(d);
        char n;
        bool L = true;

        while(L){
        cout<<"\n| PRESS 1 IS ENTER DETAILS | PRESS 2 IS START THE VOTING |\n";
        cin>>n;
        
        switch(n){
           case '1':
           d.Input();
           break;

           case '2':
           if(d.np <=0){
            cout<<"FILL THE DETAILS FIRST SIR...!";
            L=true;
           }
           else{
           v.Vote();
           }
           default:
           L= false;
           break;
        }
        }
};
