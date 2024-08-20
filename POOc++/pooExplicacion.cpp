#include <iostream>
//#include <stdlib>
using namespace std; //encabezado

class Persona{
	//Atributos-> abstracción de la experiencia
	private:
		int edad;
		string nombre;
	//Métodos-> son las acciones que realiza la clase
	public:
		Persona(int, string);//constructor de la clase
		void leer();
		void correr();
};
//Constructor sirve para inicializar los atributos de la clase
Persona::Persona(int _edad, string _nombre){ // "::" -> lo relaciona con la clase en este caso persona, sirve para declarar un metodo a la clase.
	edad = _edad;
	nombre = _nombre;
}

//Métodos
void Persona::leer(){
	cout << "\n Soy " << nombre << " y esto leyendo un libro \n";
}

void Persona::correr(){
	cout << "\n Soy " << nombre << " y esto corriendo un maraton y tengo " << edad << "\n";
}
main(){
	cout << "   Programa de ejemplo POO \n";
	cout << "   ----------------------- \n";
	//Instancias de la clase
	Persona p1 = Persona(20, "Alejandro");  //Inicializarlo
	Persona p2(19, "Maria");
	Persona p3(25, "Daniel");
	
	p1.leer();
	p2.correr();
	p3.correr();
	
	cout << "\n";
	system("pause");
	return 0;
}
