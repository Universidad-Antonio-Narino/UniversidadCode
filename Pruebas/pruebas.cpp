#include <iostream>

using namespace std;
int main(){
    int *lista = NULL,numero;
    cout<<"Tamanio: "<<endl;
    cin>>numero;
    lista = new int[numero];
    for(int i = 0;i<numero;i++){
        cout<<"Ingrese un numero: ";
        int numeroInlist;
        cin>>numeroInlist;
        lista[i] = numeroInlist;
    }
    for(int i = 0;i<numero;i++){
        cout<<lista[i]<<" ";
    }
}
