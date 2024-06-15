#include <iostream>

using namespace std;

class List{
    private:
        class Nodo{
            public:
                float dato;
                Nodo* next;
        };
        Nodo* raiz;
        int cantidadNodos;
    public:
        List(){
            raiz = NULL;
            cantidadNodos = 0;
        }

        void insertar(int datoIngre){
            Nodo* nuevo = new Nodo();
            Nodo* recorrido = raiz;
            nuevo->dato = datoIngre;
            if(cantidadNodos <= 1){
                nuevo->next = raiz;
                raiz = nuevo;
                cantidadNodos++;
            }
            else{
                for(int i = 1; i <= cantidadNodos-1;i++){
                    if(i>1){
                        recorrido = recorrido->next;
                    }
                }
                Nodo* auxNodo = recorrido->next;
                recorrido->next = nuevo;
                nuevo->next = auxNodo;
                cantidadNodos++;
            }
        }

        void borrar();

        void imprimir(){
            Nodo* recorrido = raiz;
            for (int i = 0;i < cantidadNodos; i++){
                cout<<recorrido->dato<<"-";
                recorrido = recorrido->next;
            }
        }
};


int main(){
    List* lista = new List();
    int opcion;
    while (opcion != 4)
    {
        cout<<"Menu: "<<endl;
        cout<<"1. Insertar dato "<<endl;
        cout<<"2. Borrar dato "<<endl;
        cout<<"3. Imprimir "<<endl;
        cout<<"4. Salir "<<endl;
        cout<<"Elija una opcion "<<endl;
        cin>>opcion;
        switch (opcion)
        {
        case 1:
            int dato;
            cout<<"Ingrese el dato que desea guardar: ";
            cin>>dato;
            lista->insertar(dato);
            break;
        case 3:
            lista->imprimir();
            cout<<endl;
            break;     
        default:
            break;
        }
    }
}