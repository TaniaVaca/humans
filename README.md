
# Autora
﻿# Tania Vaca
 
# Examen Mercadolibre - Magneto-Mutantes

# Problema

Dada una matriz de (NxN) con la secuencia del ADN. Las letras de los Strings solo pueden ser: (A,T,C,G), las cuales representa 

cada base nitrogenada del ADN. Se dice que es un mutante si dentro de la matriz se encuetra más de una secuencia de cuatro letras

iguales, de forma oblicua, horizontal o vertical.

# Ejemplo (Caso mutante):

String[] dna = 

    {
      "dna": [
      "ATGCGA", 
      "CAGTGC",
      "TTATGT",
      "AGAAGG",
      "CCCCTA",
      "TCACTG"
      ]
    }
    
En este caso el llamado a la función isMutant(dna) devuelve “true”.

# Herramientas Usadas
-  Eclipse 
-  Java 1.8
-  Spring Boot
-  Maven
-  Junit
-  JCoverga
-  Hibernate
-  Amazon RDS Mysql 
-  Amazon EC2
-  Amazon Elastic Beanstalk

# Desafíos:

## Nivel 1:
   Programa (en cualquier lenguaje de programación) que cumpla con el método pedido por Magneto.
### Solución
   - Valido que la secuencia no venga vacía
   - Valido que sean únicamente los caracteres que se deben aceptar (A,T,C,G)
   - Cree un método para recorre la matriz de forma horizontal
   - Cree un método para recorre la matriz de forma vertical
   - Cree un método para recorre la matriz de forma diagonal
   - Cree un método para recorre la matriz de forma diagonal invertida
   - Toma secuencias y si hay un subsecuencia tambien la cuenta como valida
     - Ejemplo del caso:
       - La primera secuencia sería esta
       
       ![image](https://user-images.githubusercontent.com/16779783/116490440-02f57e00-a85d-11eb-8fc3-e33d8754fc30.png)
       - La segunda secuencia sería esta

       ![image](https://user-images.githubusercontent.com/16779783/116490553-49e37380-a85d-11eb-8b5c-fd71cacf65ca.png)

     


## Nivel 2:
Crear una API REST, hostear esa API en un cloud computing libre (Google App Engine,
Amazon AWS, etc), crear el servicio “/mutant/” en donde se pueda detectar si un humano es
mutante enviando la secuencia de ADN mediante un HTTP POST con un Json el cual tenga el
siguiente formato:
POST → /mutant/
{
“dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}
En caso de verificar un mutante, debería devolver un HTTP 200-OK, en caso contrario un
403-Forbidden

## Nivel 3:
 
Usando 

![image](https://user-images.githubusercontent.com/16779783/116487709-35e84380-a856-11eb-8109-219aef5691ff.png)


