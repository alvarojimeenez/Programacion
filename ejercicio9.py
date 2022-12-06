'''
Created on 2 dic 2022

@author: Alvaro
'''

'''
Crear una función que, tomando una cadena de texto como entrada, construya y
devuelva otra cadena formada de la siguiente manera: todas las consonantes estarán al
principio y todas las vocales al final de la misma, eliminando los blancos. Por ejemplo,
pasándole la cadena "curso de programacion", una posible solución sería
"crsdprgrmcnuoeoaaio’.
'''

cadena = 'curso de programacion'
vocales='aeiou'
cadena_vacia = " "

def cadena_consonantes_vocales (cadena):
    cadenaC=""
    cadenaV=""
    cadena_nueva = ""
    for elemento in cadena:
        if elemento not in vocales and elemento not in cadena_vacia:
            cadenaC = cadenaC + elemento
        elif elemento in vocales:
            cadenaV = cadenaV + elemento
        cadena_nueva = str(cadenaC) + str(cadenaV)
    return cadena_nueva
            
            
print(cadena_consonantes_vocales(cadena))