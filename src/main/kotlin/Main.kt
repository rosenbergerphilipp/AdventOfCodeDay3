import java.io.File
import java.nio.charset.MalformedInputException

fun main(args: Array<String>) {
    part1()
    part2()
}

fun part2() {
    var input = getInput()
    var array = IntArray(12)
    var bitCodeOxy = getBitCodeOxy(input)
    var bitCodeCO2 = getBitCodeCO2(input)
    for(i:Int in array.indices){
    }

}
fun parseLine(line:String):IntArray{
    var array = IntArray(12)
    throw NotImplementedError()
}
fun getBitCodeOxy(input: List<String>):IntArray{
    var array = IntArray(12)
    for(line:String in input){
        array = lineArray(line,array)
    }
    for(i:Int in array.indices){
        array[i]= if(array[i] >= (input.size)/2) 1 else 0
    }
    return array
}

fun getBitCodeCO2(input: List<String>):IntArray{
    var array = IntArray(12)
    for(line:String in input){
        array = lineArray(line,array)
    }
    for(i:Int in array.indices){
        array[i]= if(array[i] > (input.size)/2) 0 else 1
    }
    return array
}
fun part1(){
    var input = getInput()
    var array = IntArray(12)
    var array2 = IntArray(12)
    for(line:String in input){
        array = lineArray(line,array)
    }
    for(i:Int in array.indices){
        array[i]= if(array[i] > (input.size)/2) 1 else 0
        array2[i] =  if(array[i] == 1) 0 else 1
    }
    println(sumUp(array)*sumUp(array2))
}
fun sumUp(intArray: IntArray): Int{
    var result = 0
    for(i:Int in intArray){
        result+=i
        result =  result shl 1
    }

    return result shr 1

}
fun lineArray(line: String, array : IntArray): IntArray{
    for(i in line.indices){
        array[i] += Integer.parseInt(line[i]+"")
    }
    return array
}
fun getInput():List<String>{
   return readLines( System.getProperty("user.dir")+"/src/main/resources/input.txt")
}
fun readLines(filePath: String):List<String>{
    return File(filePath).readLines();
}