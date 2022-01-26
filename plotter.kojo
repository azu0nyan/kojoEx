//Построитель графиков - задание 
cleari
setSpeed(superFast)
//Пример рисования групы линий 
for( x <- 100 to 200 by 10){
    setPosition(x, 100)
    lineTo(x , 200 )
}
//Рисование графиков функций
//Определяем функцию, график которой строим
def f(x: Double): Double = (x / 10.0) * (x / 10.0) - 100
//будем строить график "по точкам" перебирая соседние точки и соединяя значения в них линией
//Перебираем х из области определения    
for(x <- -300 to 300){
    val y = f(x)//рассчитываем значение функции в точке x  
    val x1 = x + 1 
    val y1 = f(x1)//раасчитываем значение в соседней точке
    //рисование линии из x, y в x1, y1
    setPosition(x, y)
    lineTo(x1, y1)     
}
val s = Slider(0, 255, 128, 50)
val p = Picture.widget(s)
animate{
    setPosition(0, -150)
    setPenThickness(100)
    setPenColor(Color(s.value, 0, 0))
    circle(10)
}
p.draw
/*
Дз.
1)Нарисовать Оси 
2)Нарисовать сетку с частотой 50
3)Подписать пересечания сетки с осями
4)2 функции на одном графике разными цветами
5*)Добавить слайдеры для измененя масштаба
*/
/*
Можете дома попробовать такие функции
def f(x: Double): Double = math.sin(x / 10) * 10 + math.sin(x / 100) * 100    

def f(x: Double): Double = 
    if(x != 0) math.sin(1.0 / (x / 100.0)) * 200.0
    else 0.0
   */
