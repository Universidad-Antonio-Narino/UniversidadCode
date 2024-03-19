#include <iostream>
#include <cstdlib>
#include <windows.h>
using namespace std;
#define MaxTamC 100

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
		//int frenteC();
		int colavaciaC();
		int colallenaC();
		void imprimirC();
		void mayor_menorC();
		float promedioC();
		int tamanoC();
};		
				
Cola::Cola(){
frente = 0;
final = -1;
}

Cola::~Cola() //Destructor
{
	cout << "\nGracias por utilizar este programa. \n";
}
// operaciones de modificación de la cola

//metodo tamaño de cola -----
int Cola::tamanoC(){
	return final+1;
}

//metodo de promedio de cola -----
float Cola::promedioC(){
	float prom=0;
	for(int x=0; x<=final; x++){
	prom=prom+listaCola[x];
	}
	prom=prom/(final+1);
	return prom;
}

//metodo de impresión-----
void Cola::imprimirC(){
	cout<<"\nel valor de frente es: "<<frente<<" y el valor de final es: "<<final<<endl;
	Sleep(1000);
	if(colavaciaC()){
		cout<<"********************* \n";
	 	cout<<"\n LA COLA ESTA VACIA \n"; 
	 	cout<<"********************* \n";}
	else if(colallenaC()){
		cout<<"********************* \n";
	 	cout<<"\n LA COLA ESTA LLENA \n"; 
	 	cout<<"********************* \n";
		}
	else{
		for(int x=0; x<=final; x++)
			cout<<" -> "<<listaCola[x];
	}
		Sleep(4000);
	 	cin.get();
	 	system("cls");
}

//metodo de mayor y menor cola -----
void Cola::mayor_menorC(){
	int m=listaCola[0];
	int mnr=listaCola[0];
	for(int x=1; x<=final; x++){
		if(listaCola[x]>m)
			m=listaCola[x];
		if(listaCola[x]<mnr)
			mnr=listaCola[x];
	}
	cout<<"el mayor elemento de la cola es: "<<m<<" y el menor elemento es: "<<mnr<<endl;
}

//metodo de insertar datos a la cola -----
void Cola::insertarC(int _elemento){
	if (!colallenaC()){
		listaCola[++final] = _elemento;
	}else
	colallenaC();
}

//metodo de eliminar datos -----
int Cola::quitarC(){
	int elim = listaCola[0];
	if (!colavaciaC()){
		for(int x=0; x<=final; x++)
			listaCola[x]= listaCola[x+1];
		final--;
		return elim;
	}else
	return colavaciaC();
}

//metodo de borrar todos los datos de la cola -----
void Cola::borrarC(){
frente = 0;
final = -1;
}

// acceso a la cola
/*int Cola::frenteC(){
	if (!colavaciaC()){
		return listaCola[frente++];
	}else{
	return colallenaC();
	}
}*/
// métodos de verificación del estado de la cola
int Cola::colavaciaC(){
	return frente > final;
}

int Cola::colallenaC(){
	return final == MaxTamC - 1;
}

int main(){
cout << "---Este programa muestra la implementacion de una cola lineal---" << endl;
int elemento;
Cola P1;

int opcionOperacion;
do{cout <<"-----------------------------------"<<endl;
	Sleep(500);
	cout <<"     QUE ACCION DESEA REALIZAR?    "<<endl;
	Sleep(500);
	cout <<" 1)           ~~ QUITAR ~~         "<<endl;
	Sleep(500);
	cout <<" 2)        ~~ MAYOR Y MENOR ~~          "<<endl;
	Sleep(500);
	cout <<" 3)           ~~ PROMEDIO ~~          "<<endl;
	Sleep(500);
	cout <<" 4)          ~~ IMPRIMIR ~~        "<<endl;
	Sleep(500);
	cout <<" 5)          ~~ TAMAÑO ~~        "<<endl;
	Sleep(500);
	cout <<" 6)          ~~ INSERTAR ~~        "<<endl;
	Sleep(500);
	cout <<" 7)          ~~ SALIR ~~        "<<endl;
	Sleep(500);
	cout <<"-----------------------------------"<<endl;
	Sleep(500);

	cin>>opcionOperacion;
	switch (opcionOperacion)
	{
	case 1:
		cout<<"SE ELIMINO EL ELEMENTO "<<P1.quitarC()<<" DE LA COLA"<<endl;
		break;
	case 2:
		P1.mayor_menorC();
		break;
	case 3:
		cout<<"EL PROMEDIO DE LOS VALORES DE LA COLA ES: "<<P1.promedioC()<<endl;
		break;
	case 4:
		P1.imprimirC();
		break;
	case 5:
		cout<<"EL TAMANO DE LA COLA ES: "<<P1.tamanoC();
		break;
	case 6:
		cout<<"¿QUE ELEMENTO DESEA AGREGAR A LA COLA\n ";
		cin>>elemento;
		P1.insertarC(elemento);
		break;
	case 7:
		cout<<"EL TAMANO DE LA COLA ES: "<<P1.tamanoC();
		break;
	default:
		break;
	}
}
while(opcionOperacion != 7);

}