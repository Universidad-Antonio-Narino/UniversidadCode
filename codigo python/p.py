class Auto:
    # Contructor de clase
    def __init__(self, modelo: int, marca: str) -> None:
        self.modelo = modelo
        self.marca = marca

    def infoAutos(self):
        print(f"El modelo del vehículo es {self.modelo}, y su marca es {self.marca}")

class Cliente:
    # Constructor de clase
    def __init__(self, id: int, nombre: str) -> None:
        self.id = id
        self.nombre = nombre

    def informacion(self):
        print(f"El id del usuario es {self.id}, y el nombre del usuario es {self.nombre}")

class Venta(Cliente, Auto):
    # Constructor de clase
    def __init__(self, idVenta: int, fecha: str, id_cliente: int, nombre_cliente: str, modelo_auto: int, marca_auto: str) -> None:
        Cliente.__init__(self, id_cliente, nombre_cliente)
        Auto.__init__(self, modelo_auto, marca_auto)
        self.idVenta = idVenta
        self.fecha = fecha

    def infoVenta(self):
        print("El identificador de la venta es:", self.idVenta, "en la fecha", self.fecha, "del cliente", self.nombre)
        self.infoAutos()


a = Venta(1, "2024/3/2", 2, "Eduardo", 2024, "k")
a.infoVenta()
