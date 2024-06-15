#include <iostream>

using namespace std;

class Pila{
    private:
        int cima;
        int auxVar;
        int estaLLena(){
            return cima == tamanioLista-1;
        }
        int tamanioLista;
        int *pila;
    public:
        Pila(int tamanioLista){
            tamanioLista= tamanioLista;
            pila = new int[tamanioLista];
            cima = -1;
        }
        int Pvacia(){
            return cima == -1;
        }
        
        void quitarP(){
            if(Pvacia()){
                cout<<"No se pueden extraer elementos dado que la pila esta vacia: "<<endl;
            }
            else{
                cout<<"Se elemino este numero de la pila: "<<pila[cima]<<endl;
                cima--;
            }
        }

        void insertarP(int elemento){
            if(estaLLena()){
                cout<<"Se deben eliminar elementos de la pila debido a que esta llena"<<endl;
            }
            else{
                cima++;
                pila[cima] = elemento;
            }
        }

        void imprimirP(){
            if(Pvacia()){
                cout<<"Pila vacia llenela para poder imprimir datos"<<endl;
            }
            for(int i = cima; i >=0 ; i--){
                cout<<"Elemento de la pila: "<<pila[i]<<endl;
            }
        }
        
};
int main(){
    Pila pila(2);
    pila.insertarP(1);
    pila.insertarP(2);
    pila.insertarP(3);
    pila.insertarP(4);
    pila.insertarP(5);
    pila.insertarP(6);
    pila.insertarP(7);
    pila.insertarP(8);
    pila.insertarP(9);
    pila.insertarP(10);
    pila.imprimirP();
    pila.quitarP();
    pila.imprimirP();
}