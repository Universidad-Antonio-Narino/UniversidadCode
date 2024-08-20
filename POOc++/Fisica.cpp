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

double Fisica::funciones2(float t){//posición final
  double xi=8.0, g=10.0, vi=-2.0;//variables
  double xf;
  double vf;
  vf = xi + vi*t;//vel
  xf = xi + vi*t + (g*t*t)/2; //pos
  return xf;
  return vf;
}
void Fisica::imprimir(double pos,double vel, float t){
	cout<<"la velocidad final en el tiempo "<<t<< " es: "<<vel<<endl;
	cout<<"la posición final en el tiempo "<<t<< " es: "<<pos<<endl;
}

int main() {
  float time;
  for(int x=0; x<=4; x++){
    cout<< "Ingrese el tiempo "<< x+1 <<" :\n";
    cin>>time;
    Fisica tt = Fisica(time);
    tt.imprimir(tt.funciones2(time), tt.funciones2(time), time);
  }
}
