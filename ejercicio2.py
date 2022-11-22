'''
Created on 15 nov 2022

@author: Alvaro
'''

2. 


lista = [1,3,5,7]
def desplazarDerecha(lista):
    a_escribir = lista[0]
    a_guardar = 0
    for i in range (len(lista)):     
        if i == len(lista) -1:
            lista[0] = a_escribir
        else: 
            a_guardar = lista[(i+1)]
            lista[(i+1)] = a_escribir
            a_escribir = a_guardar
    return lista
print(desplazarDerecha(lista))