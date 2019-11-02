First assigment of PRG2

Requirements:

En este ejercicio se deberá crear un programa en Java que lea una matriz cuadrada de enteros no negativos por la entrada estándar y que comprobará si la raíz cuadrada entera de la matriz calculada punto a punto (es decir se calculará la raíz cuadrada entera de cada elemento de la matriz) es una matriz simétrica. No se podrá usar el método de la biblioteca Math.sqrt() y la solución completa no deberá incluir ningún bucle de tipo for ni while.  Si el programa contiene algún bucle de este tipo se puntuará solamente la mitad. Para ello en el código fuente no se deberá encontrar ninguna cadena "for" ni "while", por lo que el alumno deberá asegurarse de que sea así. La entrega se realizará en un único fichero java.

La entrada consistirá de un número entero no negativo  n  en una única línea que indicará el tamaño de la matriz. A continuación vendrán n lineas  con n valores enteros no negativos separados por blancos. 

La salida será la frase "La matriz de tamaño n es de raíz entera simétrica."  cuando la matriz formada por las raíces cuadradas enteras de la matriz original sea simétrica, y será "La matriz de tamaño n es de raíz entera no simétrica." en caso contrario. La línea de salida finalizará con un fin de línea.

La puntuación final se obtendrá mediante unos test creados por el profesor que será multiplicada por 0.5 si los métodos no son plenamente recursivos o por 1 si lo son.

Si la entrada por cualquier razón no se corresponde a la especificación dada se deberá enviar a la salida estándar el mensaje "Entrada Inválida."

Ejemplo

Entrada
2

2 4

5 5

Salida
"La matriz de tamaño 2 es de raíz entera simétrica."
