'''
Created on 15 nov 2022

@author: Alvaro
'''

4. 

lista = []
numero = int
def sucesionNumeros (numero):
    numero = int(input("Introduzca un numero: "))
    while numero >= 0:
        lista.append(numero)    
        numero = int(input("Introduzca un numero: "))
    return lista

def mostrarElementoMayor(lista):
    mayor = lista[0]
    for i in range (len(lista)):
        if lista[i] > mayor: 
            mayor = lista[i]
    return mayor

def es_Par (numero):
    lista_pares = []
    for i in lista:
        if i %2 == 0:
            lista_pares.append(i)
    return lista_pares
print(sucesionNumeros(lista))  
print("El numero mayor es",mostrarElementoMayor(lista))
print("Numeros pares:",es_Par(lista))    
