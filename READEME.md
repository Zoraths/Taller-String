# Taller de Cadenas (Strings) y Pipeline NLP en Java

**Estudiante:** Jordan Alexander Hoyos Caldon

**Programa:** Tecnología en Desarrollo de Software

**Asignatura:** Estructura de Datos

## Descripción

Este proyecto contiene la solución a dos ejercicios prácticos en Java enfocados en la manipulación de cadenas de texto (`String`) y una introducción básica al Procesamiento del Lenguaje Natural (PLN).

## 📁 Estructura del Proyecto

```text
Taller-String/
├── src/
│   ├── EjercicioCadenas.java   (Taller Cadena de String)
│   └── EjercicioPipeline.java  (Ejercicio propuesto de PLN)
└── README.md                   (Documentación del proyecto)
```

---

## 🛠️ 1. Taller Cadena de String (`EjercicioCadenas.java`)

Este archivo implementa diversas operaciones y métodos nativos de la clase `String` en Java. Las tareas realizadas incluyen:

* **Creación e impresión:** Definición de dos cadenas de texto e impresión en consola mediante un método personalizado (`mostrarCadena`).
* **Extracción de caracteres:** Obtención del carácter en la posición 6 usando `charAt()`.
* **Longitud:** Cálculo del tamaño de ambas cadenas usando `length()`.
* **Búsqueda de caracteres:** 
  * Primera ocurrencia del carácter "e" en la cadena 1 (`indexOf()`).
  * Última ocurrencia del carácter "e" en la cadena 2 (`lastIndexOf()`).
* **Transformación de texto:** 
  * Conversión a mayúsculas (`toUpperCase()`).
  * Conversión a minúsculas (`toLowerCase()`).
* **Comparación:**
  * Comparación estricta de contenido (`equals()`).
  * Comparación ignorando mayúsculas/minúsculas (`equalsIgnoreCase()`).
* **Concatenación:** Unión de ambas cadenas (`concat()`).
* **Búsqueda de sub-cadenas:** Verificación de si la cadena contiene la palabra "esta" (`contains()`).
* **Extracción de sub-cadenas:** Obtención de un fragmento de la cadena desde el índice 0 al 6 (`substring()`).
* **Reemplazo:** Sustitución del carácter 'a' por 'i' en toda la cadena (`replace()`).

---

## 🧠 2. Ejercicio Propuesto: Pipeline PLN (`EjercicioPipeline.java`)

Este programa solicita al usuario ingresar una frase o reseña por consola y la procesa a través de un "Pipeline" (tubería) básico de Procesamiento del Lenguaje Natural. 

El pipeline está dividido en los siguientes métodos independientes:

1. **Normalización (`normalizarTexto`):** Convierte el texto a minúsculas y elimina caracteres especiales, signos de puntuación y números, dejando únicamente letras y espacios.
2. **Tokenización (`tokenizar`):** Segmenta la cadena limpia en un arreglo/lista de palabras individuales (tokens).
3. **Filtrado de Stop Words (`filtrarStopWords`):** Compara los tokens contra una lista de palabras vacías de baja carga semántica (artículos, preposiciones como "el", "la", "de", "en", etc.) y las descarta.
4. **Bolsa de Palabras / Bag of Words (`construirBolsaDePalabras`):** Cuenta la frecuencia de aparición de cada término relevante utilizando un `HashMap` para agrupar cada palabra con su respectivo contador.

Al finalizar, el programa imprime en consola:
* El texto original.
* El texto normalizado.
* La lista de tokens depurados.
* El mapa final con la frecuencia de los términos (Bolsa de palabras).

---

## 🚀 Cómo ejecutar el código

Para compilar y ejecutar cualquiera de los archivos, asegúrate de tener el [JDK de Java](https://www.oracle.com/java/technologies/downloads/) instalado.

Abre tu terminal en la ruta de la carpeta principal (`Taller-String`), ingresa a la carpeta `src` y ejecuta:

**Para el Ejercicio de Cadenas:**
```bash
cd src
javac EjercicioCadenas.java
java EjercicioCadenas
```

**Para el Pipeline de PLN:**
```bash
cd src
javac EjercicioPipeline.java
java EjercicioPipeline
```