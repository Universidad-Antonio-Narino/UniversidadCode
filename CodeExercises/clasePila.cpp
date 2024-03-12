/*
* Created by:
* Santiago Angel
* Santiago Moreno 
* Nicolas Molina
*/

#include <cstdlib>
#include <iostream>
#include <windows.h>
using namespace std;

#define MaxTamaPila 10
//Definiendo los atributos y metodos de la clase pila
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
		void quitarP();
		int estavaciaP();
		void imprimirPila();
		float mayor();
		float menor();
		//void imprimirP();
};
Pila::Pila(){ //Constructor
	cima = -1;
};
Pila::~Pila(){//destructor 
	Sleep(500);// esperar medio segundo 
	cout << " GRACIAS POR USAR EL PROGRAMA \n";
	Sleep(500);// esperar medio segundo 
};

void Pila::vaciaP(){
	cima = -1;	
};

//metodo de impresión de la pila
void Pila::imprimirPila(){
	if(estavaciaP()) 
		cout<<"PILA",Sleep(500)," VACIA, por favor Inserte elementos ";
	else if(estallenaP())
		cout<<"Pila llena, por favor elimine elementos ";
	else{
		for(int x=cima; x>=0; x--)
			cout<<pila[x]<<endl;
	};
};

//metodo de inserción de datos en la pila
void Pila::insertarP(float _elemento){
	if (estallenaP()){
		cout <<"\nDesbordamiento pila\n se eliminara un elemento: \n";
		quitarP();
	}
	else{
		cima++;
		pila[cima] = _elemento;
		cout << "Se inserta la cima: " << _elemento << " -> cima: " << cima << endl;
	}
}
//metodo para determinar el mayor numero de la pila
float Pila::mayor(){
	float m=-1000000;
	for(int x = 0; x <= cima; x++){
		if(pila[x]>m)
			m = pila[x];
	}
	return m;
}
/*
Esta funcion no me devuelve el mas grande
*/
float Pila::menor(){
	float n=100.0;
	for(int x = 0;x <= cima;x++){
		if(pila[x]<n)
			n = pila[x];
	}
	return n;
}

void Pila::quitarP(){
	float aux;
	float element;
	if (estavaciaP()){
		cout <<"\nSe intenta sacar un elemento en pila vacía\n ingrese un elemento a la pila: \n";
		cin>>element;
		insertarP(element);
	}else{
		aux = pila[cima];
		cima--;
		cout << "\nSe elimina la cima: " << aux << " -> cima: " << cima;
	};
};

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
		pila.quitarP();
		break;
	case 2:
		cout<<pila.mayor()<<endl;
		break;
	case 3:
		cout<<pila.menor()<<endl;
		break;
	case 4:
		pila.imprimirPila();
		break;
	default:
		break;
	}
};

//funcion principal
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
		switch(opcion){
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
				cout<<"1)   PILA 1      .(NEGATIVOS)"<<endl;
				cout<<"2)   PILA 2      .(POSITIVOS)"<<endl;
				cin>>OpcionPila;
				switch (OpcionPila){
					case 1:
						MenuEleccionrd(p1); //numeros negativos
  						break;
					case 2:
						MenuEleccionrd(p2); //numeros positivos
						break;
				}
		}
	}while(opcion != 3);
};