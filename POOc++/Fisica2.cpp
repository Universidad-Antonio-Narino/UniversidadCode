#include <iostream>
using namespace std;

class Fisica{
private:
  float t;
public:
  Fisica(float);
  double funciones(float t);
  double funciones2(float t);
  void imprimir(double pos, double vel, float t);
};

Fisica::Fisica(float _t){ //constructor
  t= _t; 
}
//instanciar la función
double Fisica::funciones(float t){//velocidad final
  double xi=8.0, g=10.0, vi=-2.0;//variables
  double vf;
  vf = xi + vi*t;
  return vf;
}
double Fisica::funciones2(float t){//posición final
  double xi=8.0, g=10.0, vi=-2.0;//variables
  double xf;
  xf = xi + vi*t + (g*t*t)/2; //operaciones
  return xf;
}
void Fisica::imprimir(double pos, double vel, float t){
	cout<<"la velocidad final en el tiempo "<<t<< " es: "<<vel<<endl;
	cout<<"la posición final en el tiempo "<<t<< " es: "<<pos<<endl;
}

int main() {
  float time;
  for(int x=0; x<=4; x++){
    cout<< "Ingrese el tiempo "<< x+1 <<" :\n";
    cin>>time;
    Fisica tt = Fisica(time);
    tt.imprimir(tt.funciones2(time),tt.funciones(time),time);
  }
}
