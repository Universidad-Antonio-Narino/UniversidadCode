alfabeto = input().split(" ")
sucesiones = int(input())

def generated_language(alfabeto:list,iter:int):
    aux = alfabeto.copy()
    cadena = ""
    total_cadenas = sum([len(alfabeto)**x for x in range(1,iter+1)])
    for i in aux:
        if len(aux) == total_cadenas:
            break
        else:
            for j in range(len(alfabeto)):
                cadena += i+alfabeto[j]
                aux.append(cadena)
                cadena = ""
    #aux[len(alfabeto):]
    return aux
print(generated_language(alfabeto,sucesiones))