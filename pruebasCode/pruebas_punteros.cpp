#include <iostream>

using namespace std;

int main(){
    /*
    int var = 10;
    //puntero que apunta a un espacio de tipo entero
    int * ptr;
    //reserva la direccion de memoria y la direcciona a ese espacio de memoria
    ptr = &var;

    cout<<var<<endl;//imprime el valor de var
    cout<<&var<<endl;//imprime la direccion de memoria
    cout<<ptr<<endl;//imprime la direccion de memoria
    cout<<*ptr<<endl;//imprime el valor del puntero
    */

   int arrE[] = {1,222,3,56,515};
   int arrS[] = {678,72,84,932,100};
   int *combiArr = new int[10];
   
   
   for(int i = 0;i<10;i++){
    if (i >= 5 && i<10)
    {
        combiArr[i] = arrS[i-5];
    }else{
        combiArr[i] = arrE[i];
    }
    cout<<combiArr[i]<<endl;
   }

}