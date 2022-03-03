//Функии высшего порядка - функции использующие другие функции
var s = Seq(1, 2, 3, 2, 1, 1, 2, 3, 9)
s.foreach(x => println(s"foreach печатает $x"))

s = s.map(x => x * x)
println(s"map $s")

s = s.filter(x => x > 1)
println(s"filter $s")

print("reduce ")
println(s.reduce((a, b) => a + b))

s = s.flatMap (x => Seq(x, x + 1, x * x))
println(s"flatMap $s")

print(s"sort ")
println(s.sortBy(x => -x)) 

println("Другие операции")
println(s.find(x => x == 81))
println(s.takeWhile (x => x != 81))
println(s.dropWhile (x => x != 81))
println(s.exists(x => x == 9))
println(s.exists(x => x < 3))
println(s.forall(x => x != 3))
println(s.forall(x => x == 3))
println(s.groupBy( x => x % 3))

/*Задание(Обязательно использовать функции высшего порядка,
запрещается использовать циклы)
1)Для списка чисел
-вычтите из каждого числа 22
-поделите все числа на 3 
-напечатайте результат по одному числу на строку
s.map(..).map(..).foreach(..)
2)Найти суму квадратов чисел x от 1 до 1_000 
таких что последняя цифра x равна 5
(1 to 1000).map(...).filter(...).reduce(...)
3)
-Создайте список из 100 пар случайных чисел
-осавьте только те пары, где первый элемент больше второго
-найдите сумму вторых элементов пар
(1 to 100).map(x => (random(10), random(10))).filter(..).map(..).reduce(..)
4)
-Создайте класс Dog с полями name(имя), age(возраст), breed(порода)
-Создате список из нескольких его экземпляров
-Отсортируйте список по возрасту использу sortBy
5) Для числа x - найти сумму его делителей
(1 to x).filter(..).reduce(..)
6*)Напечатать все пары a, b такие что  
-  1000 > a > b 
-  a делится на b, 
-  последние цифры a и b совпадают.
(1 to 1000).flatMap(a => (1 to 1000).map(b => (a, b))
.filter(..).filter(..).forEach(..) 






*/


