#include <iostream>

using namespace std;


class ListaEnlazada{
    private:
        class Nodo{
            public:
                int dato;
                Nodo* siguiente;
        };
        Nodo* raiz;
        int cantidadNodos;
    public:
        ListaEnlazada(){
            raiz = NULL;
            cantidadNodos = 0;
        }

        void insertar(int datoX){
            Nodo* nuevo = new Nodo();
            nuevo->dato = datoX;
            if(cantidadNodos<=1){
                nuevo->siguiente = raiz;
                raiz = nuevo;
                cantidadNodos++;
            }else{
                Nodo* recorrido = raiz;
                for(int i = 1; i<=cantidadNodos-1;i++){
                    if(i>1){
                        recorrido=recorrido->siguiente;
                    }
                }
                Nodo* aux = recorrido->siguiente;
                recorrido->siguiente = nuevo;
                nuevo->siguiente = aux;
                cantidadNodos++;
            }
        }

        void borrar(){
            Nodo* borrar;
            Nodo* recorrido = raiz;
            if(cantidadNodos==1){
                borrar = raiz;
                raiz = NULL;
                cantidadNodos--;
            }
            else if (cantidadNodos == 2)
            {
                borrar = raiz;
                raiz = borrar->siguiente;
            }else{
                for (int i = 1; i < cantidadNodos-1; i++)
                {
                    if(i > 1){
                        recorrido=recorrido->siguiente;
                    }
                }
                Nodo* auxBorrado = recorrido->siguiente;
                recorrido->siguiente = auxBorrado->siguiente;
                borrar = auxBorrado;
                cantidadNodos--;
            }
            delete borrar;
        }

        void imprimir(){
            Nodo* recorrido = raiz;
            for(int i = 1; i<=cantidadNodos;i++){
                cout<<recorrido->dato<<"-";
                recorrido = recorrido->siguiente;
            }
        }

};
int main(){
    ListaEnlazada* lista = new ListaEnlazada();
    lista->insertar(1);
    lista->insertar(2);
    lista->insertar(3);
    lista->insertar(4);
    lista->insertar(5);
    lista->insertar(6);
    lista->imprimir();
    cout<<endl;
    lista->borrar();
    lista->imprimir();
}