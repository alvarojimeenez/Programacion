'''
Created on Sep 26, 2022

@author: estudiante
'''

temperatura = 40 

if temperatura > 25 and temperatura < 50: 
    print("Encendiendo aire acondicionado")
else: 
    print("Apagado")

if temperatura > 50 and temperatura < 15 : 
    print("Encendiendo aire acondicionado")
else: 
    print("Apagado")

if temperatura > 25 or temperatura < 50 : 
    print("Encendiendo aire acondicionado")
else: 
    print("Apagado")

temperatura = 51 

if temperatura > 25 :
    print("Encendiendo aire acondicionado")
    print("A refrescarse")
    
elif temperatura > 15 and temperatura <=25:
    print("Encendemos ventilador")

elif temperatura <= 15:
    print("Encendemos la calefacción")

print("Hasta mañana")


edad = int(input("Dime tu edad: "))

if edad >= 18:
    print("Eres mayor de edad")
else: 
    print("Eres menor de edad")




