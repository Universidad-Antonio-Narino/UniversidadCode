import re

cadena_veri = input()

patron = r"^([abc][abc])*$"

verif = re.findall(patron,cadena_veri,re.X)
if len(verif) > 0:
    print("ACEPTA")
else:
    print("RECHAZA")