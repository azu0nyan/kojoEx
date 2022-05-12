var a: Seq[Int] = Seq(1, 3, 53, 34, 1, 3)
var b: Seq[Int] = Seq(31, 32, 53, 34, 321, 3)
//1
var a1: Seq[Int] = Seq()
for (e <- a) {
    a1 = a1 :+ (e + 5)
}
a = a1 
//2
var a2: Seq[Int] = Seq()
for(e <- a){
    if(e <= 3 || e >= 10){
        a2 = a2 :+ e        
    }
}
a = a2
//3
var allPositive = true
for(e <- a){
    if(e <= 0) {
        allPositive = false 
    }
}
//4
for(e <- a){
    if(e %  3 == 0){
        println(e)
    }
}
//5
var skolko5 = 0
for(e <- a){
    if(e == 5){
        skolko5 += 1
    }
}
//6
var b1: Seq[Int] = Seq()
var b2: Seq[Int] = Seq()
for(e <- a){
    var estVB = false
    for(e1 <- b){
        if(e1 == e) estVB = true    
    }
    if(estVB && e > 10){
        b1 = b1 :+ e
    } else {
        b2 = b2 :+ e
    }
}


/*Работа над ошибками
1)Разделите каждый елемент списка на 6
2)Удалите из списка элементы, которые не делятся на 3
3)Есть ли элемент в списке больший 3 но меньший 9
4)напечатайте все отрицательные элементы списка
5)сколько элементов в списке делятся на 3 и на 5
6)Разделите список а на два списка - список элементов, которых нет в b и делящихся на 7,
и все остальные 

*/



