'''
Created on Nov 28, 2022

@author: estudiante
'''

'''
Diseñe una función llamada lowCaseInString que tenga una cadena 
de caracteres como parámetro, el método debe devolver cuántos 
de esos caracteres son letras minúsculas.
'''


cadena = input("Introduzca una cadena: ")
def lowCaseInString(cadena):
    contador = 0
    for elemento in cadena: 
        if elemento == elemento.lower():
            contador=contador+1
    return contador
print(lowCaseInString(cadena))