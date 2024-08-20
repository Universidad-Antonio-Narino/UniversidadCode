#include <iostream>
using namespace std;

class Persona
{
    protected:
        string nombre;
        int edad;
    public:    
        Persona (string,int); //constructor 
        virtual void mostrar();
};

Persona::Persona(string _nombre, int _edad)
{
        nombre=_nombre;
        edad=_edad;
};

void Persona::mostrar()
{
        cout<<"Nombre: "<<nombre<<endl;
        cout<<"Edad: "<<edad<<endl;
};

class Alumno : public Persona
{
        private:
            float notaFinal;  
        public:
            Alumno(string, int, float); //constructor de alumno, hereda de la clase Persona
            void mostrar();
};

Alumno::Alumno(string _nombre, int _edad, float _notaFinal) : Persona (_nombre, _edad)
{
        notaFinal=_notaFinal;  
};

void Alumno::mostrar()
{
        Persona::mostrar();
        cout<<"Nota Final: "<<notaFinal<<endl;
};


class Profesor : public Persona
{
        private:
            string materia;  
        public:
            Profesor(string, int, string); //constructor de profesor, hereda de la clase Persona
            void mostrar();
};

Profesor::Profesor(string _nombre, int _edad, string _materia) : Persona (_nombre, _edad)
{
        materia=_materia;  
};

void Profesor::mostrar()
{
        Persona::mostrar();
        cout<<"Materia: "<<materia<<endl;
};

int main()
{
        Persona *lista1[3];
        lista1[0] = new Profesor("Juan",30,"Lógica");
        lista1[1] = new Alumno("Jose",19,4.5);
        lista1[2] = new Alumno("Maria",21,4.9);
        
        for(int i=0; i<3 ;i++)
            (*lista1[i]).mostrar();  //lista1->mostrar();
        
};
