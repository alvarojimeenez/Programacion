'''
Created on Nov 28, 2022

@author: estudiante
'''

'''
Diseñar una función llamada numberInString que recibe una cadena
de caracteres como parámetro y devuelve cuántos de ellos 
son números.
'''

cadena = "543aaaa12345aaaaa6789"

def numberInString(cadena):
    contador = 0
    for elemento in cadena: 
        if elemento == '0' or elemento == '1' or elemento == '2' or elemento == '3' or elemento == '4' or elemento == '5' or elemento == '6' or elemento == '7' or elemento == '8' or elemento == '9':
            contador=contador+1
    return contador
print(numberInString(cadena))



