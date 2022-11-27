'''
Diseñar un método llamado getDayOfWeek que recibe una lista que contiene tres enteros
(día, mes y año) y devuelve el día de la semana para esa fecha (lunes,
Martes, miércoles, jueves, viernes, sábado, domingo).
Puede utilizar el siguiente algoritmo para obtener un número entre 0 (domingo) y 6
(Sábado) correspondiente al día de la semana para una fecha determinada
'''




dia = int(input("Introduce un dia: "))
mes = int(input("Introduce un mes: "))
agnio = int(input("Introduce un año: "))
lista = [dia,mes,agnio]


def getDayOfWeek(lista):
    fecha = ['Lunes','Martes','Miercoles','Jueves','Viernes','Sabado','Domingo']
    a = (14-mes)/12
    y = agnio-a
    m = mes + 12 * a
    d = (dia+y+y/4-y/100+y/400+(31*m)/12)%7
    return fecha[int(d)]
print(getDayOfWeek(lista))