'''
Created on 9 oct 2022

@author: Alvaro
'''

'''
1.

for i in range (1,100):
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
      
'''


8.




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

'''

17.


a = int(input("Introduzca un numero: "))
b = int(input("Introduzca otro numero: "))

for i in range (a,b):
    if i % 2 != 0:
        continue
    print(i)
    

'''   


18. 











