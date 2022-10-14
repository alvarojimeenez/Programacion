'''
Created on Sep 26, 2022

@author: estudiante
'''
'''
1.

numero = int(input("Introduce un numero: "))

if numero%2 == 0:
    print("Es par")
else: 
    print("Es impar")
   
2. 

numero1 = int(input("introduce primer número: "))
numero2 = int(input("Introduce segundo numero: "))

if numero1 == numero2: 
    print("Son iguales")
elif numero1 > numero2: 
    print(numero1 , "es mayor que" , numero2)
elif numero2 > numero1: 
    print(numero1 , "es menor que" , numero2)
    

3. 

multiplo = int(input("Introduce un numero: "))

if multiplo%2 == 0: 
    print("El numero" , multiplo , "es mutiplo de 2")
if multiplo%3 == 0:
    print("El numero" , multiplo , "es multiplo de 3")

    
4. 
edad = 80

if 30 <= edad <= 100: 
    print("Es un adulto")
elif 0 <= edad <= 12: 
    print("Es un niño")
elif 13 <= edad <= 17:
    print("Es un adolescente")
elif 18 <= edad <= 29:
    print("Es un joven")

edad = 8

if 30 <= edad <= 100: 
    print("Es un adulto")
elif 0 <= edad <= 12: 
    print("Es un niño")
elif 13 <= edad <= 17:
    print("Es un adolescente")
elif 18 <= edad <= 29:
    print("Es un joven")
edad = 15

if 30 <= edad <= 100: 
    print("Es un adulto")
elif 0 <= edad <= 12: 
    print("Es un niño")
elif 13 <= edad <= 17:
    print("Es un adolescente")
elif 18 <= edad <= 29:
    print("Es un joven")
edad = 25

if 30 <= edad <= 100: 
    print("Es un adulto")
elif 0 <= edad <= 12: 
    print("Es un niño")
elif 13 <= edad <= 17:
    print("Es un adolescente")
elif 18 <= edad <= 29:
    print("Es un joven")


5. 

numero1 = int(input("introduce primer número: "))
numero2 = int(input("introduce segundo número: "))
numero3 = int(input("introduce tercer número: "))
numero4 = int(input("introduce cuarto número: "))

media = (numero1+numero2+numero3+numero4) / 4
print("La media es:",media)

if numero1 > media:
    print(numero1, "es mayor que la media")
if numero2 > media:
    print(numero2, "es  mayor que la media") 
if numero3 > media:
    print(numero3, "es mayor que la media")
if numero4 > media:
    print(numero4, "es mayor que la media")
  
 
6. 

caracter = str(input("Introduce un carácter: "))

if caracter == 'a' or caracter == 'e' or caracter == 'i' or caracter == 'o' or caracter == 'u' :
    print("Es una vocal")
else: 
    print("No es una vocal")
    
if caracter == 'a':
    print("Es la primera vocal(A)")
if caracter == 'e':
    print("Es la segunda vocal(E)")
if caracter == 'i':
    print("Es la tercera vocal(I)")
if caracter == 'o':
    print("Es la cuarta vocal(O)")
if caracter == 'u':
    print("Es la quinta vocal(U)")


7. 

estadoCivil = 'S'
edad = 19 
print("Es soltero y tiene" , edad , "años.")
if estadoCivil == 'S' or estadoCivil == 'D' and edad < 35:
    print("Se aplica retención del 12%")
elif edad > 50:
    print("Se aplica retencion del 8.5%")
elif estadoCivil == 'V' or estadoCivil == 'C' and edad < 35:
    print("Se le aplica retención del 11.3%")
else: 
    print("Se le aplica retención del 10.5%")

estadoCivil = 'C'
edad = 31
print("Es casado y tiene" , edad , "años.")
if estadoCivil == 'S' or estadoCivil == 'D' and edad < 35:
    print("Se aplica retención del 12%")
elif edad > 50:
    print("Se aplica retencion del 8.5%")
elif estadoCivil == 'V' or estadoCivil == 'C' and edad < 35:
    print("Se le aplica retención del 11.3%")
else: 
    print("Se le aplica retención del 10.5%")

estadoCivil = 'V'
edad = 76
print("Es viudo y tiene" , edad , "años.")
if estadoCivil == 'S' or estadoCivil == 'D' and edad < 35:
    print("Se aplica retención del 12%")
elif edad > 50:
    print("Se aplica retencion del 8.5%")
elif estadoCivil == 'V' or estadoCivil == 'C' and edad < 35:
    print("Se le aplica retención del 11.3%")
else: 
    print("Se le aplica retención del 10.5%")

estadoCivil = 'D'
edad = 45
print("Es divorciado y tiene" , edad , "años.")

if estadoCivil == 'S' or estadoCivil == 'D' and edad < 35:
    print("Se aplica retención del 12%")
elif edad > 50:
    print("Se aplica retencion del 8.5%")
elif estadoCivil == 'V' or estadoCivil == 'C' and edad < 35:
    print("Se le aplica retención del 11.3%")
else: 
    print("Se le aplica retención del 10.5%")
    
'''

8.

hora1 = int(input("Dime las horas: "))
minuto1 = int(input("Dime los minutos: "))
segundo1 = int(input("Dime los segundos: "))

hora2 = int(input("Dime las horas: "))
minuto2 = int(input("Dime los minutos: "))
segundo2 = int(input("Dime los segundos: "))


print("Hora1:",hora1,":",minuto1,":",segundo1)
print("Hora2:",hora2,":",minuto2,":",segundo2)

if 0<=hora1 <24 and 0<=hora2 <24 and 0<= minuto1 <=59 and 0<= minuto2 <=59 and 0<= segundo1 <=59 and 0<= segundo2 <=59:
    if hora1 > hora2:
        print("Hora 1 es mayor")
    elif hora1 < hora2:
        print("Hora 2 es mayor")
    else: 
        if minuto1 > minuto2:
            print("Hora 1 es mayor")
        elif minuto1 < minuto2:
            print("Hora 2 es mayor ")
        else: 
            if segundo1 > segundo2:
                print("Hora 1 es mayor")
            elif segundo1 < segundo2:
                print("Hora 2 es mayor")
else:
    print("Error")
    


'''
    
9. 

tipoProducto = str(input("Dime tipo de producto : "))
precioOriginal = int(input("Dime precio del producto: ")) 


if tipoProducto == 'A':
    print(precioOriginal - (precioOriginal * 0.07))
elif tipoProducto == 'C' or tipoProducto == 'C' and precioOriginal < 500:
    print(precioOriginal - (precioOriginal * 0.12))
elif tipoProducto == 'B' or tipoProducto == 'C' and precioOriginal > 500:
    print(precioOriginal - (precioOriginal * 0.09))
else:
    print("Error")


10. 

caracter = str(input("Añade un carácter: "))
numero1 = int(input("Añade numero 1: "))
numero2 = int(input("Añade numero 2: "))

if caracter == '+':
    print(numero1+numero2)
elif caracter == '-':
    print(numero1-numero2)
elif caracter == '*':
    print(numero1*numero2)
elif caracter == '/':
    print(numero1/numero2)
else:
    print("Error")

'''






