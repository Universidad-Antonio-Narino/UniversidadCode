"""
Dada una cadena, se debe extraer todas las subcadenas de dicha cadena. Por ejemplo, dado la cadena "java", todas las subcadenas son:

java

jav

ja

j

ava

av

a

va

v

a
"""
class Extraction_sub_strings:
    def __init__(self,string_input:str) -> None:
        self.sub_string = string_input

    @staticmethod
    def store_sub_strings(character:str):
        store = list()
        store.append(character)

