#include <cstdlib>
#include <iostream>
using namespace std;

#define MaxTamaPila 100 //define el tamaño de la pila 

class Pila{
	private:
		float pila[MaxTamaPila];
		int cima;
		int elemento;
		int aux;
		int estallenaP();
	public:
		Pila();	 //constructor
		~Pila(); //destructor
		void vaciaP();
		void insertarP(int elemento) ;
		int quitarP();
		int estavaciaP();
		//void imprimirP();
		
};
Pila::Pila(){ //Constructor
	cima = -1;
}

Pila::~Pila() //Destructor
{
	cout << "\nGracias por utilizar este programa. \n";
}

void Pila::vaciaP(){
	cima = -1;	
}

void Pila::insertarP(int _elemento){
	if (estallenaP()){
		cout <<"\nDesbordamiento pila";
		exit (1);
	}else{
		cima++;
		pila[cima] = _elemento;
		cout << "Se inserta la cima: " << _elemento << " -> cima: " << cima << endl;
	}
}

int Pila::quitarP(){
	int aux;
	if (estavaciaP()){
		cout <<"\nSe intenta sacar un elemento en pila vac�a";
		exit (1);
	}else{
		aux = pila[cima];
		cout << "\nSe elimina la cima: " << aux << " -> cima: " << cima;
		cima--;
		return aux;
	}
	
}

int Pila::estallenaP(){
	return cima == MaxTamaPila - 1;	//me retorna la condicion no un valor booleano
}

int Pila::estavaciaP(){
	return cima == -1;
}



int main(){
cout << "---Este programa muestra una pila---" << endl;

Pila P1;

P1.insertarP(5);
P1.insertarP(6);
P1.insertarP(3);
P1.insertarP(4);
P1.insertarP(10);

cout <<"\n";

P1.quitarP();
P1.quitarP();
P1.quitarP();
P1.quitarP();
cout << "\n";
//P1.imprimirP();

system("PAUSE");
return EXIT_SUCCESS;
}
