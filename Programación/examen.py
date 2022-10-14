'''
Created on Oct 4, 2022

@author: estudiante
'''

print("Bienvenido al gimnasio Jacafitness")

hora = int(input("Dime la hora: "))
minuto = int(input("Introduzca minutos: "))
dia = str(input("Dime dia de la semana: "))

if dia == 'Lunes' or dia == 'Miercoles' or dia == 'Viernes':
    if 12 <= hora < 14:
        if 0 <= minuto <= 59:
            print("En este horario se imparte spinning")
    if 16 <= hora < 20:
        if 0 <= minuto <= 59:
            print("En este horario se imparte yoga")
    if 20 <= hora < 22:
        if 0 <= minuto <= 59:
            print("En este horario se imparte body combat")
elif dia == 'Martes' or dia == 'Jueves':
    if 12 <= hora < 14:
        if 0 <= minuto <= 59:
            print("En este horario se imparte yoga")
    if 16 <= hora < 20:
        if 0 <= minuto <= 59:
            print("En este horario se imparte spinning")
    if 20 <= hora < 22:
        if 0 <= minuto <= 59:
            print("Se imparte body combat")
else:
    print("Está cerrado")    
    
    
    
    
    
        
    
    