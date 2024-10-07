# Conversor de Monedas en Java

Este proyecto es un conversor de monedas en Java que utiliza la API de tipos de cambio para realizar conversiones entre diferentes monedas, incluyendo USD, ARS, COP y BRL. El programa permite a los usuarios ingresar un monto en una moneda y obtener su equivalente en otra.

## Tabla de Contenido

- [Características](#características)
- [Tecnologías](#tecnologías)
- [Instalación](#instalación)
- [Uso](#uso)
- [Clases y Métodos](#clases-y-métodos)

## Características

- Conversión entre las siguientes monedas:
  - Dólar (USD)
  - Peso Argentino (ARS)
  - Real Brasileño (BRL)
  - Peso Colombiano (COP)
- Interfaz de línea de comandos fácil de usar.
- Manejo de errores en las solicitudes a la API.

## Tecnologías

- Java 17
- Gson (para la manipulación de JSON)
- HTTP Client (para hacer solicitudes a la API)

## Instalación

1. Asegúrate de tener [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado en tu máquina.
2. Clona este repositorio o descarga los archivos.
3. Navega a la carpeta del proyecto en la terminal.
4. Compila el código utilizando el siguiente comando:

   ```bash
   javac Principal.java

##  Uso
1. Inicia el programa.
2. Selecciona la opción de conversión deseada introduciendo el número correspondiente.
3. Ingresa el monto que deseas convertir.
4. El resultado de la conversión se mostrará en la consola.
5. Clases y Métodos
6. Monedas

## clases-y-métodos
Clase: Monedas

Esta clase representa las monedas y sus valores.

Atributos:

double USD
double ARS
double COP
double BRL
double conversion_result
String fromCurrency
String toCurrency

Métodos:
    String formatoPersonalizado(): Devuelve una cadena con el resultado de la conversión.
    
Clase: Conversiones

Esta clase contiene la lógica para realizar las conversiones de moneda.

Métodos:
  Monedas ConversorMonedas(String moneda, String monedacambio, double monto): Realiza la conversión entre las monedas especificadas y devuelve un objeto Monedas.

Clase: Principal

Esta clase contiene el método main y la lógica de la interfaz de usuario.

Método:
public static void main(String[] args): Ejecuta el programa y permite a los usuarios seleccionar las opciones de conversión.
