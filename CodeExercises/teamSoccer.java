import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		//VARIABLES DE SUMA PARA EL MARCADOR DE LOS DOS EQUIPOS
	    	int SumaEquipoOne = 0;
	    	int SumaEquipoTwo = 0;
		//array de los dos equipos
		int[] Partido =new int[10];
		Random rand = new Random();
		for(int j = 0;j<10;j++){
		  int team = rand.nextInt(2);
		  if(j%2==0){
		    Partido[j] = team;
		  }
		  else{
		      Partido[j] = team;
		  }
		}
		
		for(int j = 0;j<10;j++){
		  int team = rand.nextInt(2);
		  if(j%2 == 0){
		    SumaEquipoOne+=Partido[j];
		  }
		  else{
		    SumaEquipoTwo+=Partido[j];
		  }
		}
		System.out.println("Equipo 1: "+SumaEquipoOne);
		System.out.println("Equipo 2: "+SumaEquipoTwo);
		if(SumaEquipoTwo == SumaEquipoOne){
		    System.out.println("Empate");
		}else{
		    if(SumaEquipoOne>SumaEquipoTwo){
		        System.out.print("Gana el 1");
		    }else{
		        System.out.println("Gana el 2");
		    }
		}
	}
}
