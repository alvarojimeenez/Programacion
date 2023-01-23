'''
Created on Oct 21, 2022

@author: estudiante
'''

peso = float(input("Indique el peso: "))
while peso > 250:
    peso = float(input("El peso es incorrecto.Introduzca el peso: "))
while peso > 0:
    edad = int(input("Indique su edad: "))
    while (1 > edad > 80):
        print("Indique una edad correcta")
        edad = int(input("Indique su edad: "))
    tipo = input("¿Cuál es su tipo de vida?") 
    while tipo !='Sedentaria' and tipo !='Activa' and tipo !='Muy activa':
        print("Indique un tipo de vida válido")
        tipo = input("¿Cuál es su tipo de vida?")
         
    if (edad > 70 and tipo == 'Sedentaria') or (peso > 100) or (peso > 74.4 and edad > 50):
        print("Se recomienda ir al médico")
    else: 
        print("No es urgente que acuda al médico si no tiene problemas de salud")        
 
    peso = float(input("Indique el peso: "))
    while peso > 250:
        peso = float(input("El peso es incorrecto.Introduzca el peso: ")) 