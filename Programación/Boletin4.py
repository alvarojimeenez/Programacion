'''
Created on 28 sept 2022

@author: Alvaro
'''

'''
1. 
from math import sqrt
cateto1 = 4
cateto2 = 3

hipotenusa = sqrt((cateto1**2)+(cateto2**2))
print("La hipotenusa es" , hipotenusa)


2.

temperatura = int(input("Introduzca una temperatura: "))

print((temperatura-32)*0.5556,"Cº")

3.

num1 = int(input("Introduzca un numero: "))
num2 = int(input("Introduzca un numero: "))
num3 = int(input("Introduzca un numero: "))

media = (num1 + num2 + num3)/3
print("La media es", media)




4.

total = 400

descuento = total-(total*0.15)
print("El total de la compra será", descuento)




5.

num1 = int(input("Introduzca un numero: "))
num2 = int(input("Introduzca otro numero: "))

print(num1-num2)


6.
from math import sqrt
x1 = int(input("Introduzca x1: "))
y1 = int(input("Introduzca y1: "))
x2 = int(input("Introduzca x2: "))
y2 = int(input("Introduzca y2: "))


distancia = sqrt((x2-x1)**2 + (y2-y1)**2)

print("La distancia es:", distancia)


7. 

num = 27

raizCuadrada = num ** 0.5
raizCubica = (num) ** (1./3.)
print("La raiz cuadrada es:", raizCuadrada ,"y la raiz cubica: ",raizCubica)




8.

moneda2e = int(input("¿Cuántas monedas de 2 euros tenemos?: "))
moneda1e = int(input("¿Cuántas monedas de 1 euro tenemos?: "))
moneda50 = int(input("¿Cuántas monedas de 50 centimos tenemos?: "))
moneda20 = int(input("¿Cuántas monedas de 20 centimos tenemos?: "))
moneda10 = int(input("¿Cuántas monedas de 10 centimos tenemos?: "))

totalE = moneda2e*2 + moneda1e*1
totalC = moneda50* 0.50 + moneda20 * 0.20 + moneda10 * 0.10

print(totalE + totalC,"€")



9.

base = int(input("Introduzca base: "))
exponente = int(input("Introduzca exponente: "))

potencia = base ** exponente
print("La potencia es: ",potencia)

if exponente > 0: 
    print(potencia)
if exponente == 0:
    potencia = 1
if exponente < 0:
    potencia = (1/potencia** exponente>0)
    
 
    
10. 

lado1 = 3
lado2 = 4
lado3 = 1

if lado3 == (lado1**2 + lado2**2)**0.5:
    print("Es un triángulo rectángulo")
elif lado1==lado2 and lado2==lado3 and lado1==lado3:
    print("El triángulo es equilátero")
elif lado1==lado2 or lado2==lado3 or lado1==lado3:
    print("El triángulo es isósceles")
else:
    print("Es un triángulo escaleno")



11. 

año = int(input("Introduzca el año: "))

if año % 4 == 0 or año % 400 == 0:
    print("Es bisiesto")
elif año % 100 != 0:
    print("No es bisiesto")



12.

precio = 80 
tipo = str(input("Introduzca el tipo: "))
tamaño = int(input("Introduzca el tamaño: "))

if tipo == 'A' and tamaño == 1:
    print(precio+20,"céntimos")
if tipo == 'A' and tamaño == 2:
    print(precio+30,"céntimos")
if tipo == 'B' and tamaño == 1:
    print(precio-30,"céntimos")
if tipo == 'B' and tamaño == 2:
    print(precio-50,"céntimos")


'''
13.
alumno = int(input("Introduzca numero de alumnos: "))

if alumno >= 100:
    print(65+viaje)
if 50 <= alumno <= 99:
    print(70+viaje)
if 30 <= alumno <= 49 / 4000:
    print(95+viaje)
if alumno < 30 :
    print("Se pagarán 4000 euros por la renta del autobus")





'''
14.

5 min = 1 euro 5*1
3 min = 80 centimos 3*0,80
2 min = 70 centimos 2* 0,70
<10 = 50 centimos
impuesto 3% si es domingo
impuesto de 15% en turno de mañana
impuesto de 10% si es turno de tarde







15.  

dia = int(input("Introduza dia de la semana: "))
if 1 <= dia <= 7:
    if dia == 1:
        print("Es lunes")
    if dia == 2:
        print("Es martes")
    if dia == 3:
        print("Es miercoles")
    if dia == 4:
        print("Es jueves")
    if dia == 5:
        print("Es viernes")
    if dia == 6:
        print("Es sábado")
    if dia == 7:
        print("Es domingo")
else:
    print("Error")




16.

numero = int(input("Introduzca un numero: "))

if 1 <= numero <=12:
    if numero == 1 or numero ==3 or numero== 5 or numero == 7 or numero == 8 or numero== 10 or numero == 12:
        print("Tiene 31 días")
    if numero == 4 or numero == 6 or numero == 9  or numero == 11:
        print("Tiene 30 días")
    if numero == 2:
        print("Tiene 28 días")
        
    

'''




