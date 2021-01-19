#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    string m,concat="h";
    int count = 0;
    bool check = true;
    cin>>m;
     for(int i=0;i<m.length() && check;i++){
       if(m[i]=='e'){
         count=count+1;
       }
       else if(m[i]=='y'){
          check = false;
       }
     }
     for(int j=0;j<count*2;j++){
        
       concat = concat + "e";
     }
     cout<<concat+"y";  
  }
