#include <iostream>
using namespace std;
//auto-------------------------------
class Auto
{
private:
    int modelo;
public:
    Auto(int, string);
    Auto();
    void datos_auto();
    string marca;
};

Auto::Auto(int _modelo, string _marca)
{
modelo=_modelo;
marca=_marca;
}

Auto::Auto()
{
}
void Auto::datos_auto()
{
    cout<<"el auto que compro es modelo: "<<modelo<<" y marca: "<<marca<<endl;
}

//cliente----------------------------------
class Cliente
{
private:
    int id;
    //string nombre;
public:
    Cliente(int, string);
    Cliente();
    void información();
    string nombre;
};

Cliente::Cliente(int _id, string _nombre)
{
    nombre=_nombre;
    id=_id;
}

Cliente::Cliente()
{
}
void Cliente::información()
{
    cout<<"la información sobre el cliente es :\n nombre: "<<nombre<<" \n su id: "<<id<<endl;
}

//venta--------------------------------------
class Venta : public Cliente, public Auto
{
private:
    int n_fact;
    int fecha;
public:
    Venta(int, int);
    Venta();
    void info_venta();
};

Venta::Venta(int _n_fact,int _fecha)
{
    n_fact=_n_fact;     
    fecha=_fecha;
}

Venta::Venta()
{
}
void Venta::info_venta()
{
    cout<<"el cliente "<<Cliente::nombre<<" compro el auto marca "<<Auto::marca<< "el dia "<<fecha<<" con num. de factura "<<n_fact<<endl;
}



main(){
    Auto uno(2024,"toyota");
    Auto dos(2005,"kia");
    Cliente luis(12345,"luis");
    Cliente daniel(98765,"daniel");
    Venta primera(1,02032024);
    Venta segunda(2,01012024);

    uno.datos_auto();
    luis.información();
    primera.info_venta();
    
}