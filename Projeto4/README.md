> Texto traducido con Google Translate del archivo Prova Instrutor lider - Modulo I.pdf

## proyecto 4

1. [Code](src/main/java)
2. [Test](src/test/java)

Cree una clase Java llamada IntegerSet. Cada objeto IntegerSet puede almacenar números enteros en el rango de 0 a 100.
El conjunto está representado por una matriz de valores booleanos. El elemento de matriz a[i] es verdadero si el entero
i se ve en el conjunto. El elemento de matriz a[j] es falso si el entero no está en el conjunto. El constructor sin
argumentos inicializa la matriz de Java en 'conjunto vacío' (todos los valores son falsos). Proporcione los siguientes
métodos:

- El método de unión crea un tercer conjunto que es la unión teórica de dos conjuntos existentes (es decir, la aplicación de la función
  OR lógica sobre los conjuntos y devuelve el valor lógico verdadero o falso).
- El método de intersección crea un tercer conjunto que es la intersección teórica de dos conjuntos existentes (es decir,
  aplicación de la función lógica AND en los conjuntos y devuelve el valor lógico verdadero o falso).
- el método insertElement inserta un nuevo elemento entero k en un conjunto (estableciendo a[k] en verdadero).
- El método deleteElement elimina el entero m (estableciendo a[m] en falso).
- El método toSetString devuelve una cadena que contiene un conjunto como una lista de números separados por espacios. incluir
  sólo los elementos que están presentes en el conjunto. U lize -" para representar un conjunto vacío.
- el método equalTo determina si dos conjuntos son iguales. estructura