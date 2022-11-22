'''
Created on 21 nov 2022

@author: Alvaro
'''

lista1=[1,2,3,4,5,6,1]
lista2=[1,2,4,6,7,8,6]

def añadirIguales(lista1, lista2):
    listaIguales=[]
    for elemento in lista1:
        if (elemento in lista2) and (elemento not in listaIguales):
            listaIguales.append(elemento)
    
    return listaIguales

print(añadirIguales(lista1, lista2))