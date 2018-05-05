package ch02.loops

fun loopWhile()
{
	var ok = true
	while(ok){
		println("This will print out for once time!")
		ok = false
	}
}

fun loopFor()
{
	val list = listOf(1, 2, 3, 4)
	for(k in list){
		println(k)
	}
	println()
	
	val set = setOf(1, 2, 3, 4)
	for(k in set){
		println(k)
	}
	println()
	
	val oneToTen = 1..10
	for(k in oneToTen){
		for(j in 1..5){
			println(k * j)
		}
	}
	println()
	
	val string = "print my characteres"
	for(char in string){
		println(char)
	}
	println()
	
	val array = arrayOf("Juan", "Pedro", "Antonio", "Marcos")
	for(index in array.indices){
		println("Element $index is ${array[index]}")
	}
}

fun main(args:Array<String>)
{
	loopWhile()
	loopFor()
}
