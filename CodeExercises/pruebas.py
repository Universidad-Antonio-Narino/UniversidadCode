cadena ="hello"
sigma_estrella = list()
def creator_substring(cadena):
    if 1 == len(cadena) or len(cadena) == 0:
        if len(cadena) == 1:
            sigma_estrella.append(cadena)
        return 
    else:
        for i in range(len(cadena),0,-1):
            sigma_estrella.append(cadena[:i])
        cadena=cadena[1:len(cadena)]
        creator_substring(cadena)
print(creator_substring(cadena))
print(sigma_estrella)