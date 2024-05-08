#include<iostream>
using namespace std;

//Creacion de listas con arreglos
/*
este es una pequela definicion de lo que hace el programa 
primero nos piden contruir cada metodo
- append (agrega un elemento a la vez, ese parametro de este metodo)
- clear (elimina todos los elementos de la lista, por ende no recibe parametros)
- extend (recibira una lista de elementos como parametro, ese sera su unico parametro)
- count (recibe como parametro un valor a buscar, y retornara cuantas veces aparece en el array original)(buscar una manera eficiente para que no se valla a o(n!)), para el aburrimiento y la eficiencia del programa utilizaremos busqueda binarias, esto por si llegan a existir demasiados datos para buscar ;)
- index () : se refiere generalmente a la posición o ubicación de un elemento dentro de una estructura de datos, como un array o una lista. En C++
- reverse() : se refiere al acto de cambiar el orden de los elementos en una secuencia de datos, como una cadena de caracteres, una lista, un array o cualquier otra estructura de datos.
- len() : En C++, no existe una función len() como en Python para obtener la longitud de una cadena de caracteres o un contenedor como un array o un vector. 

to do
- Append y clase : Terminados y funcionando
- Clear : Terminados y funcionando
- extend: Terminados y funcionando
- Len : Terminados y funcionando 
*/
//todo esto es desarrollado por el grupo pero debemos anotar las definiciones, todas las pruebas estan en https://github.com/Universidad-Antonio-Narino/UniversidadCode.git
//commits de cada version subida :=)
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

        void insert(int elemento,int posicion){
            /*
            Esta funcion agregara un elemento en una posicion dada
            develop by Santiago Cardenas
            */
            listAux = new int[size+1];
            size++;
            inicio:
             if(posicion<=size)    {       
           
            for(int i=0; i<posicion-1; i++){
                listAux[i]=lista[i];
            }
            listAux[posicion-1]=elemento;
            
            for(int i=posicion; i<size; i++){
                listAux[i]=lista[i-1];
            }
            }
            else{
                cout<<"la posision indicada es mayor al tamaño de la lista\ningrese una nueva posicion: \n";
                goto inicio;
            }
            
            delete[] lista;
            lista = listAux;
           
        }

        void append(int elemento){
            /*
            Esta funcion agregara un elemento en la ultima posicion
            es el equivalente a push_back en la libreria vector
            Develop by Santiago Angel
            */            
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
            cout<<"[";
            for(int i = 0;i<size;i++){
                if(i!=size-1) cout<<*(lista+i)<<",";
                else cout<<*(lista+i);
            }
            cout<<"]";
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
            
            //imprimir lista
            for(int i = 0; i < sizeExtendedList;i++){
                cout<<"Posicion: "<<i+1<<" -> "<<*(extendedList+i)<<endl;
            }
        }


        //funcion que me organiza los elementos del array
        void sort(){
            //una manera de ordenar cada elemento es para nuestro caso es mas facil y mas eficiente que un ordenamiento lineal
            //selection sort
            int auxVar;
            for(int i = 0;i<size;i++){
            	for(int j = i+1;j<size;j++){
            		if(*(lista+i)>*(lista+j)){
						auxVar =lista[i];
						lista[i] = lista[j];
						lista[j] = auxVar;
					}
				}
				
			}
        }

        int count(int elementToSearch){
            int numTimesArray = 0;
            for(int i = 0;i<size;i++){
                if(elementToSearch == lista[i]){
                    numTimesArray++;
                }
            }
            return numTimesArray;
        }

        int len(){
            int cont=size;
            for (int i = 0; i < size; i++)
            {
                if( lista[i]==NULL) cont--;
            }
            return cont;
        }


        void reverse(){
            /*
            Divide la mitad de la lista dado que para un numero impar de
            size un elemento no cambiara de posicion
            */
            int firtsNumber, lastNumber;
            for (int i = 1; i <= size/2; i++)
            {
                firtsNumber=lista[i-1];
                lastNumber=lista[size-i];
                lista[i-1]=lastNumber;
                lista[size-i]=firtsNumber;
            }
            cout<<"[";
            for(int i = 0;i<size;i++){
                if(i!=size-1) 
                    cout<<lista[i]<<",";
                else cout<<lista[i];
            }
            cout<<"]";
        }

        void index(int elemento){
            int cont=0;
            int var;
            int pos;
            for (int i = 0; i < size; i++){
                if(lista[i]==elemento) {
                cont++;
                pos=i;
                }
            }
            var=cont;
            if(cont>1){
                int arreglo[cont];
                for (int i = 0; i < size; i++){
                    if(lista[i]==elemento) {
                        arreglo[cont-1]=i;
                        cont--;
                    } 
                }
            cout<<"los indices que tienen el elemento son: \n";
            for (int i = 0; i < var; i++)
                cout<<" - "<<arreglo[i]<<endl;
            }
            else
            cout<<"el indice es: "<<pos;
        }

};

int main(){
    List list, list2,list3;
    //lista #1
    /*
    list.append(1000);
    list.append(200);
    list.append(12);
    list.append(200);
    list.append(1);
    list.append(100);
    list.append(1);
    */
    list.insert(2,2);
    //lista #2
    list2.append(7);
    list2.append(6);
    list2.append(6);
    list2.append(8);
    list2.append(300);
    list2.append(1);
    cout<<list.len()<<endl;


    //acciones
    list.index(1);
    list.imprimir();
    cout<<"\n";
    list.reverse();
    list.imprimir();
    cout<<"\n";
    cout<<list.len()<<endl;
	list2.sort();
    list2.imprimir();
    cout<<"\n";
    list.sort();
    list.imprimir();
    cout<<"\n";
    cout<<list2.count(6)<<endl;
    cout<<list.count(200);
    list.clear();
    cout<<endl;
    list.imprimir();
    cout<<endl<<list.len();
    

};


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