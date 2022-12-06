'''
Created on 2 dic 2022

@author: Alvaro
'''

'''
Escribir una función que devuelva el número de palabras que hay en una cadena que
recibe como parámetro. Ten en cuenta que entre dos palabras puede haber más de un
blanco. También al principio y al final de la frase puede haber blancos redundantes. Por
ejemplo, si la cadena es “He estudiado mucho”, debe devolver 3.
'''

cadena = 'He estudiado mucho'
cadena_vacia = " "
def contar_palabras(cadena):
    contador = 1
    espacio = 0
    for elemento in cadena: 
        if cadena_vacia in elemento:
            contador = contador + 1
    for i in range(len(cadena)-1):
        if (cadena_vacia in cadena[i]and cadena_vacia in cadena[i+1]):
            espacio = espacio+1 
    if cadena_vacia in cadena[0] or cadena_vacia in cadena[-1]:
        contador = contador -1     
    return contador-espacio
print(contar_palabras(cadena))
print(contar_palabras('Esto    es     un  programa  '))


