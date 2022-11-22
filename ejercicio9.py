'''
Created on 15 nov 2022

@author: Alvaro
'''

9. 



lista = [1,9,15,25,50,75,100]
k = int(input("Introduzca k: "))


def menores(lista):
    listaMenoresK = []
    for i in range (len(lista)):
        if lista[i] < k:
            listaMenoresK.append(lista[i])
    return listaMenoresK
    
def mayores(lista):
    listaMayoresK = []
    for i in range (len(lista)):
        if lista[i] > k:
            listaMayoresK.append(lista[i])
    return listaMayoresK
def multiplos (lista):
    lista_multiplo = []
    for i in range (len(lista)):
        if lista[i] % k == 0:
            lista_multiplo.append(lista[i])
    return lista_multiplo
    

print("Los numeros menores que K son:",menores(lista))
print("Los numeros mayores que K son:",mayores(lista))
print("Los multiplos de k son:",multiplos(lista))