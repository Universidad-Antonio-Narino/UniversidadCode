/*
* Santiago Angel
* Santiago Moreno 
* Nicolas Molina
*/

#include <cstdlib>
#include <iostream>
#include <windows.h>
using namespace std;
<<<<<<< HEAD
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
};
Pila::~Pila(){//destructor 
	Sleep(500);// esperar medio segundo 
	cout << " GRACIAS POR USAR EL PROGRAMA \n";
	Sleep(2500);// 2 segundos y medio segundo 
};

void Pila::vaciaP(){
	cima = -1;	
};
void Pila::imprimirPila(){
	if(estavaciaP()) {
	
		cout<<"PILA VACIA \n por favor Inserte un elementos. \n ";
		cin.get();
		system("cls");
	}
	else if(estallenaP())
	{
		cout<<"PILA LLENA \n favor elimine elementos" ;
	}
	else{
		for(int x=cima; x>=0; x--)
			cout<<pila[x]<<endl;
	}
};


void Pila::insertarP(float _elemento){
	if (estallenaP()){
<<<<<<< HEAD
		cout <<"!!! TENEMOS DESBORDAMIENTO EN LA PILAA!!!! eliminando cima eliminarla cima \n",Sleep(5000);
=======
		cout <<"!!! TENEMOS DESBORDAMIENTO EN LA PILAA!!!! eliminando cima eliminarla cima \n, Maximo de almacenamiento de la pila lleno",Sleep(5000);
>>>>>>> dd87f974d1dabf45ce1af7f89f73cb0cf4ab8034
		quitarP( );
		cin.get();
		system("cls");
		cin.get();
	}
	else{
		cima++;
		pila[cima] = _elemento;
		cout << "Se inserta la cima: "<<_elemento<<" -> cima: "<<cima;
		Sleep(5000);
		system("cls");
	}
};

float Pila::mayor(){
	float m=-1000000;
	for(int x = 0; x <= cima; x++){
		if(pila[x]>m)
			m = pila[x];
	}
	return m;
};
/*
Eesta funcion no me devuelve el mas grande
*/
float Pila::menor(){
	float n=100.0;
	for(int x = 0;x <= cima;x++){
		if(pila[x]<n)
			n = pila[x];
	}
	return n;
};

int Pila::quitarP(){
	int aux;
	float element;
	if (estavaciaP()){
		cout <<"\nSe intenta sacar un elemento en pila vacia \n ingrese un elemento a la pila: \n";
		cin>>element;
		insertarP(element);
		Sleep(8000);
		system("cls");
	}else{
		aux = pila[cima];
		cout << "\n SE ELIMINO LA CIMA: " << aux << " -> CIMA: " << cima;
		cima--;
		return aux;
		Sleep(5000);
		system("cls");
	}
};

int Pila::estallenaP(){
	return cima == MaxTamaPila - 1;	
};

int Pila::estavaciaP(){
	return cima == -1;
};

void MenuEleccionrd(Pila &pila){// siempre que tenga una funcion que reciba como parametros objeto, usar siempre apuntador &
	/*
	Debo poner el & debido a que si no lo coloco este
	dara errores, esto debido a que el objeto no traera la informacion original de la misma si no que creara un nuevo objeto, pero si pasamos el parametro que recibira (caso recibe un objeto), por referencia no creara un objeto nuevo si no que por el contrario apuntara a lo que reciba como parametro, es la forma mas sencilla la cual puedo explicar.
	*/
	int opcionOperacion;
	
	cout <<"-----------------------------------"<<endl;
	Sleep(500);
	cout <<"     QUE ACCION DESEA REALIZAR?    "<<endl;
	Sleep(500);
	cout <<" 1)           ~~ QUITAR ~~         "<<endl;
	Sleep(500);
	cout <<" 2)           ~~ MAYOR ~~          "<<endl;
	Sleep(500);
	cout <<" 3)           ~~ MENOR ~~          "<<endl;
	Sleep(500);
	cout <<" 4)          ~~ IMPRIMIR ~~        "<<endl;
	Sleep(500);
	cout <<"-----------------------------------"<<endl;
	Sleep(500);
	cin>>opcionOperacion;
	switch (opcionOperacion)
	{
	case 1:
		cout<<pila.quitarP()<<endl;
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

int main(){
	Pila p1,p2;
	int opcion;
	do{
		cout <<"--------------------------------"<<endl;
		Sleep(500);
		cout <<"-Este programa muestra una pila-"<<endl;
		Sleep(500);
		cout <<"    ~~           MENU         ~~"<<endl;
		Sleep(500);
		cout <<" 1) ~~         INSERTAR       ~~"<<endl;
		Sleep(500);
		cout <<" 2) ~~        OPERAR PILA     ~~"<<endl;
		Sleep(500);
		cout <<" 3) ~~           SALIR        ~~"<<endl;
		Sleep(500);
		cout <<"--------------------------------"<<endl;
		cin>>opcion;
		Sleep(1000);
		system("cls");
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
				cout<<"Aqui puede ELIMINAR, IMPRIMIR o VER \n los elementos que se encuentran dentro de cada pila. \n Pero para esto primero debe escoger a que pila desea operar. \n que pila desea escoger: \n";
				Sleep(500);
				cout<<"1)  ** PILA 1 ** (NEGATIVOS) **"<<endl;
				Sleep(1500);
				cout<<"2)  ** PILA 2 ** (POSITIVOS) **"<<endl;
				cin>>OpcionPila;
				Sleep(2500);
				system("cls");
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
