#include <iostream>

using namespace std;

/*
hacer:
append()
clear()
extend()
count()
index()
reverse()
len()
*/
class Lista{
    private:
        int size;
        int *lista;
        int *listaAux;
    public:
        Lista(){
            size = 0;
            lista = new int[size];
        }
    
        void append(int elemento){
            listaAux = new int[size+1];
            for (int i = 0; i<size;i++){
                *(listaAux+i) = *(lista+i);
            }
            *(listaAux+size) = elemento;
            delete[] lista;
            lista = listaAux;
            size++;
        }

        void clear(){
            delete[] lista;
        }
        int getDato(int index){
            return lista[index];
        }
        void extend(Lista &lista2){
            int sizeOtherList = lista2.size;
            int *extendedList = new int[size+sizeOtherList];
            for (int i = 0; i < size; i++)
            {
                *(extendedList+i) =  *(lista+i);
            }
            for (int i = 0; i<sizeOtherList;i++){
                *(extendedList+(size+i)) = lista2.getDato(i);
            }
            cout<<"[";
            for(int i = 0;i<size;i++){
                if(i!=size-1) 
                    cout<<lista[i]<<",";
                else cout<<lista[i];
            }
            cout<<"]";
            delete[] extendedList;
            
        }

        int count(int elementoBuscar){
            
        }
        int index(){

        }
        void reverse(){

        }
        int len(){

        }
        void imprimir(){
            cout<<"[";
            for(int i = 0;i<size;i++){
                if(i!=size-1) 
                    cout<<lista[i]<<",";
                else cout<<lista[i];
            }
            cout<<"]";
        }
};

int main(){
    int tamaño;
    cin>>tamaño;
    Lista list(tamaño);
    list.append(1);
    list.append(2);
    list.append(3);
    list.append(31);
    list.append(345);
    list.append(34);
    list.imprimir();
}