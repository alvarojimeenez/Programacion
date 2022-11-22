'''
Created on 15 nov 2022

@author: Alvaro
'''

8. 

lista = []

def añadirNumerosLista (numero):
    numero = int(input("Introduzca un numero: "))
    while numero >= 0:
        lista.append(numero)    
        numero = int(input("Introduzca un numero: "))
    return lista

def esNumerosPrimos (numero):
    es_primo = True 
    for i in range (2,numero):
        if numero%i == 0:
            es_primo = False 
    return es_primo
def numerosPrimos(numero):
    listaPrimos = []
    for elemento in lista:
        if esNumerosPrimos(elemento):
            listaPrimos.append(elemento)
    return listaPrimos



def sumatorio (lista):
    suma = 0
    for i in range (len(lista)):
        suma = suma + lista[i]
    return suma

def promedioValores(lista):
    suma = 0 
    for i in range (len(lista)):
        suma = suma + lista[i]
        media = suma / len(lista)
    return media

def obtenerFactorial (numero):
    factorial = 1
    for i in range (0,numero-1):
        factorial = factorial * (numero-i)
    return factorial

def añadirFactorial (numero):
    listaFactorial = []
    for elemento in lista:
        if obtenerFactorial(elemento):
            listaFactorial.append(obtenerFactorial(elemento))
    return listaFactorial
        

print("Lista-->",añadirNumerosLista(lista))
print("La suma de todos los numeros es:",sumatorio(lista))
print("El promedio de los valores es:",promedioValores(lista))
print("Factorial-->",añadirFactorial(lista))
print("Primos-->",numerosPrimos(lista))