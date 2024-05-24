#include <iostream>

using namespace std;

struct Carga
{
    int semestre ;
    string cursos;
    float notasCurso[5];
};


struct Estudiante
{
    char nombre[60];
    char apellido[60];
    int edad;
    struct Carga carga;
}Estudiante[5];



int main(){
    /*
    Realizar un programa con struct que tenga una estructura llamada Estudiante y una estructura anidada dentro de la estructura estudiante llamada Carga, el programa debe ingresar las notas de 5 estudiantes de diferentes semestres y mostrar el promedio de las notas de cada semestre y de toda la carrera, imagine usted que los estudiantes se encuentran entre segundo y cuarto semestre.
    */
    for(int i = 0;i<2;i++){
        cout<<"digite su nombre: "<<endl;
        cin>>Estudiante[i].nombre;
        cout<<"Ingrese su apellido: "<<endl;
        cin>>Estudiante[i].apellido;
        cout<<"Ingrese su edad: "<<endl;
        cin>>Estudiante[i].edad;
        cout<<"Ingrese su semestre: "<<endl;
        cin>>Estudiante[i].carga.semestre;
        cout<<"Ingrese su curso: "<<endl;
        cin>>Estudiante[i].carga.cursos;
        for (int j = 0; j < 5; j++)
        {
            cout<<"Ingrese su Notas: "<<endl;
            cin>>Estudiante[i].carga.notasCurso[j];
        }
    }

    
    for(int i = 0;i<2;i++){
        cout<<"El nombre del estudiante es: "<<Estudiante[i].nombre<<endl;
        cout<<"El apellido del estudiante es: "<<Estudiante[i].apellido<<endl;
        cout<<"La edad del estudiante es: "<<Estudiante[i].edad<<endl;
        cout<<"El semestre del estudiante es: "<<Estudiante[i].carga.semestre<<endl;
        cout<<"El curso del estudiante es: "<<Estudiante[i].carga.cursos<<endl;
        int notaProm=0;
        for (int j = 0; j < 5; j++)
        {
            notaProm += Estudiante[i].carga.notasCurso[j];
        }
        cout<<"El Promedio de notas del estudiante "<<Estudiante[i].nombre<<" del semestre "<<Estudiante[i].carga.semestre<<" en el curso "<<Estudiante[i].carga.cursos<<" fue de: "<<notaProm/5<<endl;
    }

   
    fflush(stdin);
}