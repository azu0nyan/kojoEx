//Рисование картинок

cleari //скрыть черепашку
val cross = Picture{ // Код для черепашки, рисующй крест
    setFillColor(blue)
    repeat(4){
        forward; right;forward; right; forward; left;
    }
}
cross.draw() //рисуем крест на экране

//пишем текст 50м шрифтом, зеленым цветом
val text = Picture.textu("HELLO", 50, green)
text.setPosition(30, 150)
text.draw()

val circle = Picture.circle(20) //рисуем круг
circle.draw()
circle.setPosition(-100, -100) //телепортируем круг в -100 -100
//каотинку нужно сохранить в ту же папку что и программу(.kojo)
val cat = Picture.image("cat.png") //загружаем картинку с диска
cat.draw()  
cat.scale(0.1)//масштабируем картинку
cat.setPosition(100, 100) //телепортируем картинку
cat.rotate(45)//поворачиваем картинку

text.moveToFront()//выводим текст повер картинки






