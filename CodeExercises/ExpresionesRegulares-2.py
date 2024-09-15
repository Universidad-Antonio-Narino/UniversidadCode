"""
VALIDO PARA 2 Y 3
Dado Σ = {a, b, c}, el lenguaje de todas las cadenas que tienen un número par de símbolos

Input Format

u ∈ Σ*

Output Format

ACEPTA o RECHAZA

Sample Input 0

abca
Sample Output 0

ACEPTA
Sample Input 1

abaca
Sample Output 1

RECHAZA

ANALISIS
Para este ejercicio,cambia un poco la logica voy a iterar en toda la cadena creare 3 variables, correspondiente a los 3 caracteres del alfabeto
tendre que iterar la cadena resultante y contar los caracteres, si el numero total de cualquiera de los 3 
caracteres es par la cadena es aceptada, de lo contrario es rechazada
DESARROLLO
Para este problema utilizare un for de toda la vida un forin que para java y c++ el cual me dara el caracter de cada letra y ahi se comenzara a contar cada letra que se repite.
if character is 'a':
        count_a
    por fin en python esta el swithc case
    se puede hacer asi con el if pero no es mas comodo con match
"""
count_a,count_b,count_c = 0,0,0

cadena_verificar = input()


for character in cadena_verificar:
   
    
    
    match character:
        case 'a':
            count_a +=1
        case 'b':
            count_b +=1
        case 'c':
            count_c +=1

total_contenido = count_a+count_b+count_c
print("ACEPTA" if total_contenido%2 == 0 else"RECHAZA")
