#include<iostream>

using namespace std;


int extends(const int* lista){
    int tamanioLista = sizeof(lista)/sizeof(lista[0]);
    return tamanioLista;
}

int main(){
    int list[] = {1,2};
    cout<<extends(list);
}