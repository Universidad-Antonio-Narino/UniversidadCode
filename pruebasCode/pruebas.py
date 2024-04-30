lista = [33,5,18,96,1,45,3]
def sortList(lista:list):
    auxVar:int =0
    for i in range(0,len(lista)):
        for j in range(i+1,len(lista)):
            if lista[i] > lista[j]:
                auxVar = lista[i]
                lista[i] = lista[j]
                lista[j] = auxVar
    return lista

def binarySearch(listaOrdenada:list,numToSearch:int):
    mitadLista =len(listaOrdenada)//2
    while listaOrdenada
    if listaOrdenada[mitadLista] > numToSearch:
        

newLista = sortList(lista)
binarySearch(newLista)
#inicio simpre 0
#mitad mitad de lista
#final ultimo dato
