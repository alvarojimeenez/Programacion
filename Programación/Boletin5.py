'''
Created on Oct 14, 2022

@author: estudiante
'''


'''

1.

nota = int(input("Introduce una nota: "))

if 90 <= nota <= 100:
    print(nota,"Sobresaliente")
elif 70 <= nota <= 89:
    print(nota,"Notable") 
elif 60 <= nota <= 69:
    print(nota,"Bien")
elif 50 <= nota <= 59:
    print(nota,"Suficiente")
elif 0 <= nota <= 49:
    print(nota,"Suspenso")
    


2.
hemisferio = str(input("Introduce el hemisferio: ")).upper()
dia = int(input("Introduce el día: "))
mes = int(input("Introduce el mes: "))

if hemisferio == 'NORTE':
    if (mes == 9 and 23 <= dia <= 30) or (mes == 10 and 1 <= dia <= 30 or mes == 11 and 1 <= dia <= 30) or (mes == 12 and 1 <= dia < 21):
        print("Es otoño")
    if  (mes == 12 and 22 <= dia <= 31) or (mes == 1 and 1 <= dia <= 31 or mes == 2 and 1 <= dia <= 28) or (mes == 3 and 1 <= dia < 21):
        print("Es invierno")
    if (mes == 3 and 21 <= dia <= 31) or (mes == 4 and 1 <= dia <= 30 or mes == 5 and 1 <= dia <= 31) or (mes == 6 and 1 <= dia <21):
        print("Es primavera")
    if (mes == 6 and 21 <= dia <= 30) or (mes == 7 and 1 <= dia <= 31 or mes == 8 and 1 <= dia <= 31) or (mes == 9 and 1 <= dia < 23):
        print("Es verano") 
elif hemisferio == 'SUR':
    if (mes == 9 and 23 <= dia <= 30) or (mes == 10 and 1 <= dia <= 30 or mes == 11 and 1 <= dia <= 30) or (mes == 12 and 1 <= dia < 21):
        print("Es primavera")
    if  (mes == 12 and 22 <= dia <= 31) or (mes == 1 and 1 <= dia <= 31 or mes == 2 and 1 <= dia <= 28) or (mes == 3 and 1 <= dia < 21):
        print("Es verano")
    if (mes == 3 and 21 <= dia <= 31) or (mes == 4 and 1 <= dia <= 30 or mes == 5 and 1 <= dia <= 31) or (mes == 6 and 1 <= dia <21):
        print("Es otoño")
    if (mes == 6 and 21 <= dia <= 30) or (mes == 7 and 1 <= dia <= 31 or mes == 8 and 1 <= dia <= 31) or (mes == 9 and 1 <= dia < 23):
        print("Es invierno")
                                    
                                                   
          
    
    







'''


3.

fecha = input("Introduzca una fecha en formato dd-mm-yyyy: ")

dia = int(fecha[0:2])
mes = int(fecha[3:5])
año = int(fecha[6:10])

print(dia, mes, año)


if mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12:
    if 1 <= dia <=31:
        print(len("dd-mm-yyyy"))
        print("dia %s, mes %s, año %s" % (dia[0:2]), (mes[3:5]), (año[6:10]))
if mes == 4 or mes == 6 or mes == 9 or mes == 11:
    if 1 <= dia <= 30:
        print(dia,"-",mes,"-",año)
if año % 4 == 0 and mes == 2:
    if 1 <= dia <= 29:
        print(dia,"-",mes,"-",año)  
        
        
        
        
    