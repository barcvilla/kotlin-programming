package ch02.exceptions

import java.nio.file.Path
import java.nio.file.Files
import java.io.IOException
import java.nio.file.Paths
import java.io.File

fun readFile(path: String)
{
//	val input = Files.newInputStream(path)
//	try
//	{
//		var byte = input.read()
//		while(byte != -1){
//			println(byte)
//			byte = input.read()
//		}
//	}
	val file = File(path)
	try
	{
		var content : String = file.readText()
		println(content)
	}
	catch(e : IOException){
		println("Error reading from file. Error was ${e.message}")
	}
}

fun workingWithFile()
{
	val file = "numbers.txt"
	val filePath = Paths.get(System.getProperty("user.dir")).resolve(file).toString()
	readFile(filePath)
}

fun main(args: Array<String>)
{
	workingWithFile()
}
