'''
Created on Oct 17, 2022

@author: estudiante
'''
'''

nombre = "Rigoberta Bandini"
inversa = ""
tmp = ""
for i in range(len(nombre)):
    inversa = nombre[i] + inversa
print(inversa)
    
for a in nombre: 
    tmp = a + tmp
print(inversa, tmp)




year = 2024

print(len(str(year)))

'''


fecha = input("Introduzca una fecha en formato dd-mm-yyyy: ")

day = int(fecha[0:2])
month = int(fecha[3:5])
year = int(fecha[6:10])

print(day, month, year)





