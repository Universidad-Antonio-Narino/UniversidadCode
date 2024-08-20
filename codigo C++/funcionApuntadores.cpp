#include<iostream>
using namespace std;
int main(){
	int numero = 10,*dir_numero; //crea el púntero y la variable donde se guarda la posicion en memoria
	dir_numero =&numero; //guarda la direccion de memoria de numero 
	cout<<"Programa patra apuntadores"<<"\n\n\n";
	
	cout<<"Numero: "<<numero<<endl;
	cout<<"Direccion de memoria: "<<&numero<<endl;
	
	cout<<"\apuntador"<<endl;
	cout<<"Numero: "<<*dir_numero<<endl;
	cout<<"Direccion de memoria: "<<dir_numero<<endl;
	cout<<"Direccion de memoria: "<<&dir_numero<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	///////////PUNTEROS NULL///////////////////////////////////////////
	float z = 10;
	void *t =&z;
	//t=&z;
	cout<<"Valor z = "<<z<<endl;
	cout<<"Direccion z = "<<&z<<endl;
	cout<<"Direccion t = "<<t<<endl;
	cout<<"Direccion propia &t = "<<&t<<endl;
	
	int n,*numero;
	numero = NULL;
	cout<<"n = "<<n<<endl;
	cout<<"&n = "<<&n<<endl;
	cout<<"Numero: "<<numero<<endl;
	cout<<" &numero: "<<&numero<<endl;
	
	
	int *n1;
	n1 =NULL;
	cout<<"n1: "<<n1<<endl;
	cout<<"&n1: "<<&n1<<endl;

}
/*
-> Resultado de la ejecucion del programa
Numero: 10
Direccion de memoria: 0x6ffe0c
puntador
Numero: 10
Direccion de memoria: 0x6ffe0c
Direccion de memoria: 0x6ffe00




Valor z = 10
Direccion z = 0x6ffe0c
Direccion t = 0x6ffe0c
Direccion propia &t = 0x6ffe00
n = 0
&n = 0x6ffdfc
Numero: 0
&numero: 0x6ffdf0

 
n1: 0
&n1: 0x6ffde8

*/
