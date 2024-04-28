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
to do
- Append y clase : Terminados y funcionando
- Clear : Terminados y funcionando
- extend
*/

class List{
    private:
        int *lista;
        int size;
        int *listAux;
    public:
        List(){
            size = 0;
            lista = new int[size];
        }


        void append(int elemento){            
            listAux = new int[size+1];
            for(int i=0; i<size; i++){
                *(listAux+i)=*(lista+i);
            }
            *(listAux+size)=elemento;
            delete[] lista;
            lista = listAux;
            size++;
        }

        void clear(){
            delete[] lista; // quiero quitarme los elementos de esa lista asi que libero su espacio
            size = 0;
            lista = nullptr; //apunta a un puntero vacio segun internet
        }

        // para verificar que si imprime //intento 1000 :)
        void imprimir(){
            for(int i = 0;i<size;i++){
                cout<<*(lista+i)<<endl;
            }
        }

        int getDato(int index){
            return *(lista+index);
        }

        void extend(List &listaToExtend){ 
            //conocer el tamaño total de la lista
            int sizeList = listaToExtend.size;
            //tamaño total de la nueva lista
            int sizeExtendedList = size+sizeList;
            int *extendedList = new int[sizeExtendedList];
            int posicionadorAuxUltim = 0;
            int IndexAuxiliarList = 0;
            for (int i = 0; i < size; i++)
            {
                *(extendedList+i)=lista[i];
                //cout<<extendedList[i]<<endl;
                posicionadorAuxUltim++;
            }
            for (int i = posicionadorAuxUltim; i < sizeExtendedList; i++)
            {   
                *(extendedList+i) = listaToExtend.getDato(IndexAuxiliarList);
                IndexAuxiliarList++;
            }
            
            //imprimir ista
            for(int i = 0; i < sizeExtendedList;i++){
                cout<<"Posicion: "<<i+1<<" -> "<<*(extendedList+i)<<endl;
            }
        }
        /*
        No lo hemos visto pero utilizare un algoritmo de busqueda de elementos 
        en este caso me facilitara la busqueda de un elemento, el algoritmo que 
        usare es el de busqueda binaria.
        voy a comentar cada linea porque despues se me olvida, no la utilizo 
        demasiado, la utilize dos veces si no menos en algunos proyectos propios
        en python
        */

        int count(int elementToSearch){
            cout<<"In progress...";
        }

        int len(){
            return size;
        }

};

int main(){
    List list, list2;
    list.append(1000);
    list.append(200);
    list.append(12);
    list2.append(1);
    list2.append(2);
    list2.append(3);
    list2.append(300);
    //list.imprimir();
    list.extend(list2);
    cout<<"Tamaño lista 1: "<<list.len()<<endl;
    cout<<"Tamaño lista 2: "<<list2.len()<<endl;
    //eliminacion
    list.clear();
    list2.clear();

    cout<<"Tamaño lista 1: "<<list.len()<<endl;
    cout<<"Tamaño lista 2: "<<list2.len()<<endl;
    //list.imprimir();
}


//retornando multiples valores
/*
#include <stdio.h>

// Function to return multiple values using pointers
void initialize(int *a, int *b, char *c)
{
	*a = 10;
	*b = 20;
	*c = 'A';
}

// Return multiple values from a function in C
int main(void)
{
	int a, b;
	char c;

	initialize(&a, &b, &c);
	printf("a = %d, b = %d, c = %c", a, b, c);

	return 0;
}
*/

//forma de retornar arrays
/*

*/