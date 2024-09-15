import re
cadena = input().strip()

patron = r"^([bc]*a[bc]*a[bc]*)*$|^[bc]*$|^[ac]*b([ac]*b[ac]*b[ac]*)*$"

if re.fullmatch(patron,cadena):
    print("ACEPTA")
else:
    print("RECHAZA")