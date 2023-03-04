# arbol-de-busqueda-balanceable
seguimiento 5 APO II universidad icesi
Enunciado
Cree un programa que permita a un usuario introducir un arreglo ordenado por consola. 
El programa construirá un árbol binario de búsqueda usando los elementos del arreglo.

INPUT
El usuario ingresará un arreglo de strings ordenado alfabéticamente en una sóla línea.

PROCESO
El algoritmo para lograr hacer una construcción balanceada del BST a partir de un arreglo de datos es:
1. Establece el elemento central del arreglo como la raíz. 
2. Haz lo mismo recursivamente para la mitad izquierda y la mitad derecha. 
a. Obtén el elemento central de la mitad izquierda y conviértelo en el hijo izquierdo de la raíz creada en el paso 1. 
b. Obtén el elemento central de la mitad derecha y conviértelo en el hijo derecho de la raíz creada en el paso 1.

OUTPUT
Imprime el recorrido inorder reverso. De esta forma puede asegurarse que la construcción del árbol BST quedó bien.

BONUS
Además del output solicitado, imprima la máxima profundidad del árbol. En el ejemplo, la profundidad es de 3. 
Si lo consigue obtendrá 1 punto adicional.

PUNTOS
1. El usuario puede ingresar un arreglo de strings ordenado alfabéticamente en una sóla línea a través de la consola. Esto se transforma en alguna estructura de arreglo (Array o ArrayList). 1 punto.

2. El algoritmo de construcción de árbol BST hace que pueda construir un árbol balanceado a partir de un arreglo de String ordenado. 2.5 puntos

3. El output emitido al final del algoritmo es producto de un recorrido inorder reverso. Para este punto se evalúa que el árbol BST haya quedado construído correctamente. 1.5 puntos.
