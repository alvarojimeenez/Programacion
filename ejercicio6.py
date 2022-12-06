'''
Created on Nov 28, 2022

@author: estudiante
'''


'''
Realizar una función que busque una palabra escondida dentro de 
un texto. Por ejemplo, si la cadena es “shybaoxlna” y la palabra 
que queremos buscar es “hola”, entonces si se encontrará y deberá 
devolver True, en caso contrario deberá devolver False. Las letras
de la palabra escondida deben aparecer en el orden correcto en 
la cadena que la oculta:

shybaoxlna ⇒ hola: True
soybahxlna ⇒ hola: False

'''


texto = "shybaoxlna"
cadena = "hola"
def buscarPalabra(texto):
    contador1 = 0
    contador2 = 0
    buscada = False
    while contador1<len(texto):
        if contador2<len(cadena) and cadena[contador2] == texto[contador1]:
            contador2 = contador2 + 1
        contador1 = contador1 + 1
    if contador2 == len(cadena):
        buscada = True 
    return buscada   
print(buscarPalabra(texto))