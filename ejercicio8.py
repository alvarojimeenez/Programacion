'''
Created on 24 nov 2022

@author: Alvaro
'''


'''
Diseñar un método llamado solveSecondOrderEquation que recibe tres enteros
números positivos correspondientes a los coeficientes de una ecuación de segundo orden
(ax2+bx+c=0) y calcula sus posibles soluciones. Si los parámetros no son válidos
método debe devolver Ninguno.
'''

a= float(input("Introduzca el valor de a: "))
b= float(input("Introduzca el valor de b: "))
c= float(input("Introduzca el valor de c: "))
def solveSecondOrderEquation (a,b,c):
    valorNulo = b**2-4*a*c
    if valorNulo < 0:
        return None
    x =(-b+(b**2-4*a*c)**(1/2))/(2*a)
    x2 =(-b-(b**2-4*a*c)**(1/2))/(2*a)
    ecuacion = x,x2
    return ecuacion
print(solveSecondOrderEquation(a, b, c))


