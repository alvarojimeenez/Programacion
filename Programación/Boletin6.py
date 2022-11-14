'''
Created on 9 oct 2022

@author: Alvaro
'''


1.

for i in range (1,101):
    print(i)
    if i % 7 == 0 and i % 13 == 0:
        print("El numero es multiplo de 7 y 13")
    elif i % 7 == 0:
        print("El numero es multiplo de 7")
    elif i % 13 == 0:
        print("El numero es multiplo de 13")



2.

for i in range (0,11):
    tabla = 7 * i 
    print(f'7 x {i} = {tabla}')



 
3. 

cantidad = int(input("¿Cuántos numeros quieres introducir? "))
for cantidad in range (0,cantidad):
    numero = int(input("Introduzca un numero mayor que 0: "))
    while numero <= 0:
        print("El número no es válido, debe ser mayor que 0")
        numero = int(input("Introduzca un numero mayor que 0: "))
    if numero % 2 == 0:
        print("El número es par")
    else:
        print("Es impar")



4.

n = int(input("Introduzca un numero mayor que 0: "))

while n <= 0:
    print("El numero no está bien, intentalo de nuevo")
    n = int(input("Introduzca un numero mayor que 0: "))
suma = n/1 + n
print("La suma de los primeros numeros N es",suma)


5.
numero = int(input("Introduzca un número(negativo para terminar): "))
contador = 0
while numero >= 0:
    numero = int(input("Introduzca un número(negativo para terminar): "))
    contador = contador + 1
print("Has introducido",contador,"numeros positivos")    
    
    
6.

numberA = int(input("Ingrese número: "))
numberB = int(input("Ingrese número: "))
suma = 0
while numberB != 0:
    suma = suma + numberA
    numberB = numberB -1
print("El producto es", suma)


    
7.

numero = int(input("¿Cuántos numeros quieres introducir? "))
contador = 0
for numero in range (0,numero):
    i = int(input("Introduzca un numero mayor que 0: "))
    while i <= 0:
        print("El número no es válido, debe ser mayor que 0")
        i = int(input("Introduzca un numero mayor que 0: "))
    contador = contador + i      
media = contador / (numero + 1)
print("La media es",media)   
      

8.

numero = int(input("Introduzca un número: "))
menor = numero

respuesta = str(input("¿Quieres introducir más números(Y/N)? "))
while respuesta == 'Y':
    numero = int(input("Introduzca un número: "))
    respuesta = str(input("¿Quieres introducir más números(Y/N)? "))
    while numero < menor:
        menor = numero
print("El numero menor es",menor)
            
    
9.

numero = int(input("Ingrese un numero entero positivo mayor que 0: "))
             
while numero <= 0:
    print("El numero no es valido, inténtalo de nuevo")
    numero = int(input("Ingrese un numero entero positivo mayor que 0: "))
    
suma = 0   
    
for i in range (1,numero):
    if numero % i ==0:
        suma= suma+i
    
if suma == numero:
    print("El numero es perfecto")
else:
    print("No es perfecto")


10. 

numero = int(input("Introduzca un numero entero positivo: "))
factorial = 1
while numero < 0:
        print("El numero no es válido. Introduzca un numero positivo.")
        numero = int(input("Introduzca un numero entero positivo: "))
for i in range (0,numero-1):
    factorial = factorial * (numero-i)
print("El factorial es",factorial)

17.


a = int(input("Introduzca un numero: "))
b = int(input("Introduzca otro numero: "))

for i in range (a,b):
    if i % 2 != 0:
        continue
    print(i)

18. 

limInf = int(input("Introduce limite inferior: "))
limSup = int(input("Introduce limite superior: "))

while limInf >= limSup:
    limInf = int(input("El limite inferior no puede ser superior al limite superior. Introduce limite inferior: "))
numero = int(input("Introduce un numero entre el limite inferior y limite superior"))

suma = 0
fuera = 0
igual = 0

while numero != 0:

    if limInf < numero < limSup:
        suma = suma + numero
    elif numero < limInf or numero > limSup:
        fuera = fuera + 1
    else:
        igual = igual + 1
    
    numero = int(input("Introduce un numero entre el limite inferior y limite superior"))
print("La suma de los numeros dentro del intervalo es",suma,"fuera del intervalo hay",fuera,"y hay",igual,"numeros igual a los limites del intervalo")


19.

base = int(input("Introduzca una base: "))
exponente = int(input("Introduzca un exponente: "))
potencia = 1
while exponente < 0:
    print("El numero no es válido. Introduzca un numero positivo.")
    exponente = int(input("Introduzca un exponente: "))
for i in range (1,exponente+1):
    potencia = potencia * base
print("El resultado de la potencia es",potencia)



20.

pago = 10
suma = pago

for i in range (2,21):
    pago = pago * 2
    print("El pago del mes es: ",pago,"€")
    suma = suma + pago
print("El total será",suma,"€")









