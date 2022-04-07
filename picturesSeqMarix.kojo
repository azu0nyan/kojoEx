cleari
//Списки картинок
var p1 = Picture.rect(20, 30)
var p2 = Picture.circle(20)
var s: Seq[Picture] = Seq(p1, p2, Picture.circle(40))

for(p <- s) p.draw() //рисуем все картинки, одновременно

p1.offset(-100, 100)
p2.offset(-100, -100)

var p3 = Picture.circle(20) //картинка круга, стоящая на месте
p3.draw()
//создание картинки случайной буквы
Picture.textu(('A' + random(26)).toChar, 20, green).draw()

animate{
    for(p <- s) p.offset(2, 0)  //Перемещаем все картинки вправо 
    //удалим картинки, улетевшие дальше чем 100
    var tmp: Seq[Picture] = Seq()//временный список
    for(p <- s){ 
        if(p.position.x > 100) p.erase() //если картинка слишком далеко стираем картинку из памяти
        else tmp = tmp :+ p //если картинка нам подходит, переписываем её во временный список
    }
    s = tmp//оновляем список, оставляя только нарисованные картик

        
    //найдем ближайшую картинку к p3
    var cl = s.head
    for(p <- s) {
        if(p.distanceTo(p3) < cl.distanceTo(p3)){
            cl = p
        }
    }
    //cl ближайшая
    println(cl)
}

//Получение случайной ангийской буквы
//('A' + random(26)).toChar

//1)Создайте список из 5 изображений - букв, нарисуйте их
//2)Создайте цикл - animate опускающий картинки вниз
//3)Картинки, долетающие до нижнего края экрана - исчезают
//4)Раз в несколько кадров появляется новая случайная буква


//5*)При падении буквы прлавно гаснут
//pic.setOpacity(pic.opacity * 0.95)  
//6*)Буквы оставляют за собой след из таких же букв

//Допю ДЗ не будет








