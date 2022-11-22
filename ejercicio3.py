'''
Created on 15 nov 2022

@author: Alvaro
'''
3. 
cadena = ""
dia = int
mes = int
anio = int
nombresMes = ""
def solicitarFecha (dia,mes,anio):
    dia = int(input("Introduce el dia de la fecha: "))
    while not (1 <= dia <= 31):
        dia = int(input("Introduce el dia de la fecha correcto: "))
    mes = int(input("Introduce el mes de la fecha: "))
    while not (1 <= mes <= 12):
        mes = int(input("Introduce el mes de la fecha correcto: "))
    anio = int(input("Introduzca un año: "))
    while anio < 0:
        anio = int(input("Introduzca un año correcto: "))
    if mes == 1:
        nombresMes = 'Enero'
    elif mes == 2:
        nombresMes = 'Febrero'
    elif mes == 3:
        nombresMes = 'Marzo'
    elif mes == 4:
        nombresMes = 'Abril'
    elif mes == 5:
        nombresMes = 'Mayo'
    elif mes == 6:
        nombresMes = 'Junio'
    elif mes == 7:
        nombresMes = 'Julio'
    elif mes == 8:
        nombresMes = 'Agosto'
    elif mes == 9:
        nombresMes = 'Septiembre'
    elif mes == 10:
        nombresMes = 'Octubre'
    elif mes == 11:
        nombresMes = 'Noviembre'
    elif mes == 12:
        nombresMes = 'Diciembre'
    
    cadena = (f"La fecha en formato largo es {dia} de {nombresMes} de {anio}")
    
    return cadena

print(solicitarFecha(dia,mes,anio))