'''
Created on 24 nov 2022

@author: Alvaro
'''
'''
Diseñar un método llamado powerIt que recibe dos enteros y eleva el primero
número al segundo. Puede utilizar el producto o la recursión y comprobar los valores. Si
no exponente se proporciona el primer número se eleva a 0

'''
exponente = ""
def powerIt(base,exponente):
    potencia = base ** exponente
    return potencia
print(powerIt(2,0))
print(powerIt(3,5))