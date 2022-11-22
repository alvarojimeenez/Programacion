'''
Created on 15 nov 2022

@author: Alvaro
'''

10. 

numero = input("Introduce un numero binario: ")
def binario_a_decimal(numero): 
    posicion = 0
    decimal = 0
    numero = numero[::-1]
    for i in numero:
        multiplicar = 2 ** posicion
        decimal = decimal + multiplicar * int(i) 
        posicion = posicion + 1
    return decimal
print(binario_a_decimal(numero))
                  
decimal = int(input("Introduce un numero decimal: "))
def decimal_a_binario(decimal):
    resultado = ""
    while decimal//2 !=0:
        resultado = str(decimal%2) + resultado
        decimal = decimal // 2
    return str(decimal) + resultado 
print(decimal_a_binario(decimal))


