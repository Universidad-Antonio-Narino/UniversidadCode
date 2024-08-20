#include <iostream>

using namespace std;

//funcion de agregar
class pruebaArrayDinamico
{
public:
    struct Nodo
    {
        int dato;
        Nodo *siguiente;
    };
    Nodo *lista = NULL;
    pruebaArrayDinamico();
    void insertarElementos(int numero);
    void mostrarLista();
};

pruebaArrayDinamico::pruebaArrayDinamico(){};

void pruebaArrayDinamico::insertarElementos(int numero){
    Nodo *newNode = new Nodo();
    newNode -> dato = numero;
    Nodo *aux1 = lista;
    Nodo *aux2;
    while (aux1 != NULL)//aux1 es NULL: Esto significa que hemos llegado al final de la lista y no hay más elementos para revisar.
    //aux1->dato < numero: Esto significa que el dato almacenado en el nodo actual (aux1->dato) es menor que el número que estamos buscando (numero), para el caso no lo quiero utilizar
    {
        aux2 = aux1;
        aux1 = aux1 ->siguiente;
    }
    if(lista == aux1){
        lista =newNode;
    }
    else
    {
        aux2->siguiente = aux1;
    }
    newNode->siguiente = aux1;
};

void pruebaArrayDinamico::mostrarLista(){
    Nodo *actual = lista;
    
    while (actual != NULL)
    {
        cout<<actual->dato<<endl;
        actual = actual->siguiente;
    }
    
}

int main(){
    string opcion;
    int numero;
    do
    {
        pruebaArrayDinamico array;
        cout<<"Desea insertar algun dato: "<<endl;
        cin>>opcion;
        if (opcion == "si")
        {
            cout<<"escriba el numero: ";
            cin>>numero;
            array.insertarElementos(numero);
            cout<<"desea ver el array: ";
            cin>>opcion;
            if(opcion == "si") array.mostrarLista();
            else opcion = "si";
        }
        
    } while (opcion != "no");
    
}