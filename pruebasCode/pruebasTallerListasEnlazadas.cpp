#include <iostream>

using namespace std;

class Lista{
    private:
        class Nodo{
            public:
                int dato;
                Nodo* siguiente;
        };
        Nodo* raiz;
        int cantidadNodos = 0;
    public:
        Lista(){
            raiz =NULL;// lista enlazada vacia
        } //Constructor
	    ~Lista(); //Destructor
        
        void insertarPenultimaUltima(int x){
            Nodo *nuevo = new Nodo(); //creacion del nodo
            nuevo->dato = x;//guarda el dato en la posicion
            if (cantidadNodos <= 1){
                nuevo->siguiente = raiz;
                raiz = nuevo;
                cantidadNodos++;
            }
            else{
                Nodo* recorrido = raiz;
                for (int pos = 1;pos<=cantidadNodos-1;pos++){
                    if(pos>1){
                        recorrido = recorrido->siguiente;
                    }        
                }
                Nodo* aux_next_add = recorrido->siguiente;
                recorrido->siguiente = nuevo;
                nuevo->siguiente = aux_next_add;
                cantidadNodos++;
            }
        }

        void borrarPenultimaP(){
            Nodo* borrar;
            Nodo* recorrido = raiz;
            if(cantidadNodos == 2){
                borrar =raiz;
                raiz = borrar->siguiente;
                cantidadNodos--;
            }else if (cantidadNodos>2){
                Nodo* proxNodo;
                for(int i = 1;i<cantidadNodos-1;i++){
                    if(i>1){//para el caso de 3 es necesario
                        recorrido = recorrido->siguiente;
                    }
                }
                proxNodo = recorrido->siguiente;
                recorrido->siguiente = proxNodo->siguiente;
                borrar = proxNodo;
                cantidadNodos--;
            }
            delete borrar;  
        }
        
        void imprimir(){
            Nodo* recorrido = raiz;
            cout << "Listado completo.\n";
            while (recorrido != NULL)
            {
                cout << recorrido->dato << "-";
                recorrido = recorrido->siguiente;
            }
            cout << "\n";
            cout << "Numero de nodos: " <<cantidadNodos<< endl;
        }
};

int main(){
    Lista* lista = new Lista();
    lista->insertarPenultimaUltima(1);
    lista->imprimir();
    lista->insertarPenultimaUltima(2);
    lista->imprimir();
    lista->insertarPenultimaUltima(3);
    lista->imprimir();
    lista->insertarPenultimaUltima(4);
    lista->imprimir();
    //lista->insertarPenultimaUltima(5);
    //lista->imprimir();
    lista->borrarPenultimaP();
    lista->imprimir();

    lista->borrarPenultimaP();
    lista->imprimir();
}