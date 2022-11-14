'''
Created on Oct 28, 2022

@author: estudiante
'''

'''
1,1,2,3,5,8,13,21,34,55
'''

secuencia = int(input("Longitud de la secuencia: "))
valorAnterior = 1
valorActual = int
for i in range (0,secuencia):
    
    if i == 0:
        valorAnterior = 1
        valorActual = valorAnterior
    elif i == 1:
        valorAnterior = 1
        valorActual = valorAnterior
        valorAnterior = valorAnterior + valorActual
        valorActual = valorActual + valorAnterior
    else:
        valorAnterior = valorAnterior + valorActual
        valorActual = valorActual + valorAnterior
        
    print(valorActual)
    