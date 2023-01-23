'''
Created on Nov 3, 2022

@author: estudiante
'''


'''
def elevar (base,exp):
    return base ** exp 

def sumar (n1,n2):
    return n1+n2

def multiplicar (n_1,n_2):
    return n_1*n_2 

def operar (p1,p2):
    return elevar(p1,p2), sumar(p1,p2), multiplicar(p1,p2)

print(operar(3,2))
'''

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
'''

2. 
'''
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
print(desplazarDerecha(lista)
'''     
      
lista = [1,3,5,7]
def desplazarIzquierda(lista):
    a_escribir = lista[3]
    a_guardar = 0
    for i in range (len(lista)):     
        if i == lista[0]:
            lista[3] = a_escribir
        else: 
            a_guardar = lista[(i-1)]
            lista[(i-1)] = a_escribir
            a_escribir = a_guardar
    return lista
print(desplazarIzquierda(lista))

''' 
3. 
cadena = ""

def solicitarFecha (dia,mes,anio):
    dia = int(input("Introduce el dia de la fecha: "))
    while dia > 0:
        while not (1 <= dia <= 31):
            dia = int(input("Introduce el dia de la fecha correcto: "))
        mes = int(input("Introduce el mes de la fecha: "))
        while not (1 <= mes <= 12):
            mes = int(input("Introduce el mes de la fecha correcto: "))
        anio = int(input("Introduzca un año: "))
    cadena = (f"La fecha en formato largo es {dia} de {mes} de {anio}")
    
    return cadena

print(solicitarFecha(dia,mes,anio))




4. 

lista = []
def sucesionNumeros (numero):
    numero = int(input("Introduzca un numero: "))
    while numero >= 0:
        numero = int(input("Introduzca un numero: "))
        if numero >= 0:
            lista.append(numero)    
    return lista

def mostrarElementoMayor(lista):
    mayor = lista[0]
    for i in range (len(lista)):
        if lista[i] > mayor: 
            mayor = lista[i]
    return mayor
print(sucesionNumeros(lista))  
print("El numero mayor es",mostrarElementoMayor(lista))

'''

   
 
 
 
 
    









