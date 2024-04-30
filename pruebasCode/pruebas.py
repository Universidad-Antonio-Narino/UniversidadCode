lista = [33,5,18,96,1,45,3]
auxVar:int =0

for i in range(0,len(lista)):
    for j in range(i+1,len(lista)):
        if lista[i] > lista[j]:
            auxVar = lista[i]
            lista[i] = lista[j]
            lista[j] = auxVar
print(lista)