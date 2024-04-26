#include <iostream>

using namespace std;

class Lista{
    private:
        int size;
        int *list;
        int espacio = 0;
    public:
        Lista(int _size){
            size = _size;
            list = new int[size];
        }
    
        void append(int elemento){
            /*
            list[espacio] = elemento;
            quiero hacerlo con espacios autoañadidos
            if(espacio == size){
                int *listAuxiliar = new int[size+1];
                for(int i = 0; i<size;i++){
                    *(listAuxiliar+i)= list[i];
                }
                delete[] list;
                //listAuxiliar[size+1] = elemento;
                *(listAuxiliar+(size)) = elemento;
                list = listAuxiliar; 
            }else{
                list[espacio] = elemento;
                espacio++;
                size++;
            }
            */
            list[espacio] = elemento;
            espacio++;
            size++;
            
        }
        void imprimir(){
            for(int i= 0;i<size-1;i++){//-1 porque el size esta en uno mas del elemnto que voy a agregar, tengo un espacio de mas
                cout<<*(list+i)<<endl;
            }
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