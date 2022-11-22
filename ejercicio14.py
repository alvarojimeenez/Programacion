'''
Created on 21 nov 2022

@author: Alvaro
'''

cadena1 ="sevilla, huelva, jaen, almeria, granada, malaga, cadiz, cordoba"
cadena2 ="huelva, jaen, almeria, granada, malaga, cadiz, sevillaaaaaaaaaa"

print(len(cadena1))
print(len(cadena2))


def decir_mas_larga (cadena1,cadena2):
    if len(cadena1)>len(cadena2):
        return cadena1
    if len(cadena2)>len(cadena1):
        return cadena2
    else: 
        return "Son iguales"
print(decir_mas_larga(cadena1, cadena2))

def devolver_caracteres_repetidos (cadena1,cadena2):
    if len(cadena1) == len(cadena2):
        cadena_nueva_1= []
        cadena_nueva_2= []
        for i in range(len(cadena1)):
            if cadena1[i] not in cadena_nueva_1:
                cadena_nueva_1.append(cadena1[i])
            if cadena2[i] not in cadena_nueva_2:
                cadena_nueva_2.append(cadena2[i])
        if cadena_nueva_1>cadena_nueva_2:
            return cadena2
print(f"Cadena larga --> {devolver_caracteres_repetidos(cadena1,cadena2)}")
            
            
                    


