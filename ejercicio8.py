'''
Created on 2 dic 2022

@author: Alvaro
'''
'''
Diseñar una función que determine la cantidad de vocales diferentes, que tiene una
palabra o frase introducida por teclado. Por ejemplo, la cadena “Abaco”, devolvería 2.
'''


cadena = 'murcielago' .lower()
letra = 'aeiou'

def contar_vocales(cadena):
    contador = 0
    lista_vocales = []
    for elemento in cadena: 
        if elemento in letra and (elemento not in lista_vocales):
            lista_vocales.append(elemento)
            contador= contador+1
    return contador 

print(contar_vocales(cadena))