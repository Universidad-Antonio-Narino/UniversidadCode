


def imprimir_tablas_cuadrado():
    print("".center(30,"-"))
    for j in range(0,9,3):
        for i in range(1,11):
            print(f"{j+1}x{i}={(j+1)*i}\t{j+2}x{i}={(j+2)*i}\t{j+3}x{i}={(j+3)*i}")
        print("".center(30,"-"))
            



imprimir_tablas_cuadrado()
