#include <iostream>
#include <cstdlib>

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
		int frenteC();
		int colavaciaC();
		int colallenaC();
		//void imprimirC();
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