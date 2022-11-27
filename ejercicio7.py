'''
Created on 24 nov 2022

@author: Alvaro
'''

'''
Diseñar un método llamado isPrime que recibe un número entero positivo mayor
como parámetro. El método debe devolver Verdadero si el número es primo o Falso si
no prime. Si el parámetro no es válido, el método debe devolver None
'''

numero = int(input("Introduzca un número mayor que 0: "))

def isPrime(numero): 
    if numero > 0:
        es_primo = True 
        for i in range (2,numero):
            if numero%i == 0:
                es_primo = False
    else: 
        es_primo = None     
    return es_primo
print(isPrime(numero))


        