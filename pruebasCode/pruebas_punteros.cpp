#include <iostream>

using namespace std;

int main(){
    int lista[]= {1,3,5,7,1};
    int *posciciones;
    int size = 0;
    for(int i = 0; i<6;i++){
        if(lista[i] == 1){
            posciciones = new int[size+1];
            posciciones[size-1] = i;
            size++;
        }
    }
    for(int i = 0;i<size;i++){
        cout<<posciciones[i]<<endl;
    }
}   