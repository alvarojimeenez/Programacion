'''
Created on Nov 22, 2022

@author: estudiante
'''
numero = int(input("Introduce un número: "))
def computeFactorial (numero):
    if numero < 0: 
        return None 
    factorial = 1
    for i in range (0,numero-1):
        factorial = factorial * (numero-i)
    return factorial

print(computeFactorial(numero))
