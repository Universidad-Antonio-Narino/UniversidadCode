#include<iostream>
#include<windows.h>
using namespace std;

//Creacion de listas con arreglos
/*
este es una pequela definicion de lo que hace el programa 
primero nos piden contruir cada metodo
- append (agrega un elemento a la vez, ese parametro de este metodo)
- clear (elimina todos los elementos de la lista, por ende no recibe parametros)
- extend (recibira una lista de elementos como parametro, ese sera su unico parametro)
- count (recibe como parametro un valor a buscar, y retornara cuantas veces aparece en el array original)(buscar una manera eficiente para que no se valla a o(n!)), para el aburrimiento y la eficiencia del programa utilizaremos busqueda binarias, esto por si llegan a existir demasiados datos para buscar ;)
- index ()
- reverse()
- len()

to do
- Append y clase : Terminados y funcionando
- Clear : Terminados y funcionando
- extend: Terminados y funcionando
- Len : Terminados y funcionando 
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

        void insert(int elemento, int posicion){
            if(size<posicion){
                append(elemento);
            }else{
                for(int i = 0;i<size;i++){
                    if(i == (posicion-1)){
                        *(lista+i) = elemento;
                    }
                }
            }
        }

        void clear(){
            for(int i=0; i<size; i++){
                lista[i]=NULL;
            }
            //delete[] lista; // quiero quitarme los elementos de esa lista asi que libero su espacio
            //size = 0;
            //lista = nullptr; //apunta a un puntero vacio segun internet
        }

        // para verificar que si imprime //intento 1000 :)
        void imprimir(){
            cout<<"[";
            for(int i = 0;i<size;i++){
                if(i!=size-1) 
                    cout<<lista[i]<<",";
                else cout<<lista[i];
            }
            cout<<"]";
        }

        int getDato(int index){
            return *(lista+index);
        }

        void extend(List &listaToExtend) {
            // Tamaño total de la nueva lista
            int sizeExtendedList = size + listaToExtend.size;
            int *extendedList = new int[sizeExtendedList];
            
            // Copiar elementos de la lista original a la lista extendida
            for (int i = 0; i < size; i++) {
                extendedList[i] = lista[i];
            }

            // Agregar elementos de listaToExtend al final de la lista extendida
            for (int i = 0; i < listaToExtend.size; i++) {
                extendedList[size + i] = listaToExtend.getDato(i);
            }

            // Imprimir lista extendida
            for (int i = 0; i < sizeExtendedList; i++) {
                cout << "Posicion: " << i + 1 << " -> " << extendedList[i] << endl;
            }

            // Liberar memoria asignada dinámicamente
            delete[] extendedList;
        }
        
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
        int assistant1, assistant2;
        for (int i = 1; i <= size/2; i++)
            {
                assistant1=lista[i-1];
                assistant2=lista[size-i];
                lista[i-1]=assistant2;
                lista[size-i]=assistant1;
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
    List list, list2;
    int opcion,elemento,elementoToSearch,posicion;
    //lista #1
    do
    {   
        cout<<"Menu"<<endl;
        cout<<"1)   Agregar al final "<<endl;
        cout<<"2)   Insertar en alguna possicion"<<endl;
        cout<<"3)   Limpiar lista"<<endl;
        cout<<"4)   Unir dos listas "<<endl;
        cout<<"5)   Buscar elementos"<<endl;
        cout<<"6)   Buscar indice elementos"<<endl;
        cout<<"7)   Invertir lista"<<endl;
        cout<<"8)   Total de la lista"<<endl;
        cout<<"9)   Imprimir lista"<<endl;
        cout<<"10)  Salir"<<endl;

        cout<<"Elija una opcion: ";
        cin>>opcion;

        switch (opcion)
        {
        case 1:
            cout<<"Ingrese el elemento a agregar: ";
            cin>>elemento;
            list.append(elemento);
            break;
        case 2:
            cout<<"Ingrese el elemento a agregar y su posicion: ";
            cin>>elemento>>posicion;
            list.insert(elemento,posicion);
            break;
        case 3:
            list.clear();
            break;
        case 4:
            int numElementos;
            cout<<"Ingrese el numero de elementos a guardar: ";
            cin>>numElementos;
            for(int i = 0;i<numElementos;i++){
                cout<<"Ingrese el elemento a agregar: ";
                cin>>elemento;
                list2.append(elemento);
            }
            list.extend(list2);
            break;
        case 5:
            cout<<"Ingrese el elemento a buscar: ";
            cin>>elementoToSearch;
            cout<<list.count(elementoToSearch)<<endl;
            break;
        case 6:
            cout<<"Ingrese el elemento a buscar: ";
            cin>>elementoToSearch;
            list.index(elementoToSearch);
            break;
        case 7:
            list.reverse();
            break;
        case 8:
            cout<<list.len();
            break;
        case 9:
            list.imprimir();
            cout<<endl;
            break;
        default:
            break;
        }
    } while (opcion != 10);
}






