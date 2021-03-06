clear
setSpeed(superFast)
//[программа 1]
//С цикла можно перечислять "положения" картинок или черепашек
//нарисуме круги радиуса 10 каждые 20 пикселей, на высоте 190, на промежутку -200 200
for(x <- -200 to 200 by 20){
    setPosition(x, 190)
    circle(10)
}

//[программа 2]
//Перечислим все комбинации x, y через вложенные циклы
setPenColor(blue)
for(x <- -200 to 200 by 20;
    y <- 100 to 140 by 20){
        setPosition(x, y)
        circle(5)
}

//[программа 3]
//используя if выделим один из кругов красным
setPenColor(green)
for(x <- -200 to 200 by 20;
    y <- 0 to 60 by 20){
        if(x == -140 && y == 40) setPenColor(red)
        else setPenColor(green)
        
        setPosition(x, y)
        circle(5)
}
//[программа 4]
//часто бывает удобно перечислять не координаты а номера кругов
setPenColor(yellow)
for(x <- 0 to 20;
    y <- 0 to 3 ){    
        //Если нижний левый угол в -200, 100, и круги расположены  шагов 20
        //то круг с номермо x, y, находится в:  
        setPosition(-200 + x * 20, -100 + y * 20)
        circle(5)
}

//[программа 5]
//В таком случае удобнее писать условия, например уберем 3й столбец и 2й ряд
setPenColor(yellow)
for(x <- 0 to 8;
    y <- 0 to 3 ){         
        if(x != 2 && y != 1) {   //2, 1 т.к. нумерация начинается с нуля  
            setPosition(-200 + x * 20, -200 + y * 20)
            circle(5)
        }
}

//[программа 6]
//Используем все перечисленное чтобы нарисовать шахматнцю доску
setPenColor(yellow)
for(x <- 0 to 8;
    y <- 0 to 8 ){ 
        if(( x + y) % 2 == 0)setFillColor(black)
        else setFillColor(white)
        
        setPosition(20 + x * 10, -220 + y * 10)
        repeat(4){
            forward(10)
            right(90)
        }
}
//таблица сложения
//    0 1 2 3
//    _______
// 0| 0 1 2 3
// 1| 1 2 3 4
// 2| 2 3 4 5
// 3| 3 4 5 6
invisible()
//Обязательно использовать for:
//1)Нарисуйте сетку из кругов,  (-200,-200) по (200,200) , с шагом 20, радиусом 5.
//2)Сделайте вокруг сетки из п.1 рамочку из кругов другого цвета
//3)Сетка (-200,-200) (200,200) с шагом 20. 
//Четные строки - из квадратов, нечетные из треугольников
//4)Сетка (-200,-200) (200,200) с шагом 20, чем дальше шар от нижнего левого угла
//тем он больше
//5)Сетка (-200,-200) (200,200) с шагом 20, в каждой "клетке"
//находится красный треугольник, над корчневым квадратом (домик)


//6*)
//-Нарисовать шахматную доску, расположить коня в случайной клетке,
//-выбрать случайную клетку и пометить её
//-Добавить возможность ходить конем по шахматным правилам
//-Если конь пришел в помеченную клетку вывести "победа"



