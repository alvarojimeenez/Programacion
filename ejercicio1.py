'''
Created on 15 nov 2022

@author: Alvaro
'''

1. 

from random import randint

lista = []
for i in range (0,100):
    lista.append(randint(0,1000))
print(lista)
def obtenerElementoMayor(lista):
    mayor = lista[0]
    for i in range (len(lista)):
        if lista[i] > mayor:
            mayor = lista[i]
    return mayor

def obtenerElementoMenor(lista):
    menor = lista[0]
    for i in range (len(lista)):
        if lista[i] < menor:
            menor = lista[i]
    return menor


def sumarTodosLosNumeros(lista):
    suma = 0
    for i in range (len(lista)):
        suma = suma + lista[i]
    return suma


def obtenerMedia(lista):
    suma = 0 
    for i in range (len(lista)):
        suma = suma + lista[i]
        media = suma / len(lista)
    return media


def mostrarNumeros(lista):
    return lista



valorASustituir = int(input("Introduzca un valor a sustituir: "))
sustituto = int(input("Introduzca el sustituto: "))
def sustituirValores(lista, valorASustituir, sustituto):
    for i in range (len(lista)):
        if valorASustituir == lista[i]:
            lista[i] = sustituto
    return lista
 
print("El mayor es",obtenerElementoMayor(lista))
print("El menor es",obtenerElementoMenor(lista))
print("La suma de todos los numero es",sumarTodosLosNumeros(lista))
print("La media es",obtenerMedia(lista))
print(sustituirValores(lista, valorASustituir, sustituto))
print(mostrarNumeros(lista))