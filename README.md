# 🔷 Cálculo de Figuras Geométricas — Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/POO-Programación%20Orientada%20a%20Objetos-4CAF50?style=for-the-badge)

Práctica del módulo de **Programación del ciclo de Desarrollo de Aplicaciones Web (DAW)**.

Proyecto desarrollado en **Java** para trabajar los principales conceptos de la **Programación Orientada a Objetos (POO)** mediante la creación y gestión de diferentes figuras geométricas.

El programa permite crear **esferas, cilindros y ortoedros**, asignarles un color aleatorio y calcular diferentes propiedades como:

- 📐 Superficie
- 📦 Volumen
- ⚖️ Densidad
- 🏋️ Peso
- 🎨 Coste de pintura

---

## 🎯 Objetivo del proyecto

El objetivo principal es practicar los fundamentos de la **Programación Orientada a Objetos en Java**, trabajando con:

- Clases y objetos.
- Atributos privados.
- Encapsulamiento.
- Constructores.
- Sobrecarga de constructores.
- Métodos `get` y `set`.
- Cálculos matemáticos.
- Generación de valores aleatorios.
- Estructuras condicionales.

Además, el proyecto permite aplicar estos conceptos a un problema práctico relacionado con diferentes figuras geométricas y materiales.

---

## 🔷 Figuras geométricas

El programa trabaja con tres tipos de figuras:

- ⚪ **Esfera**
- 🟠 **Cilindro**
- 🟦 **Ortoedro**

Cada figura dispone de diferentes dimensiones, un tamaño y un material.

### Materiales disponibles

| Material | Densidad |
|----------|----------|
| Corcho | 0.2 |
| Madera | 0.7 |
| Hierro | 7.87 |

Los valores de densidad se utilizan posteriormente para calcular el peso de cada figura.

---

## 🎨 Asignación de color

Cada figura recibe automáticamente un color de forma aleatoria.

Los colores disponibles son:

- 🔵 Azul
- 🟢 Verde

El método utilizado es:

```java
asignarColor()
