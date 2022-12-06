'''
Created on Nov 28, 2022

@author: estudiante
'''

'''
Diseñar una función llamada característicosInString que tenga una cadena de caracteres
y un carácter como parámetros de entrada y devuelve cuántas veces ese carácter 
aparece en la cadena. Se debe hacerlo sin importar si la cadena y el carácter 
son minúsculas o mayúsculas.
'''

cadena = "REEEAAL BETiIS BALOMPIEEE"
caracter = input("Introduce un carácter: ")
def característicosInString(cadena):
    contador = 0
    for elemento in cadena:
        if elemento.upper() == caracter.upper():
            contador = contador +1
    return contador
print(característicosInString(cadena))