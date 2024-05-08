#include<iostream>

using namespace std;
class List{
    private:
        int *originalList;
        int size;
        int *auxilaryList;
    public:
        List(){
            size = 0;
            originalList = new int[size];
        }
        void append(int elemento){
            auxilaryList = new int[size+1];
            for (int i = 0; i<size;i++){
                *(auxilaryList+i) = *(originalList+i);
            }
            auxilaryList[size] = elemento;
            delete[] originalList;
            originalList = auxilaryList;
            size++;
        }
        void imprimir(){
            cout<<"[";
            for(int i = 0;i<size;i++){
                if(i!=size-1) 
                    cout<<originalList[i]<<",";
                else cout<<originalList[i];
            }
            cout<<"]";
        }
        void insert(int elemento, int posicion){
            if(size<posicion){
                append(elemento);
            }else{
                for(int i = 0;i<size;i++){
                    if(i == (posicion-1)){
                        *(originalList+i) = elemento;
                    }
                }
            }
        }
};
/*
int insert(int *lista,int elemento,int posicion){
    int size = sizeof(lista)/sizeof(lista[0]);
    cout<<size<<endl;
    if(posicion>size+1){

    }else{

    }
    cout<<elemento<<endl;
    cout<<posicion<<endl;
}
*/



int main(){
    List lista;
    lista.append(2);
    lista.insert(4,2);
    lista.imprimir();
    lista.insert(3,1);
    cout<<endl;
    lista.imprimir();
}