import re
from collections import Counter

def verifica_cadena(u):
    # Verificamos si la cadena solo contiene caracteres de 'a', 'b', 'c'
    if re.fullmatch(r'[abc]*', u):
        # Contamos las ocurrencias de cada símbolo en la cadena
        contador = Counter(u)
        
        # Verificamos si cada símbolo tiene un número par de ocurrencias
        for count in contador.values():
            if count % 2 != 0:
                return "RECHAZA"
        return "ACEPTA"
    else:
        return "RECHAZA"

u0 = "abca"   # ACEPTA (a aparece 2 veces, b 1 vez, c 1 vez)
u1 = "abaca"  # RECHAZA (a aparece 3 veces, b 1 vez, c 1 vez)
u2 = "aabbcc" # ACEPTA (a 2 veces, b 2 veces, c 2 veces)
u3 = "abccba" 

print(verifica_cadena(u0))
print(verifica_cadena(u1))
print(verifica_cadena(u2))
print(verifica_cadena(u3))