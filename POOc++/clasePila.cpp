#include <cstdlib>
#include <iostream>
using namespace std;

#define MaxTamaPila 10

class Pila{
	private:
		float pila[MaxTamaPila];
		int cima;
		float elemento;
		int aux;
		int estallenaP();
	public:
		Pila();	 //constructor
		~Pila(); //destructor
		void vaciaP();
		void insertarP(float elemento) ;
		int quitarP();
		int estavaciaP();
		void imprimirPila();
		float mayor();
		float menor();
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
void Pila::imprimirPila(){
	if(estavaciaP()) 
		cout<<"Pila vacia, por favor Inserte elementos ";
	else if(estallenaP())
		cout<<"Pila llena, por favor elimine elementos ";
	else
		for(int x=cima; x>=0; x--)
			cout<<pila[x]<<endl;
}


void Pila::insertarP(float _elemento){
	if (estallenaP()){
		cout <<"\nDesbordamiento pila\n se eliminara un elemento: \n";
		quitarP( );
	}
	else{
		cima++;
		pila[cima] = _elemento;
		cout << "Se inserta la cima: " << _elemento << " -> cima: " << cima << endl;
	}
}

float Pila::mayor(){
	float m=0.0;
	if(pila[cima]>m)
		m = pila[cima];
	return m;
}

float Pila::menor(){
	float n=10000.0;
	if(pila[cima]<n)
		n = pila[cima];
	return n;
}

int Pila::quitarP(){
	int aux;
	float element;
	if (estavaciaP()){
		cout <<"\nSe intenta sacar un elemento en pila vacía\n ingrese un elemento a la pila: \n";
		cin>>element;
		insertarP(element);
	}else{
		aux = pila[cima];
		cout << "\nSe elimina la cima: " << aux << " -> cima: " << cima;
		cima--;
		return aux;
	}
	
}

int Pila::estallenaP(){
	return cima == MaxTamaPila - 1;	
}

int Pila::estavaciaP(){
	return cima == -1;
}



int main(){
int opcion;
int a;
int opcionPila;
do{
	Pila P1; //Negativos
	Pila p2; //Positivos
	cout << "---Este programa muestra una pila---" << endl;
	cout << "         MENU         "<< endl;
	cout <<" 1)   INSERTAR        ."<< endl;
	cout <<" 2)   CONSULTAR           ."<<endl;
	cout <<" 3)   SALIR           ."<<endl;
	cin>>opcion;
	switch(opcion){
		case 1:
			float elementop;
			cout<<"Ingrese un elemento: \n";
			cin>>elementop;
			if(elementop<0)
				P1.insertarP(elementop);
			else
				p2.insertarP(elementop);
			break;
		case 2:
			cout <<" A QUE PILA DESEA ACCEDER?\n (1- NEGATIVOS      2-POSITIVA)           "<<endl;	
			cin>>opcionPila;
			cout <<" QUE ACCION DESEA REALIZAR?"<<endl;
			cout <<" 1)   QUITAR          ."<<endl;
			cout <<" 2)   MAYOR           ."<<endl;
			cout <<" 3)   MENOR           ."<<endl;
			cout <<" 4)   IMPRIMIR           ."<<endl;	
			
			cin>>a;
			switch(a){
				case 1:
					if (a == 1){
						if(opcionPila==1){
							P1.quitarP();
							cout<<"Se elimino la cima de la pila: \n";		
						}
					}
					else if (opcionPila == 2){
						p2.quitarP();
						cout<<"Se elimino la cima de la pila: \n";	
					}
					else{
						cout<<"Opcion no valida 404, devolviendo al menu";
					}
				break;
				
				case 2:
					if(opcionPila==1){
						P1.mayor();
					}
					else if(opcionPila==2){	
						p2.mayor();	
					}
					break;
				
				case 3:
					if(opcionPila==1){
						P1.menor();
					}
					else if(opcionPila==2){	
						p2.menor();	
					}
					break;
				case 4:
					if(opcionPila==1){
						P1.imprimirPila();		
					}
					else if(opcionPila==2){	
						p2.imprimirPila();	
					}
					break;
			}




	
		case 3:
			exit(1);
}
}while(opcion != 3);


/*
for(int x=0; x<MaxTamaPila; x++){
		
}
*/

cout <<"\n";

cout << "\n";

system("PAUSE");
return EXIT_SUCCESS;
}
