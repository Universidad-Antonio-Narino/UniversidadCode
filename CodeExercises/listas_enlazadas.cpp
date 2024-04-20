#include <iostream>
// LISTAS PUEDEN TENER DATOS DE DISTINTO TIPO LOS ARREGLOS LA TIENEN DEL MISMO TIPO

using namespace std;

class Lista{
private:
	class Nodo{
		public:
			int info;
			Nodo* siguiente;
		};

	Nodo* raiz;
public:
	Lista(); //Constructor
	~Lista(); //Destructor
	int numeroNodos();
	void insertar(int posicion, int x);
	int extraer(int posicion);
	void borrar(int posicion);//BORRA EL NODO
	void intercambiar(int posicion1, int posicion2);//LAS LISTAS PERMITEN INTERCAMBIAR NODOS DE POSICIÓN
	bool vacia();//APUNTA SI LA LISTA ESTA VACIA
	int mayor();
	void imprimir();
	int posicionMayor();
	bool ordenada();
	bool existe(int x);
};

Lista::Lista() //Constructor
{
	raiz = NULL; // SIN ELEMENTOS
}

Lista::~Lista()//BORRA EVERYTHING
{
	Nodo* recorrido = raiz; //APUNTADOR LOCAL, Y ESTE RECORRERA TODOS LOS NODOS
	Nodo* borrar; // BORRA EL NODO
	while (recorrido!= NULL)
	{
		borrar = recorrido; //SE MUEVE TAMBIEN CON EL RECORRIDO, ES DECIR SE UBICA EN EL PRIMER NODO
		recorrido = recorrido->siguiente;//"RECORRIDO" ACCEDE A "SIGUIENTE", ES DECIR ME MUESTRA EL NODO SIGUIENTE
		delete borrar;
	}
}


int Lista::numeroNodos()
{
	Nodo* recorrido = raiz; //
	int cantidad = 0;
	while (recorrido != NULL)
	{
		cantidad++;
		recorrido = recorrido->siguiente;
	}
	return cantidad;//me devuelve el len de la lista
}

void Lista::insertar(int posicion, int x)
{
	if (posicion <= numeroNodos() + 1) //Cuenta cuantos nodos hay e inserta en el siguiente nodo
	{
		Nodo* nuevo = new Nodo();
		nuevo->info = x;
		cout <<"posicion-actual "<<posicion<<endl;
		if (posicion == 1)  //Se inserta al principio de la lista
		{
			nuevo->siguiente = raiz;
			raiz = nuevo;
			
		}
		else
			if (posicion == numeroNodos() + 1) //Se inserta al final de la lista
			{
				Nodo* recorrido = raiz;
				while (recorrido->siguiente != NULL)
				{
					recorrido = recorrido->siguiente;
				}
				
				recorrido->siguiente = nuevo;
				nuevo->siguiente = NULL;
			}
			else
			{
				Nodo* recorrido = raiz;
				for (int f = 1; f <= posicion-1; f++)
				{
					
					cout <<"recorrido-f "<<f <<" posicion"<<posicion<<endl;
					recorrido = recorrido->siguiente;
				}
				Nodo* siguiente_aux = recorrido->siguiente;
				recorrido->siguiente = nuevo;
				nuevo->siguiente = siguiente_aux;
			}
	}
}


int Lista::extraer(int posicion)
{
	if (posicion <= numeroNodos())
	{
		int informacion;
		Nodo* borrar;
		if (posicion == 1)
		{
			informacion = raiz->info;
			borrar = raiz;
			raiz = raiz->siguiente;
		}
		else
		{
			Nodo* recorrido;
			recorrido = raiz;
			for (int f = 1; f <= posicion - 1; f++)
			{
				recorrido = recorrido->siguiente;
			}
			Nodo* prox = recorrido->siguiente;
			recorrido->siguiente = prox->siguiente;
			informacion = prox->info;
			borrar = prox;
		}
		delete borrar;
		return informacion;
	}
	else
		return -1;
}

void Lista::borrar(int posicion)
{
	if (posicion <= numeroNodos())
	{
		Nodo* borrar;
		if (posicion == 1)
		{
			borrar = raiz;
			raiz = raiz->siguiente;
		}
		else {
			Nodo* recorrido;
			recorrido = raiz;
			for (int f = 1; f <= posicion - 1; f++)
			{
				recorrido = recorrido->siguiente;
			}
			Nodo* prox = recorrido->siguiente;
			recorrido->siguiente = prox->siguiente;
			borrar = prox;
		}
		delete borrar;
	}
}

void Lista::intercambiar(int posicion1, int posicion2)
{
	if (posicion1 <= numeroNodos() && posicion2 <= numeroNodos())
	{
		Nodo* recorrido1 = raiz;
		for (int f = 1; f < posicion1; f++)
		{
			recorrido1 = recorrido1->siguiente;
		}
		Nodo* recorrido2 = raiz;
		for (int f = 1; f < posicion2; f++)
		{
			recorrido2 = recorrido2->siguiente;
		}
		int aux = recorrido1->info;
		recorrido1->info = recorrido2->info;
		recorrido2->info = aux;
	}
}

bool Lista::vacia()
{
	if (raiz == NULL)
		return true;
	else
		return false;
}


int Lista::mayor()
{
	if (!vacia())
	{
		int mayor = raiz->info;
		Nodo* recorrido = raiz->siguiente;
		while (recorrido != NULL)
		{
			if (recorrido->info > mayor)
			{
				mayor = recorrido->info;
			}
			recorrido = recorrido->siguiente;
		}
		return mayor;
	}
	else
		return -1;
}

void Lista::imprimir()
{
	Nodo* recorrido = raiz;
	cout << "Listado completo.\n";
	while (recorrido != NULL)
	{
		cout << recorrido->info << "-";
		recorrido = recorrido->siguiente;
	}
	cout << "\n";
	cout << "Número de nodos: " <<numeroNodos() << endl;
}


int Lista::posicionMayor()
{
	if (!vacia())
	{
		int mayor = raiz->info;
		int x = 1;
		int posicion = x;
		Nodo* recorrido = raiz->siguiente;
		while (recorrido != NULL)
		{
			if (recorrido->info > mayor)
			{
				mayor = recorrido->info;
				posicion = x;
			}
			recorrido = recorrido->siguiente;
			x++;
		}
		return posicion;
	}
	else
		return -1;
}

bool Lista::ordenada()
{
	if (numeroNodos() > 1)
	{
		Nodo* recorrido1 = raiz;
		Nodo* recorrido2 = raiz->siguiente;
		while (recorrido2 != NULL)
		{
			if (recorrido2->info < recorrido1->info)
			{
				return false;
			}
			recorrido2 = recorrido2->siguiente;
			recorrido1 = recorrido1->siguiente;
		}
	}
	return true;
}

bool Lista::existe(int x)
{
	Nodo* recorrido = raiz;
	while (recorrido != NULL)
	{
		if (recorrido->info == x)
			return true;
		recorrido = recorrido->siguiente;
	}
	return false;
}


int main()
{ 
	double numero;
	cout << "Programa para mostrar listas enlazadas \n";
	Lista* lista = new Lista(); //Crea el objeto lista de manera dinámica, se utiliza un apuntador lista de tipo Lista
	lista->insertar(1, 1);
	lista->imprimir();
	lista->insertar(2, 2);
	lista->imprimir();
	lista->insertar(3, 3);
	lista->imprimir();
	lista->insertar(4, 4);
	lista->imprimir();
	lista->insertar(3, 10);
	lista->imprimir();
    /*
    if (lista->ordenada())
		cout << "\nLa lista esta ordenada de menor a mayor\n";
	else
		cout << "\nLa lista no esta ordenada de menor a mayor\n";
	*/
	
	//cout << "\nLuego de Borrar el primero\n";
	lista->extraer(1);
	lista->imprimir();
	
	lista->borrar(1);
	lista->imprimir();
	//cout << "\nLuego de Extraer el segundo\n";
	//lista->extraer(2);
	//lista->imprimir();
	/*
	cout << "\nLuego de Intercambiar el primero con el tercero\n";
	lista->intercambiar(1, 3);
	lista->imprimir();
	if (lista->existe(20))
		cout << "\nSe encuentra el 20 en la lista\n";
	else
		cout << "\nNo se encuentra el 20 en la lista\n";
	cout << "\nLa posicion del mayor es:" << lista->posicionMayor() << "\n";
	*/
	/*
	if (lista->ordenada())
		cout << "\nLa lista esta ordenada de menor a mayor\n";
	else
		cout << "\nLa lista no esta ordenada de menor a mayor\n";
	
	delete lista;
	*/
	return 0;
}
