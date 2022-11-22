'''
Created on 15 nov 2022

@author: Alvaro
'''

7.

ficha1 = [5,4]
ficha2 = [2,5]

def encajan(ficha1, ficha2):
    if ficha1[0] == ficha2[0] or ficha1[0] == ficha2[1] or ficha1[1] == ficha2[0] or ficha1[1] == ficha2[1]:
        return True 
    else: 
        return False 

print(encajan(ficha1, ficha2))