'''
Created on 15 nov 2022

@author: Alvaro
'''

6. 

lista = [7,6,8,4]

def menorAMayor(lista):
    ordenada=True 
    for i in range (len(lista)-1):
        if lista[i] > lista[i+1]:
            ordenada = False 
    return ordenada

def mayorAMenor(lista):
    ordenada=True 
    for i in range (len(lista)-1):
        if lista[i] < lista[i+1]:
            ordenada = False 
    return ordenada

def estaOrdenada(lista):
    if menorAMayor(lista)== True or mayorAMenor(lista) == True:
        return True 
    else:
        return False 
print(estaOrdenada(lista))