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
		void mayor();
		void menor();
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
	if (colavaciaC()){
		float element;
		cout <<"\nSe intenta sacar un elemento en pila vacia \n ingrese un elemento a la pila: \n";
		cin>>element;
		insertarC(element);
	}else{
		//algo
		cout<<"HOLa";
	}
}
//metodo borrar
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
	else if(colallenaC()){
	    cout<<"********************* \n";
	 	cout<<"\n LA COLA ESTA LLENA \n"; 
	 	cout<<"********************* \n";
	 	Sleep(4000);
	 	cin.get();
	 	system("cls");
	}
}
//metodo num Mayor
void Cola::mayor(){//probar, no estoy seguro
	float numYor = listaCola[0];
	for(int inicio = 0; inicio <= final; inicio++){
		if(listaCola[inicio] > numYor){
			numYor = listaCola[inicio];
		}
	}
	cout<<"El Numero menor es: "<<numYor;
}

void Cola::menor(){
	float numNor = listaCola[0];
	for(int inicio = 0; inicio <= final; inicio++){
		if(listaCola[inicio] < numNor){
			numNor = listaCola[inicio];
		}
	}
	cout<<"El numero menor es: "<<numNor;
}
	
    
int main(){
	cout<<"Menu en desarrollo";
	//pruebas
	/*
	Cola c1;
	c1.insertarC(1);
	c1.insertarC(2);
	c1.insertarC(3);
	cout<<"Numero mayor: "<<c1.mayor()<<endl;
	cout<<"Numero Menor: "<<c1.menor();
	*/
};
//hola