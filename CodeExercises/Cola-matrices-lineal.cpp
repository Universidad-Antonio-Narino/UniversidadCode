#include <iostream>
#include <cstdlib>
#include <windows.h>
using namespace std;
#define MaxTamC 10

class Cola{
	protected:
		int frente;
		int final;
		int listaCola[MaxTamC];
		int elemento;
	public:
		Cola(); //constructor
		~Cola(); //destructor
		void insertarC(int elemento);
		int quitarC();
		void borrarC();
		int frenteC();
		int colavaciaC();
		int colallenaC();
		void imprimirC();
		float mayor();
		float menor();
		float promedio();
		int espacio();//tama�o
};		
				
Cola::Cola(){
frente = 0;
final = -1;
}

Cola::~Cola() //Destructor
{
	cout << "\nGracias por utilizar este programa. \n";
	Sleep(5000);
	system("cls");
}
// operaciones de modificación de la cola
void Cola::insertarC(int _elemento){
	if (!colallenaC()){
		listaCola[++final] = _elemento;
	}else
	colallenaC();
}

int Cola::quitarC(){
	//sig_posicion = frente++;
	int i;
	if (!colavaciaC()){
		return listaCola[frente++];
	}else
	return colavaciaC();
}

void Cola::borrarC(){
frente = 0;
final = -1;
}
// acceso a la cola
int Cola::frenteC(){
	if (!colavaciaC()){
		return listaCola[frente++];
	}else{
	return colallenaC();
	}
}
// métodos de verificación del estado de la cola
int Cola::colavaciaC(){
	return frente > final;
}

int Cola::colallenaC(){
	return final == MaxTamC - 1;
}
void Cola::imprimirC()
{
        cout<<"el frente de la cola es : "<<frente<<"\n el final de la cola es:"<<final;
	 	Sleep(1000);
   if(colavaciaC()){
   	    cout<<"********************* \n";
	 	cout<<"\n LA COLA ESTA VACIA \n"; 
	 	cout<<"********************* \n";
	 	Sleep(4000);
	 	cin.get();
	 	system("cls");
		}
	else if(colallenaC()){}
	    cout<<"********************* \n";
	 	cout<<"\n LA COLA ESTA LLENA \n"; 
	 	cout<<"********************* \n";
	 	Sleep(4000);
	 	cin.get();
	 	system("cls");
	}
	else{
		 cin.get();
		 sytem("cls");
	}
}
float Cola::mayor(){
	float numYor = listaCola[0];
	for(int inicio = 0; inicio <= final; inicio++){
		if(listaCola[inicio] > numYor){
			numYor = listaCola[inicio];
		}
		
	}
	
    
int main(){
cout << "---Este programa muestra la implementacion de una cola lineal---" << endl;

Cola P1;

P1.insertarC(5);
//P1.imprimirC();
P1.insertarC(6);
//P1.imprimirC();
P1.insertarC(3);
//P1.imprimirC();
//P1.insertarC(4);
//P1.imprimirC();
//P1.insertarC(10);
//P1.imprimirC();
cout <<"\n";

P1.quitarC();
//P1.imprimirC();
P1.quitarC();
//P1.imprimirC();
P1.quitarC();
//P1.imprimirC();

return 0;
//system("PAUSE");
//return EXIT_SUCCESS;
}
