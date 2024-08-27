cadena_A = input().split(" ")
cadena_B = input().split(" ")

concatenacion_resultante = ""

for i in range(len(cadena_A)):
    for j in range(len(cadena_B)):
        concatenacion_resultante += f"{cadena_A[i]+cadena_B[j]} "
    
print(concatenacion_resultante)
