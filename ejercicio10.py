'''
Created on Nov 25, 2022

@author: estudiante
'''
'''
Diseñar un método llamado isFriendNumber que recibe dos números positivos y
devuelve Verdadero si los números son amigos, Falso de lo contrario. Dos números son
considerados amigos si la suma de sus divisores, excepto el número dado, es igual
a la segunda y viceversa.
'''

num1 = int(input("Introduce un numero: "))
num2 = int(input("Introduce otro número: "))
divisores_num1 = []
divisores_num2 = []
def obtenerDivisores(num1,num2):  
    for i in range (1,num1):
        if num1 % i == 0:
            divisores_num1.append(i)
    for x in range(1,num2):
        if num2 % x == 0:
            divisores_num2.append(x)
    return divisores_num1,divisores_num2


def isFriendNumber(divisores_num1,divisores_num2):
    suma_lista1= 0
    suma_lista2 = 0
    for elemento in divisores_num1:
        suma_lista1 = suma_lista1 + elemento
    for elemento2 in divisores_num2:
        suma_lista2 = suma_lista2 + elemento2 
    if suma_lista1 == suma_lista2:
        return True 
    else: 
        return False
    
        

print(obtenerDivisores(num1,num2))
print(isFriendNumber(divisores_num1, divisores_num2))
        
            