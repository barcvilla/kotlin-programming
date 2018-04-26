package ch02.basictypes.datatypes

fun dataTypes()
{
	val int = 123
	val long = 123456L
	val double = 12.34
	var float = 12.34F
	val hexadecimal = 0xAB
	var binary = 0b01010101
	
	println(int)	
}

fun booleanDataType()
{
	val x = 1
	val y = 2
	val z = 2
	
	val istrue = x < y && x < z
	val alsoTrue = x == y || y == z
}

fun stringDataType()
{
	val string = "string with \n new line"
	/* tripe comillas crean un raw string */
	val rawString = ""
}

fun arrayDataType()
{
	/* Podemos crear un array usando la funcion arrayOf */
	val array = arrayOf(1,2,3)
	
	/* la funcion get y set estan disponibles a traves de la sintaxis corcheas */
	val element1 = array[0]
	val element2 = array[1]
	array[2] = 5
	
	/* otra forma para crear un array */
	val perfectSquares = Array(10, {k -> k * k})
}

fun convertValues()
{
	val int = 50000
	val float = 12.56F
	
	val	long = int.toLong()
	val double = float.toDouble()
	
	println("Converto from int to long: " + long)
	println("Convert from float to double: " + double)
}

fun main(args : Array<String>)
{
	dataTypes()
	convertValues()
}
