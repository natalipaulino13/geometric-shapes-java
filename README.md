# Cálculo de Figuras Geométricas — Java (POO)

Práctica del módulo Programación (DAW). Programa realizado en **Java** para trabajar con diferentes figuras geométricas utilizando **Programación Orientada a Objetos (POO)**.

El programa permite crear esferas, cilindros y ortoedros, asignarles un color aleatorio, calcular su superficie, volumen, densidad, peso y coste de pintura.

## Enunciado

El programa trabaja con tres tipos de figuras geométricas:

* Esferas.
* Cilindros.
* Ortoedros.

Cada figura tiene unas dimensiones, un tamaño y un material.

Los materiales disponibles son:

* Corcho.
* Madera.
* Hierro.

Además, cada figura recibe un color aleatorio entre:

```text
Azul
Verde
```

Dependiendo del material y del color asignado, se calcula el coste necesario para pintar la superficie de la figura.

## Clases

### Esfera

Representa una esfera.

Sus atributos principales son:

* Color.
* Tamaño.
* Radio.
* Material.

Dispone de varios constructores para crear una esfera con diferentes cantidades de información.

Los métodos principales permiten:

* Asignar un color aleatorio.
* Obtener el color.
* Calcular la superficie.
* Calcular el volumen.
* Calcular la densidad.
* Calcular el peso.
* Calcular el coste de pintura.

### Cilindro

Representa un cilindro.

Sus atributos son:

* Color.
* Tamaño.
* Radio.
* Altura.
* Material.

También dispone de diferentes constructores.

Permite realizar los mismos cálculos que la esfera, adaptados a la geometría del cilindro:

* Superficie.
* Volumen.
* Densidad.
* Peso.
* Coste de pintura.

### Ortoedro

Representa un ortoedro.

Sus atributos son:

* Color.
* Tamaño.
* Ancho.
* Alto.
* Largo.
* Material.

Permite calcular:

* Superficie.
* Volumen.
* Densidad.
* Peso.
* Coste de pintura.

## Clase Main

Es la clase principal del programa.

Se encarga de crear diferentes objetos de cada figura y mostrar los resultados por consola.

Se crean:

* 3 esferas.
* 3 cilindros.
* 3 ortoedros.

Cada objeto tiene diferentes tamaños, dimensiones y materiales.

## Creación de objetos

### Esferas

Se crean tres esferas:

```java
Esfera e1 = new Esfera("pequeña", 5, "hierro");
Esfera e2 = new Esfera("mediana", 10, "madera");
Esfera e3 = new Esfera("grande", 15, "corcho");
```

A cada esfera se le asigna posteriormente un color aleatorio.

### Cilindros

Se crean tres cilindros:

```java
Cilindro c1 = new Cilindro("pequeño", 5, 10, "hierro");
Cilindro c2 = new Cilindro("mediano", 10, 15, "madera");
Cilindro c3 = new Cilindro("grande", 15, 20, "corcho");
```

### Ortoedros

Se crean tres ortoedros:

```java
Ortoedro d1 = new Ortoedro("pequeño", 5, 6, 7, "hierro");
Ortoedro d2 = new Ortoedro("mediano", 7, 8, 9, "madera");
Ortoedro d3 = new Ortoedro("grande", 10, 11, 12, "corcho");
```

## Asignación de color

Cada figura dispone del método:

```java
asignarColor()
```

El color se obtiene de forma aleatoria utilizando la clase `Random`:

```java
Random r = new Random();
this.color = r.nextBoolean();
```

El atributo `color` es un booleano:

```text
false = azul
true = verde
```

El método `transformar()` convierte el valor booleano en el nombre del color:

```text
false → azul
true → verde
```

Por lo tanto, cada ejecución puede asignar colores diferentes a las figuras.

## Cálculo de superficie

### Esfera

La superficie se calcula mediante:

```text
4 × π × radio²
```

En Java:

```java
4 * Math.PI * Math.pow(radio, 2)
```

### Cilindro

La superficie se calcula mediante:

```text
2 × π × radio × (radio + altura)
```

En Java:

```java
2 * Math.PI * radio * (radio + altura)
```

### Ortoedro

La superficie se calcula mediante:

```text
2 × (largo × ancho + largo × alto + alto × ancho)
```

En Java:

```java
2 * (largo * ancho + largo * alto + alto * ancho)
```

Los resultados se redondean a dos decimales utilizando:

```java
Math.round(valor * 100.0) / 100.0
```

## Cálculo de volumen

### Esfera

Se utiliza la fórmula:

```text
(4/3) × π × radio³
```

### Cilindro

Se utiliza:

```text
π × radio² × altura
```

### Ortoedro

Se utiliza:

```text
largo × ancho × alto
```

Todos los resultados se redondean a dos decimales.

## Densidad de los materiales

El método `calcularDensidad()` devuelve una densidad diferente dependiendo del material.

| Material | Densidad |
| -------- | -------- |
| Corcho   | 0.2      |
| Madera   | 0.7      |
| Hierro   | 7.87     |

La selección del material se realiza mediante un `switch`.

Ejemplo:

```java
switch (this.material) {
case "corcho":
    return 0.2;

case "madera":
    return 0.7;

case "hierro":
    return 7.87;

default:
    return 0;
}
```

## Cálculo del peso

El peso se obtiene multiplicando:

```text
Peso = Volumen × Densidad
```

El método utilizado es:

```java
calculoPeso()
```

El resultado también se redondea a dos decimales.

## Cálculo del coste de pintura

El método:

```java
obtenerCoste()
```

calcula cuánto cuesta pintar cada figura.

El precio depende de dos factores:

* Material.
* Color.

### Color azul

Si el color es azul:

| Material | Precio |
| -------- | ------ |
| Corcho   | 0.06   |
| Madera   | 0.08   |
| Hierro   | 0.10   |

### Color verde

Si el color es verde:

| Material | Precio |
| -------- | ------ |
| Corcho   | 0.05   |
| Madera   | 0.07   |
| Hierro   | 0.09   |

El coste final se calcula mediante:

```text
Coste = Superficie × Precio
```

El resultado se redondea a dos decimales.

## Ejemplo de ejecución

El programa muestra información similar a:

```text
La esfera pequeña pesa 4112.72 gr y cuesta pintarla de azul 31.42 euros

La esfera mediana pesa 2932.15 gr y cuesta pintarla de verde 87.96 euros

La esfera grande pesa 282.74 gr y cuesta pintarla de azul 169.65 euros
```

Los colores pueden cambiar en cada ejecución porque se asignan aleatoriamente.

Para los cilindros:

```text
El cilindro pequeño pesa ... gr y cuesta pintarlo de ... ... euros

El cilindro mediano pesa ... gr y cuesta pintarlo de ... ... euros

El cilindro grande pesa ... gr y cuesta pintarlo de ... ... euros
```

Y para los ortoedros:

```text
El ortoedro pequeño pesa ... gr y cuesta pintarlo de ... ... euros

El ortoedro mediano pesa ... gr y cuesta pintarlo de ... ... euros

El ortoedro grande pesa ... gr y cuesta pintarlo de ... ... euros
```

## Constructores

Las clases disponen de diferentes constructores.

Por ejemplo, `Esfera` dispone de:

```java
public Esfera()
```

Constructor vacío.

```java
public Esfera(String tamanyo, double radio)
```

Constructor con tamaño y radio.

```java
public Esfera(String tamanyo, double radio, String material)
```

Constructor con tamaño, radio y material.

El mismo concepto se aplica a `Cilindro` y `Ortoedro`.

## Encapsulamiento

Los atributos de las clases son privados:

```java
private boolean color;
private String tamanyo;
private double radio;
private String material;
```

Para acceder a ellos se utilizan métodos `get` y `set`.

Ejemplo:

```java
public double getRadio() {
    return radio;
}

public void setRadio(double radio) {
    this.radio = radio;
}
```

Esto permite aplicar el principio de **encapsulamiento** de la Programación Orientada a Objetos.

## Conceptos utilizados

* Java
* Programación Orientada a Objetos (POO)
* Clases y objetos
* Encapsulamiento
* Atributos privados
* Constructores
* Sobrecarga de constructores
* Métodos `get` y `set`
* `Random`
* `Math.PI`
* `Math.pow`
* `Math.round`
* `switch`
* Condicionales `if/else`
* Tipos primitivos
* Cálculos matemáticos
* Redondeo de valores
* Creación de objetos

## Estructura

```text
📦 paq10
 ┣ 📜 Main.java
 ┣ 📜 Esfera.java
 ┣ 📜 Cilindro.java
 ┗ 📜 Ortoedro.java
```

## Autor

[Nataly Github](https://github.com/natalipaulino13) — DAW 2025/2026
