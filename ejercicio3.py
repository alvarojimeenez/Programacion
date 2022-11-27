'''
Created on Nov 22, 2022

@author: estudiante
'''


agnio = int(input("Introduce un año: "))
def isLeapYear(agnio):
    bisiesto = False 
    if (agnio % 4 == 0 and (agnio % 100 != 0 or agnio % 400 == 0)):
        bisiesto = True 
    return bisiesto 


mes = int(input("Introduce un mes: "))
def computeDaysInMonth(mes,agnio):
    if mes in [1,3,5,7,8,10,12]:
        return 31
    elif mes in [4,6,9,11]:
        return 30
    else:
        if isLeapYear(agnio):
            return 29 
        else: 
            return 28
print(computeDaysInMonth(mes, agnio))