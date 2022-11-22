'''
Created on 21 nov 2022

@author: Alvaro
'''

lista = ['Ana', 'Alvaro', 'Alberto', 'Francisco','Maria']
letra = input("Introduzca una letra: ").upper()
def filtrarNombres (lista):
    nombres_lista = []
    for elemento in lista:
        if elemento[0]==letra:
            nombres_lista.append(elemento)
    return nombres_lista
print(filtrarNombres(lista))
    
