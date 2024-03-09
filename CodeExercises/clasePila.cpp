#include <cstdlib>
#include <iostream>
using namespace std;

#define MaxTamaPila 10 //define el tamaño de la pila

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
/*
Esta funcion no me devuelve el mas grande
*/
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

void MenuEleccionrd(Pila pila){
	int opcionOperacion;
	cout <<" QUE ACCION DESEA REALIZAR?"<<endl;
	cout <<" 1)   QUITAR          ."<<endl;
	cout <<" 2)   MAYOR           ."<<endl;
	cout <<" 3)   MENOR           ."<<endl;
	cout <<" 4)   IMPRIMIR        ."<<endl;
	cin>>opcionOperacion;
	switch (opcionOperacion)
	{
	case 1:
		cout<<pila.quitarP();
		break;
	case 2:
		cout<<pila.mayor();
		break;
	case 3:
		cout<<pila.menor();
		break;
	case 4:
		pila.imprimirPila();
		break;
	default:
		break;
	}
}

int main(){
	Pila p1,p2;
	int opcion;
	do{          
		cout << "---Este programa muestra una pila---" << endl;
		cout << "         MENU         "<< endl;
		cout <<" 1)   INSERTAR                ."<< endl;
		cout <<" 2)   OPERAR PILA             ."<<endl;
		cout <<" 3)   SALIR                   ."<<endl;	
		cin>>opcion;
		switch (opcion)
		{
			case 1:
				float elementop;
				cout<<"Ingrese un elemento: \n";
				cin>>elementop;
				if(elementop<0)
					p1.insertarP(elementop);
				else
					p2.insertarP(elementop);
				break;

			case 2:
				int OpcionPila;
				cout<<"Aqui puede eliminar, imprimir o ver los elementos que se encuentran dentro de cada pila. \n Pero para esto primero debe escoger a que pila desea operar. \n que pila desea escoger: "<<endl;
				cout<<"1)   PILA 1      ."<<endl;
				cout<<"2)   PILA 2      ."<<endl;
				cin>>OpcionPila;
				switch (OpcionPila)
				{
				case 1:
					MenuEleccionrd(p1);
					break;
				case 2:
					MenuEleccionrd(p2);
					break;
				default:
					break;
				}
		
		}
	}while (opcion != 3);
}
