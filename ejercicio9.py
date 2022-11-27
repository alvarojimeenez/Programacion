'''
Created on Nov 24, 2022

@author: estudiante
'''

listaDivisores = []
numero = int(input("Introduce un numero: "))
def esNumerosPrimos (numero):
    es_primo = True 
    for i in range (2,numero):
        if numero%i == 0:
            es_primo = False 
    return es_primo

def getPrimeDivisors (numero):
    for i in range (2,numero):
        if numero % i == 0:
            listaDivisores.append(i)
    listaPrimos = []
    for elemento in listaDivisores:
        if esNumerosPrimos(elemento):
            listaPrimos.append(elemento)
    return listaPrimos 
   
print(getPrimeDivisors(numero))