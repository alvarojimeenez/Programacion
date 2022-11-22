'''
Created on 21 nov 2022

@author: Alvaro
'''


lista1=['a',2,'i','o','u']
lista2=[1,'e',3,4,5]


def unionListas(lista1, lista2):
    conjunto=[]
    for i in range(len(lista1)):
        if lista1[i]!=lista2[i]:
            conjunto.append(lista2[i]) 
            conjunto.append(lista1[i])
    return conjunto

print(unionListas(lista1,lista2))
