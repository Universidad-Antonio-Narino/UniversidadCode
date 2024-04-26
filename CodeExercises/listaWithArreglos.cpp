#include<iostream>
using namespace std;

//Creacion de listas con arreglos
/*
este es una pequela definicion de lo que hace el programa 
primero nos piden contruir cada metodo
- append (agrega un elemento a la vez, ese parametro de este metodo)
- clear (elimina todos los elementos de la lista, por ende no recibe parametros)
- extend (recibira una lista de elementos como parametro, ese sera su unico parametro)
- count (recibe como parametro un valor a buscar, y retornara cuantas veces aparece en el array original)(buscar una manera eficiente para que no se valla a o(n)), para el aburrimiento y la eficiencia del programa utilizaremos busqueda binarias ;)
- index ()
- reverse
- len

*/

class List{
    private:
        int *lista;
        int size;
    public:
        List(){
            size = 0;
            lista =new int[size];
        }
        void append(int elemento){
            int *auxList = new int[size+1];
            for(int i = 0; i< size; i++){
                auxList[size] = lista[size];
            }
            auxList[size]=elemento;
            size++;
            delete[] lista;
            lista= auxList;
            for(int i = 0;i<size;i++)
            {
                cout<<lista[i];
            }
        }

};

int main(){
    List list;
    list.append(1);
    list.append(2);
}