class Auto:
    #Contructor de clase
    def __init__(self,modelo:int,marca:str) -> None:
        self.model = modelo
        self.marca = marca

    def infoAutos(self):
        print(f"el modelo del vehiculo es {self.model}, y su marca es {self.marca}")

class Cliente:
    #constructor de clase
    def __init__(self,id:int,nombre:str) -> None:
        self.id = id
        self.name = nombre

    def informacion(self):
        print("el id del usuario es {0}, y el nombre del usuario es {1}".format(self.id,self.name))

class Venta(Cliente, Auto):
    #constructor de clase
    def __init__(self,idVenta:int,fecha:str,id: int, nombre: str, modelo:int, marca:str) -> None:
        Cliente.__init__(self,id, nombre)
        Auto.__init__(self,modelo,marca)
        self.idVenta = idVenta
        self.fech = fecha

    def infoVenta(self):
        print("El identificador de la venta es: " , self.idVenta," en la fecha ",self.fech," del cliente ",self.name," por la compra de los articulos ",self.infoAutos())


a= Venta(1,"2024/3/2",2,"Eduardo",2024,"k")
a.infoVenta()
"""a.informacion()
a.infoAutos()"""