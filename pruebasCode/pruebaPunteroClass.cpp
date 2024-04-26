#include<iostream>

using namespace std;

//mi sueño es hacerlo como un vector sin necesidad de incluir un tamaño :)
class list{
    private:
        int sizeArr;
        int begin = 1;
        int *arr;
    public:
        list(int size){
            //tamaño del arreglo
            this->sizeArr = size;
            // esta guay con la semejanza a python o java
            arr = new int[size];
        }
        bool validator(){
            return sizeArr==begin;
        }
        void append(int objet){
            if (!validator()){   
                arr[begin-1]=objet;   
                begin++;
            }else{
                cout<<"Lista fuera de rango";
            }
        }
        void obtenerElemento(int posElemento){
            cout<<arr[posElemento];
        }
        void obtenerTodaLalista(){
            for()
        }

        
};

int main(){
    list arr(3);

}