'''
Created on Nov 28, 2022

@author: estudiante
'''
''' 
Diseñar una función llamada upperCaseInString que tiene una 
cadena de caracteres como parámetro y el método debe devolver 
cuántos son letras mayúsculas.
'''

cadena = "aaaaaaHHHcVBN"

def upperCaseInString(cadena):
    contador = 0
    for elemento in cadena: 
        if elemento == elemento.upper():
            contador=contador+1
    return contador
print(upperCaseInString(cadena))


