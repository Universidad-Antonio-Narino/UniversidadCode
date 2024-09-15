"""
Dado Σ = {1, 2, 3}, el lenguaje de todas las cadenas que comienzan con 123 y terminan con 321

Input Format

u ∈ Σ*

Output Format

ACEPTA o RECHAZA

Sample Input 0

123321
Sample Output 0

ACEPTA
Sample Input 1

32123
Sample Output 1

RECHAZA

analisis
para este ejercicio debo tener en cuenta 2 cosas, la primera es que la 
cantidad de caracteres a analisar son 3, tanto al inicio como al final
no me va importar la cantidad de cadenas que haya entre estos caracteres a analizar
si los caracteres son validos vemos que su salida debe ser acepta, noto que es un entero
lo cual me obliga en la verificacion hacer una conversion.
otra cosa nos importa la cantidad de caracteres, esto para poder saber la posicion de los ultimos 3 digitos
o caracteres(cuando se hace la verificacion).
sabemos otra cosa que si la variable es menor a 6 no va a pasar automaticamente sera rechazada

Desarrollo
Para este ejercicio puedo seguir usando las mismas funciones que se utilizo para los
ejercicios anteriores el slicing sera la funcion a utilizar.
ej: tomo el primer ejemplo
123321-> para el caso la entrada puede ser una variable entera que despues sera convertida
para el caso de el inicio sabemos que con slicing queda algo asi cadena[:3] -> esto quiere decir traigame
todo lo que encuentre en la cadena que este en la posicion inicial '0' hasta la posicion 3 que para el caso
de la lista es '2'
"""

string_To_Analyze_Regex = int(input())#Ingresa el valor como un entero

#analisis de la cadena
def Regex_Analise(String_To_Analyze):
    string_To_Analyze_Regex = str(String_To_Analyze) #conversion
    if len(string_To_Analyze_Regex) <6:
        return "RECHAZA"
    else:
        if int(string_To_Analyze_Regex[:3])== 123:
            if int(string_To_Analyze_Regex[len(string_To_Analyze_Regex)-3:])==321:
                return "ACEPTA"
            else:
                return "RECHAZA"
        else:
            return "RECHAZA"

print(Regex_Analise(string_To_Analyze_Regex))