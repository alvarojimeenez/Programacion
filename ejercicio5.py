'''
Created on 15 nov 2022

@author: Alvaro
'''

5. 
lista = ['Di', 'buen', 'día', 'a','papa']
def reverse (lista):
    lista.reverse()
    return lista
print(reverse(lista))


def reverse1 (lista):
    listaInvertida = []
    for i in range (1,len(lista)+1):
        listaInvertida.append(lista[-i])
    return listaInvertida
print(reverse1(lista))