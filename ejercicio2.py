'''
Created on Nov 22, 2022

@author: estudiante
'''
agnio = int(input("Introduce un año: "))
def isLeapYear(numero):
    bisiesto = False 
    if (agnio % 4 == 0 and (agnio % 100 != 0 or agnio % 400 == 0)):
        bisiesto = True 
    return bisiesto 

print(isLeapYear(agnio))

