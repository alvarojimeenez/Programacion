'''
Created on 19 oct 2022

@author: Alvaro
'''

1.

num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce otro número: "))
division = 0
while num1 >= num2:
    num1 = num1 - num2
    division = division + 1

print("El cociente es",division,"y el resto es",num1)


2. 

numero = int(input("Introduzca numero: "))
multiplo = int(input("Introduzca multiplo: "))
cadena =""
contador = 0
inicio = numero

while contador <10:
    inicio+=1
    if inicio%multiplo==0:
        if contador!=9:
            cadena+=str(inicio)+", "
        else:
            cadena+=str(inicio)
        contador= contador + 1
print(f"{numero} y {multiplo} -->" + cadena)

     


3.
numero = ""
while numero != 0:
    mensaje = ""
    numero = int(input("Introduce un número: "))
    if numero % 2 == 0:
        mensaje+="Es par, "
    else:
        mensaje+="Es impar, "
    if numero > 0:
        mensaje+="positivo"
    else:
        mensaje+="negativo"
    cuadrado = numero ** 2
    print(mensaje,"y su cuadrado es",cuadrado)   


    
4.

#a. 1, -5, 25, -125, 625, -3125


numero = int(input("Secuencia númerica: "))
incremento = -5
cadena = ""
for i in range (numero):
    cadena= cadena+ str(incremento**i)
    if i < numero - 1 :
        cadena = cadena + ", "
print(cadena)

#b. 1, -1, 0, 1, -1, 0

numero = int(input("Secuencia numérica: "))
incremento = -3
cadena = ""
for i in range (numero):
    cadena= cadena+ str((i%incremento)+1)
    if i < numero - 1 :
        cadena = cadena + ", "
print(cadena) 






#c. 1, 3, 9, 27, 81, 243   
    
  
numero = int(input("Secuencia númerica: "))
incremento = 3
cadena = ""
for i in range (numero):
    cadena= cadena+ str(incremento**i)
    if i < numero - 1 :
        cadena = cadena + ", "
print(cadena)   
   


5.

num1 = int(input("Introduzca un numero: "))
num2 = int(input("Introduzca otro numero"))
lista = []

while num1 != 1:
       
    if num1 % 2 == 0:
        num1 = num1//2
        lista.append(num1)
    else: 
        num1 = (3*num1) + 1
        lista.append(num1)
print(lista)

while num2 != 1:
       
    if num2 % 2 == 0:
        num2 = num2//2
        lista.append(num2)
    else: 
        num2 = (3*num2) + 1
        lista.append(num2)
print(lista)



6.
edad = int(input("¿Cuántos años cumples? "))
totalD = int
totalP = int
for i in range (1,edad): 
    if i == 1:
        puzzle = 1
        totalP = puzzle
    elif i == 2:
        dinero = 20
        totalD = dinero
    elif i % 2 == 0:
        dinero = dinero +15
        totalD = totalD + dinero
    else:
        puzzle = puzzle * 2
        totalP = totalP + puzzle

print("Tendrá un total de",totalD,"euros y",totalP,"puzzles.")




    