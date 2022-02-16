clearOutput()

val mcool = new  java.net.URL("https://pokeapi.co/api/v2/pokemon/ditto")
val conn = mcool.openConnection
conn.addRequestProperty("User-Agent", "Mozilla/4.0");
val stream = conn.getInputStream
val result = scala.io.Source.fromInputStream(stream).mkString
println(result)

/*

val mcool = new  java.net.URL("https://pokeapi.co/")
val stream = mcool.openStream
val result = scala.io.Source.fromInputStream(stream).mkString
println(result)
*/

/*
import java.util.Scanner
val mcool = new URL("http://google.com");
val webIn = new Scanner(mcool.openStream())
while(webIn.hasNextLine){
    val one = webIn.nextLine()
    System.out.println(one)
}

webIn.close()
*/
