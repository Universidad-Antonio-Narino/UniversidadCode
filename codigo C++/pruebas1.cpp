#include <iostream>
#include <string>

using namespace std;

class Auto //Plantilla
{
    private: //Atributos
        int modelo;
        string marca;
    public:
        Auto(int modelo,string marca);
        void infoAutos();
};
//constructor clase auto
//Contenido de la clase Auto
Auto::Auto(int _modeloVehiculo, string _marcaVehiculo){
    modelo = _modeloVehiculo;
    marca = _marcaVehiculo;
};

void Auto::infoAutos(){
    cout<<"El modelo del vehiculo es: "<<modelo<<endl;
    cout<<"La marca del vehiculo es: "<<marca<<endl;
}

class Cliente
{
private:
    int id;
    string name;
public:
    Cliente(int, string);
    void informacionCliente();
};
//Contructor clase cliente
//Contenido de la clase Cliente
Cliente::Cliente(int _idCliente, string _nameCliente){
    id = _idCliente;
    name = _nameCliente;
};
void Cliente::informacionCliente(){
    cout<<"El modelo del vehiculo es: "<<id<<endl;
    cout<<"La marca del vehiculo es: "<<name<<endl;
};

class Venta: public Cliente, public Auto // forma de hacer herencia multiple
{
    private:
        int nFact;
        string fecha;
    public:
        Venta(int, string, int, string, int, string);
        void infoVenta();
        //void infoVentaDiferente();
};

Venta::Venta(int _idClient, string _nameClient, int _modeloAut, string _marcaAut, int _nFctura, string _fechaFactura) : Cliente(_idClient,_nameClient), Auto(_modeloAut,_marcaAut){
    nFact = _nFctura;
    fecha = _fechaFactura;
}

void Venta::infoVenta(){
    cout<<"El identificador de la venta es: "<<nFact<<endl;
    cout<<"En la fecha: "<<fecha<<endl;
    cout<<"del cliente: "; 
    informacionCliente();
    cout<<"Propietario de un vehiculo con las siguientes caracteristicas: "<<endl;
    infoAutos();
}
/*
void Venta::infoVentaDiferente(){
    cout<<"El identificador de la venta es: "<<nFact<<endl;
    cout<<"En la fecha: "<<fecha<<endl;
    cout<<"del cliente: "<< Cliente::name<<endl;//acceder a este atributo es i,posible 
    cout<<"Propietario de un vehiculo con las siguientes caracteristicas: "<<endl;
    infoAutos();
}
*/

int main()
{
    Venta venta1(1,"Diego",2024,"Suzuki",1,"2024/02/03");
    venta1.infoVenta();
}
