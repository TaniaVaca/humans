#Autora
﻿Tania Vaca
# Examen Mercadolibre
# Mutantes
#Problema
Dada una matriz de (NxN) con la secuencia del ADN. Las letras de los Strings solo pueden ser: (A,T,C,G), las
cuales representa cada base nitrogenada del ADN. Se dice que es un mutante si dentro de la matriz se encuetra más de una secuencia de cuatro letras
iguales, de forma oblicua, horizontal o vertical.
#Ejemplo (Caso mutante):
String[] dna = 
{
  "ATGCGA",
  "CAGTGC",
  "TTATGT",
  "AGAAGG",
  "CCCCTA",
  "TCACTG"
};
En este caso el llamado a la función isMutant(dna) devuelve “true”.

#Desafíos:
Nivel 1:
Programa (en cualquier lenguaje de programación) que cumpla con el método pedido por
Magneto.
Nivel 2:
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
Nivel 3:

![image](https://user-images.githubusercontent.com/16779783/116487709-35e84380-a856-11eb-8109-219aef5691ff.png)


