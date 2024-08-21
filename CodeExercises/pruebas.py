"""
for i in range(3,12,3):
    #print(i," -> ",min(i + 2, 9))
    
    print("\n")
"""
numberRestriccion = int(input(": "))
for identations in range(1,9,3):
    for multipli in range(1,11):
        linea = ""
        for tabla in range(identations,identations+3):
            if(tabla<numberRestriccion):
                linea += "\t-x-=-\t"
            else:
                linea += f"\t{tabla}x{multipli}={tabla*multipli}\t"
        print(linea)
    print("".center(len(linea)*2,"-"))