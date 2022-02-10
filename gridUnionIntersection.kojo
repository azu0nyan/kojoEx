clear
var max = 10

//Таблица сложения[1]
//выводим заголовок

print("    ")
for( i <- 0 to max){
    print(f"|$i%3d")
}
println("")
print("    ")
for( i <- 0 to max){
    print(f"____")
}
println("")
//выводим таблицу
for( i <- max to 0 by -1){//рисуем в обратном порядке для соответствия картике(чтобы 0 был внизу)
    print(f" $i%3d")
    for( j <- 0 to max){
           print(f"|${(i - j)  }%3d")
    }
    println("")
}

//часть 2

setSpeed(superFast)
//Нарисуем сетку
for( i <- 0 to max;j <- 0 to max){   
    setPosition(-300 + j * 20, i * 20)
    repeat(4){
        forward(20)
        right(90)
    }
}

//Допустим мы хотим закрасить треугольник образованный главной 
//диагональю и верхним правым углом сетки
//Посмотрев на таблицу сложения, легко заметить что в интересующей
//нас области находятся числа больше равные размерц таблицы
//Соответтвенно используя условие  i + j >= max, получим требуюмую картинку

for( i <- 0 to max;j <- 0 to max){   
    setPosition(j * 20, i * 20)
    if(i + j >= max )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}


//Похожими рассуждениями для таблицы вычитания, нарисум треугольник под ругой диагональю
// i - j <= 0
for( i <- 0 to max;j <- 0 to max){   
    setPosition(250 + j * 20, i * 20)
    if(i - j <= 0 )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}


//Теперь объеденим две картинки используя || 
//i + j >= max ||i - j <= 0 
for( i <- 0 to max;j <- 0 to max){   
    setPosition(550 + j * 20, i * 20)
    if(i + j >= max ||i - j <= 0 )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}

//Так же можно пересечь две картинки используя && 
//i + j >= max  && i - j <= 0 
for( i <- 0 to max;j <- 0 to max){   
    setPosition(800 + j * 20, i * 20)
    if(i + j >= max  && i - j <= 0 )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}

// i== max / 3, с этим условием получается горизонтальная линия
//находящаяяся на 1/3 от низа
for( i <- 0 to max;j <- 0 to max){   
    setPosition(1050 + j * 20, i * 20)
    if(i== max / 3 )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}
//https://github.com/azu0nyan/kojoEx
//использ1уя0.50 a & !b можно вычесть одну картинку из другой
//(i + j >= max  && i - j <= 0) && !(i== max / 3)
for( i <- 0 to max;j <- 0 to max){   
    setPosition(1300 + j * 20, i * 20)
    if((i + j >= max  && i - j <= 0) && !(i== max / 3) )setFillColor(black)
    else setFillColor(white)

    repeat(4){
        forward(20)
        right(90)clear
var max = 10

//Таблица сложения[1]
//выводим заголовок

print("    ")
for( i <- 0 to max){
    print(f"|$i%3d")
}
println("")
print("    ")
for( i <- 0 to max){
    print(f"____")
}
println("")
//выводим таблицу
for( i <- max to 0 by -1){//рисуем в обратном порядке для соответствия картике(чтобы 0 был внизу)
    print(f" $i%3d")
    for( j <- 0 to max){
           print(f"|${(i - j)  }%3d")
    }
    println("")
}

//часть 2

setSpeed(superFast)
//Нарисуем сетку
for( i <- 0 to max;j <- 0 to max){   
    setPosition(-300 + j * 20, i * 20)
    repeat(4){
        forward(20)
        right(90)
    }
}

//Допустим мы хотим закрасить треугольник образованный главной 
//диагональю и верхним правым углом сетки
//Посмотрев на таблицу сложения, легко заметить что в интересующей
//нас области находятся числа больше равные размерц таблицы
//Соответтвенно используя условие  i + j >= max, получим требуюмую картинку

for( i <- 0 to max;j <- 0 to max){   
    setPosition(j * 20, i * 20)
    if(i + j >= max )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}


//Похожими рассуждениями для таблицы вычитания, нарисум треугольник под ругой диагональю
// i - j <= 0
for( i <- 0 to max;j <- 0 to max){   
    setPosition(250 + j * 20, i * 20)
    if(i - j <= 0 )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}


//Теперь объеденим две картинки используя || 
//i + j >= max ||i - j <= 0 
for( i <- 0 to max;j <- 0 to max){   
    setPosition(550 + j * 20, i * 20)
    if(i + j >= max ||i - j <= 0 )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}

//Так же можно пересечь две картинки используя && 
//i + j >= max  && i - j <= 0 
for( i <- 0 to max;j <- 0 to max){   
    setPosition(800 + j * 20, i * 20)
    if(i + j >= max  && i - j <= 0 )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
}

// i== max / 3, с этим условием получается горизонтальная линия
//находящаяяся на 1/3 от низа
for( i <- 0 to max;j <- 0 to max){   
    setPosition(1050 + j * 20, i * 20)
    if(i== max / 3 )setFillColor(black)
    else setFillColor(white)
    repeat(4){
        forward(20)
        right(90)
    }
} // 
//https://github.com/azu0nyan/kojoEx
//используя a & !b можно вычесть одну картинку из другой
//(i + j >= max  && i - j <= 0) && !(i== max / 3)
for( i <- 0 to max;j <- 0 to max){   
    setPosition(1300 + j * 20, i * 20)
    if((i + j >= max  && i - j <= 0) && !(i== max / 3) )setFillColor(black)
    else setFillColor(white)

    repeat(4){
        forward(20)
        right(90)
    }
}

//Задания
//1)Крест с шириной линии 1
//2)Решетка, где закрашена каждая третья вертикальная 
//или горизонтальная линия
//3)Прямоугольник в центре половина х четверть сетки
//4)Медицинский крест в центре(два прямоугольника)
//5)Рамочка находящаяяся на расстоянии одна клетка от края
//6)Песочные часы
//7*)Смайлик




    }
}

//Задания
//1)Крест с шириной линии 1
//2)Решетка, где закрашена каждая третья вертикальная 
//или горизонтальная линия
//3)Прямоугольник в центре половина х четверть сетки
//4)Медицинский крест в центре(два прямоугольника)
//5)Рамочка находящаяяся на расстоянии одна клетка от края
//6)Песочные часы
//7*)Смайлик



