//Пример чтения файла
val file = new java.io.File("slovar.txt")
println(file.toPath.toAbsolutePath) //вывод места файла
import scala.collection.JavaConverters._
val list = java.nio.file.Files.readAllLines(file.toPath).asScala.toSet
println(list)