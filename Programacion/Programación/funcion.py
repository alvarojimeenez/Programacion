'''
Created on Oct 17, 2022
@author: estudiante
'''
'''


def nombre_accion_funcion (parametro_1, parametro_1,..., parametro_n):
    linea 1 de código de la función
    linea 2 de código de la función
      .
      .
      .
    linea n de código de la función
    return valor (opcional)
    
##Ejemplo:

# Función suma

def suma(numero_1, numero_2):
  resultado = numero_1 + numero_2
  return resultado

'''
  La función aplica el operador '+' a los dos valores 
  que recibe. En este caso si son numéricos los suma
  y si son cadenas de texto los concatena.
'''

print(suma(53, 156), 'VS',  suma("cadena ", "de texto"))


# Duplica

def duplica(valor):
  resultado = valor * 2

  return resultado


print(duplica(8), 'VS', duplica("Hola, mundo "))
