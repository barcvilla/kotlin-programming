package ch02.basictypes.strings

/*Embedded strings */

fun embededString()
{
	val name = "Sam"
	val str = "name $name"
	println(str)
	
	val str1 = "hello $name. Your name has ${name.length} characters"
	println(str1)
}

/*Trabajando con el operador ..*/
fun workingWithRanges()
{
	val aToZ = "a".."z"
	val oneToNine = 1..9
	
	/*Una vez creado en Range con el operador in podemos verificar si un valor esta incluido
      en el range*/
	val isTrue = "c" in aToZ
	val isFalse = 11 in oneToNine
	
	/*Function downTo() crea un rango contando en descendente*/
	val countingDown = 100.downTo(0)
	
	/*Fucntion rangeTo() crea un rango contando en ascendente*/
	val rangeTo = 10.rangeTo(20)
	
	/*Una vez creado el range, podemos modificarlo retornando un nuevo rango*/
	val oneToFifty = 1..50
	val oddNumbers = oneToFifty.step(2)
	
}
 
fun main(args:Array<String>)
{
	embededString()
}
