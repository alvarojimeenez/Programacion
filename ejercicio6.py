'''
Created on 26 nov 2022

@author: Alvaro
'''

'''
Diseñar un método llamado getNumberOfDigits que recibe un número (puede ser
real, entero, positivo o negativo) y debe devolver el número de dígitos que contiene. Si
el parámetro no es válido el método debe devolver Ninguno. Extender esta función a
otros sistemas numéricos (hexadecimal, decimal, binario, octal
'''




def getNumberOfDigits(numero):
    cadena = ""
    cadena = cadena + str(numero) 
    contador = 0
    if type(numero) != float and type(numero) != int:
            return None
    for i in range (len(cadena)):     
        if cadena[i] != '.' and cadena[i] != '-':
            contador = contador+1
    return contador
print(getNumberOfDigits("a"))
print(getNumberOfDigits(1.23))
print(getNumberOfDigits(-1))