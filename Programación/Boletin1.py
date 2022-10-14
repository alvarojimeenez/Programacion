'''
Created on Sep 20, 2022

@author: estudiante
'''

print("Ejercicio_2")

# a) 27 mod 4 + 15\4
print("ApartadoA")

print(27%4+15/4, type(27%4+15/4))

# b) 37\4^2–2
print("ApartadoB")

print(37/4**2-2, type(37/4**2-2))

# c) 9*2/3*10*3
print("ApartadoC")

print(9*2/3*10*3, type(9*2/3*10*3))

# d) (7*3–4*4)^2\4*2
print("ApartadoD")

print((7*3-4*4)**2/4*2, type((7*3-4*4)**2/4*2))

print("Ejercicio_1")

#a) 7>=27 AND NOT (7<=2)
print("ApartadoA")

print(7>=27 and not(7<=2))

#b) 24>5 AND 10<=10 OR 10=5
print("ApartadoB")

print(24>5 and 10<=10 or(10==5)) 

#c) (10>=15 OR 23=13) AND NOT(8=8)
print("ApartadoC")

print(10>=15 or(23==13 and not(8==8)))

#d) NOT (6/3>3) OR 7>7
print("ApartadoD")

print(not(6/3>3) or(7>7))

print("Ejercicio_5")

# a) (A OR B) AND NOT(A)
print("ApartadoA")

a = True
b= True 

print((a or b)  and not (a))

print("--------")

a = True
b = False

print((a or b)  and not (a))

print("--------")

a = False
b = True 

print((a or b)  and not (a))

print("--------")

a = False 
b = False 

print((a or b)  and not (a))

print("--------")

# b) NOT (A OR B) AND B
print("ApartadoB")

a = True 
b = True 

print(not (a or b) and b)

print("--------")

a = True 
b = False 

print(not (a or b) and b)

print("--------")

a = False 
b = True 

print(not (a or b) and b)

print("--------")

a = False 
b = False  

print(not (a or b) and b)

print("--------")

# c) A OR NOT (B)
print("ApartadoC")

a = True 
b = True 

print(a or not (b))

print("--------")

a = True 
b = False

print(a or not (b))

print("--------")

a = False 
b = True 

print(a or not (b))

print("--------")

a = False 
b = False 

print(a or not (b))

print("--------")

# d) NOT ((A AND B) AND (B OR A))
print("ApartadoD")

a = True 
b = True 

print(not ((a and b) and (b or a)))

print("--------")

a = True 
b = False 

print(not ((a and b) and (b or a)))

print("--------")

a = False 
b = True 

print(not ((a and b) and (b or a)))

print("--------")

a = False 
b = False 

print(not ((a and b) and (b or a)))


print("Ejercicio_3")

print("ApartadoA")

precio = 60
print(60 <= precio and precio <= 420)

precio = 350
print(60 <= precio and precio <= 420)

precio = 420
print(60 <= precio and precio <= 420)

print("ApartadoB")

numero = 15 
print(numero % 2 == 1)

numero = 16 
print(numero % 2 == 1)

print("ApartadoC")
saldo = 1000
dineroSacar = 500 

print(saldo >= 0 and saldo >= dineroSacar and dineroSacar >= 0)

saldo = 1000
dineroSacar = 2000

print(saldo >= 0 and saldo >= dineroSacar and dineroSacar >= 0)


print("ApartadoD")

hora = 0
minuto = 0
print(0 <= hora <= 23 and 0 <= minuto <= 59)

hora = 23
minuto = 59
print(0 <= hora <= 23 and 0 <= minuto <= 59)

hora = 24
minuto = 60
print(0 <= hora <= 23 and 0 <= minuto <= 59)


print("ApartadoE")

estadoCivil = 'S'
print(not( estadoCivil == 'S' or estadoCivil == 'C' or estadoCivil == 'V' or estadoCivil == 'D'))

estadoCivil = 'C'
print(not( estadoCivil == 'S' or estadoCivil == 'C' or estadoCivil == 'V' or estadoCivil == 'D'))

estadoCivil = 'V'
print(not( estadoCivil == 'S' or estadoCivil == 'C' or estadoCivil == 'V' or estadoCivil == 'D'))

estadoCivil = 'D'
print(not( estadoCivil == 'S' or estadoCivil == 'C' or estadoCivil == 'V' or estadoCivil == 'D'))

estadoCivil = 'P'
print(not( estadoCivil == 'S' or estadoCivil == 'C' or estadoCivil == 'V' or estadoCivil == 'D'))


print("Ejercicio_4")

print("ApartadoA")

cantidad = 350
print(0 < cantidad <=300)

cantidad = 250 
print(0 < cantidad <=300)

cantidad = -100
print(0 < cantidad <=300)




print("ApartadoB")

edad = 17
print(not(16 <= edad <= 22))

edad = 21
print(not(16 <= edad <= 22))

edad = 23
print(not(16 <= edad <= 22))

print("ApartadoC")




print("ApartadoD")
numero = 21
numero = 15 
numero = 14 
numero = 16

 print(not(numero%7 == 0 or numero%3 == 0))


