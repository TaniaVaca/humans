
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
-  IDE Eclipse: https://www.eclipse.org/
-  JDK 1.8: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
-  Spring Boot https://spring.io/projects/spring-boot
-  Maven https://maven.apache.org/
-  Junit https://junit.org/junit5/
-  JCoverga https://www.eclemma.org/
-  Hibernate https://hibernate.org/
-  Postman https://www.postman.com/
-  Amazon RDS Mysql https://aws.amazon.com/es/rds/
-  Amazon EC2 https://aws.amazon.com/es/ec2/?ec2-whats-new.sort-by=item.additionalFields.postDateTime&ec2-whats-new.sort-order=desc
-  Amazon Elastic Beanstalk https://aws.amazon.com/es/elasticbeanstalk/

# Desafíos:

## Nivel 1:
   Programa (en cualquier lenguaje de programación) que cumpla con el método pedido por Magneto.
### Solución
   - Valido que la secuencia no venga vacía
   - Valido que sean únicamente los caracteres que se deben aceptar (A,T,C,G)
   - Recorridos
     -  Forma horizontal
     
     ![image](https://user-images.githubusercontent.com/16779783/116491654-fde5fe00-a85f-11eb-9924-0f2faae92102.png)

     -  Forma vertical

     ![image](https://user-images.githubusercontent.com/16779783/116491595-dd1da880-a85f-11eb-9b2e-eebf39a82e8a.png)
     
     -  Forma diagonal --> Método diagonal(int numOfMutantSequences)

     ![image](https://user-images.githubusercontent.com/16779783/116491722-25d56180-a860-11eb-86d7-0632e8e08002.png)
     
     -  Forma diagonal invertida  --> Método diagonal2(int numOfMutantSequences)

     ![image](https://user-images.githubusercontent.com/16779783/116491757-3be32200-a860-11eb-9dcc-b0c6436c293f.png)

   - Toma secuencias y si hay un subsecuencia tambien la cuenta como valida
     - Ejemplo del caso:
       - La primera secuencia sería esta
       
       ![image](https://user-images.githubusercontent.com/16779783/116491654-fde5fe00-a85f-11eb-9924-0f2faae92102.png)
       - La segunda secuencia sería esta

       ![image](https://user-images.githubusercontent.com/16779783/116491625-ec045b00-a85f-11eb-94fd-9419704a3e6d.png)
       
       Esto aplica para cualquier posición(Horizontal, Vertical o Diagonal)
   -  En el mejor de los casos encontro las dos secuencias de forma horizontal
   -  El peor de los casos no hay mutantes y tenemos que recorrer toda la matriz con las 4 opciones hasta el final

## Nivel 2:
Use Amazon AWS, EC2
   -  Para probar el servicio **“/mutant/”** use  Postman
      -   HTTP Status 200 si detecta dos genes mutantes
          ![image](https://user-images.githubusercontent.com/16779783/116492407-cc6e3200-a861-11eb-97d2-3b585d6bc42b.png)
      -   HTTP Status 403 si detecta menos de dos genes mutantes
          ![image](https://user-images.githubusercontent.com/16779783/116492718-98dfd780-a862-11eb-98ee-96f4cdbae33a.png)
          
## Nivel 3:
- Use Amazon AWS, EC2
   -  Para probar el servicio **“/stats/”** use  Postman

      ![image](https://user-images.githubusercontent.com/16779783/116492955-3dfab000-a863-11eb-972e-6bd0126a81e9.png)

- Para recibir fluctuaciones agresivas de tráfico, se recomienda usar un balanceador de carga y aumentar la instacia, ya que solo probe con la versión gratis y no me permite aumentar de forma gratis
- Usando Java Code Coverage for Eclipse realice los Test-Automáticos, donde se obtuvo un Code coverage = 85%.

  ![image](https://user-images.githubusercontent.com/16779783/116487709-35e84380-a856-11eb-8109-219aef5691ff.png)
  
# Instrucciones de cómo ejecutar el programa o la API
 - Ejecutar y compilar la API
          mvn instal
          java -jar mutante-app-0.1.0.jar
- Ejecutar la API, podemos usar Postman para ejecutar los dos métodos 
-   Post
    -   http://3.16.151.166:8080/mutant
-   Get
    -   http://3.16.151.166:8080/stats
