//Пример цикла for с аккумулятором и задания
var sum = 0    
for(i <- 20 to 122 by 5){
    println(i)
    sum = sum + i
}
println(s"Сумма $sum")
//1)Спросить n, m, k - вывести числа от n до m с шагом k
//2)Спросить n, вывести числа от 1 до n, пометить четные. при n == 6
//1  2<  3  4< 5 6<
//3)Спросить n, вывести таблицу "число - квадрат". при n == 4
//1  1
//2  4
//3  9
//4 16
//4)Прочитать число n и строку s,
// вывести s n раз подряд 
//5)Прочитать n, вывести каждое 0.5-е. При n = 3
// 1 1.5 2 2.5 3
//6)Прочитать n, после n чисел, вывести их сумму
//для ввода 5    1 2 3 2 1 вывести 9
//7)Прочитать n, вывести числа от 1 до n, но
//если число делится на 3 то вывести Fizz,
//если число делится на 5 то вывести Buzz
//Если число делится на 3 и на 5 вывести FizzBuzz
//1 2 Fizz 4  Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
//16 17 Fizz
