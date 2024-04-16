#include<iostream>
#include<cstdlib>
#include <time.h> 
#include <cctype>
#include <fstream>

using namespace std;

class Contrasena
{
private:
   // Char contrasenia;
    char letras[26]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
public:
    char generarmayus();
    char generarminus();
    char generarnum();
    char generarcarac();
    Contrasena(); //constructor
    ~Contrasena(); //destructor
};

Contrasena::Contrasena()
{
    //contrasenaa="abcdefghij";
}

Contrasena::~Contrasena()
{
    cout << "\nGracias por utilizar este programa. \n";
}

char Contrasena::generarmayus(){
    char may;
    //devuelve un caracter aletorio de la lista de letras
    may=letras[rand() % 26];
    // retorno de caracter en mayuscula
    return toupper(may);
}

char Contrasena::generarminus(){
    return letras[rand() % 26];
}

char Contrasena::generarnum(){
    char num[10]={'0','1','2','3','4','5','6','7','8','9',};
    return num[rand() % 10];
}

char Contrasena::generarcarac(){
    char esp[10]={'*','/','+','-','@','#','$','%','&','?'};
    return esp[rand() % 10];
}




int main(){
    //string pasword="abcdefghij" (caso prueba);
    string pasword[10];
    int l, m, s;
    //generador de numeros aletorios
    srand(time(0));
    Contrasena p1;
    //10 caracteres  == 3 ya ocupados(numero, mayuscula y especial) quedan 7 
    //  7=100%
    //normal =50%     mayuscula =15%
    //numero =20%     especial 15%
    for(int y=0; y<4; y++){
        /*genera un numero aletorio en el rango de 10,
        se utilizara para guardar en un espacio aletorio cualquiera de los elementos
        que componen la password 
        */ 
        s = rand() % 10;
        if(pasword[s] == "" && y==0)
            pasword[s]=p1.generarminus();
        if(pasword[s] == "" && y==1)  
            pasword[s]=p1.generarmayus();
        if(pasword[s] == "" && y==2)
            pasword[s]=p1.generarcarac();
        if(pasword[s] == "" && y==3) 
            pasword[s]=p1.generarnum();
    }
    for(int x=5; x<=10; x++){
        inicio:
        l=rand() % 10; //ubicar posicion del caracter
        m=rand() % 101;
        if(pasword[l] == ""){  
            if(m<50)
                pasword[l]=p1.generarminus();
            else if(m<66 && m>49)
                pasword[l]=p1.generarmayus();
            else if(m<81 && m>65)
                pasword[l]=p1.generarcarac();
            else 
                pasword[l]=p1.generarnum();
        }
        else{
            goto inicio;
        }
    }
    cout<<"Su contraseña asignada es: ";
    for(int x=0; x<10; x++)
        cout<<pasword[x];
    
    //fichero
  //arreglar lo de que sobreescribe
    ofstream fich("acces.txt");
    if (!fich)
    {
        cout << "Error al abrir ejemplo.dat\n";
        exit(EXIT_FAILURE);
    }
    for (int i = 0; i < 10; ++i)
        fich << pasword[i];

    cout<<endl<<"su contrasena ya se encuentra registrada en nuestro sistema\n BIENVENIDO";

}