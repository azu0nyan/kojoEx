//Символы(Character) - составные элемены строк, любые значки
//которые можно набрать с клавиатуры. 
//Цифры/буквы/иероглифы/знаки пунктуации
//Например(некторые символы могут не отображатсья из-за отсутвия их в текущем шрифте):
//a b c A  B C ф Ф 1 2 3  ! @ " - ♔ ♕ ♘ ♦ ♣ ♥ ♠ 🁌🙂🙂
//猫 田 😀😀☺☏ 🡆 ⤡ ∑ ⩽ ⑨ ☂ ☀ ☁ 𝄞 𝅘𝅥𝅲  🗩

//Символы записываются в одинарных кавычках
var c1 : Character = 'a'
var c2 = 'b'

//Строка(String) - конечная последовательность символов или список символов.
//Строки записываются в довйных кавычках
var s1 : String = "SOME TEXT"
var s2 = "MORE TEXT"
//Строки можно соединять(конкатенировать) друг с другом, и тескстовыми записями чисел, используя +
var s3 = s1 + " " +  s2
println(s3)
var x = 1
println("x = " + x)
//Можно брать символ по его номеру(индексу), используя ()
println("Третий символ в s3 = " + s3(2))
//Так можно узнать длинну строки
println("Длинна строки s3 = " + s3.size)
//Все известные нам операции  со списками(Seq) можно совершать и со строками
//Наприме их можно обходить циклом. 
//На месте readln("Введите строку") может быть любая строка и переменная тиа String
var estO = false
var s = readln("Введите строку")
for(c <- s){
    if(c == 'u') {
        estO = true
    }
}

if(estO)println("u найдено")
else println("u не найдено")
/*
Домашнее задание:
1)Спросите у пользователя строку, 
выведите равна ли первая буква в строке 'a'?
2)Спросите у пользователя стоку, 
выведите равны ли в ней первый и последний символы.
3)Спросите у пользователя две строки, выведите равны ли у них 
первые символы
4)Спросите у пользователя две строки, выведите более длинную из них
5)Сросите у пользователя строку, посчитайте сколько в ней букв 'a'
6)Спросте у пользователя строку, вывеите её задмом наперед. "ABC" -> "CAB"
7*)Спросите две строки у пользователя, 
проверьте можно ли из первой состваить вторую, переставив в ней символы.
*/

