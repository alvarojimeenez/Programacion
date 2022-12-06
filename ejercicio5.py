'''
Created on Nov 28, 2022

@author: estudiante
'''

'''
Diseñar una función llamada palíndromo que tiene una cadena de
caracteres como parámetro de entrada, y devuelve Verdadero si 
es un palíndromo o Falso en otros casos. Una palabra es un
palíndromo si puede leerse de izquierda a derecha o de derecha 
a izquierda, ignorando los blancos. Por ejemplo: "anilina" o
"Dabale arroz a la zorra el abad" Para simplificar el problema, 
se puede suponer que se usan caracteres simples, es decir, 
sin tildes ni diresis.
'''

cadena = "Dabale arroz a la zorra el abad".lower()
cadena = cadena.replace(" ","")
cadena2 = cadena[::-1]
def palindromo(cadena):
    esPalindromo = False
    if cadena == cadena2: 
        esPalindromo = True 
    return esPalindromo
print(palindromo(cadena))
