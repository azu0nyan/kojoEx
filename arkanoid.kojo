//Игра арканоид
var ball = Picture.circle(10)
var sx = 10 //скорость шарика по оси х
var sy = 10 //скорость шарика по оси у
ball.draw()
//Игру можно сделать наивным образом используя intersects для определения столкновений
//и sx = -sx; sy = -sy для отражения 



/*
Если хочется боллее реалистичных столкновений шарика и прямоугольника то
напишем функцию определяющую с какой стороны произошло стокновение с блоком
x, y - положение шарика
r-радиус
bx, by - положение блока
w, h ширина и высота
         |                |
   1     |       2        |     3
         |                |
         |             (bx + w, by + h)
----------------------------------------
         |                |
  4     h|   5(внутри)    |     6
         |                |
         |        w       |                           
 ----------------------------------------   
      (bx, by)            |
         |                |
  7      |        8       |    9
         |                |   



*/
def collide(x: Int, y: Int, bx: Int, by: Int, w: Int, h: Int, r: Int): Int = {
    //разберем все случаи
    if (x < bx && y > by + h) //1
        if (math.sqrt((x - bx) * (x - bx) + (y - by) * (y - by - h)) < r) 1
        else 0
    else if (x > bx && x < bx + w && y > by + h) //2
        if (y - by - h < r) 2
        else 0
    else if (x > bx + w && y > by + h) //3
        if (math.sqrt((x - bx - w) * (x - bx - w) + (y - by) * (y - by - h)) < r) 3
        else 0
    else 0 // еще 5 случаев
}

animate {
    ball.offset(sx, sy) //перемещаем все шарики 
    for (b <- blocks) {
        var c = collide(ball.position.x, ball.position.y,
            b.position.x, b.position.y, 20, 10, 10) //определяем наличие столкновений
        if(c != 0) {/*мы столкнулись с блоком нужно его удалить из списка блоков*/}    
        if (c == 1 || c == 3 || c = 7 || c = 9) {
            sx = -sx
            sy = -sy
        }
        else if (c == 4 || c == 6) sx = -sx
        else if (c == 2 || c == 8) sy = -sy
    }
    if(/*Еслить столкновение с отбивающим пэдом*/){
        /*
        Как сделать правильный отскок шарика, шарик тем вертикальнее чем ближе ударился к центру
        будем счиатать что s = |sx| + |sy|, l - расстояние по х от точки столкновения, до центра педа
        тогда 
        sx = s - l
        sy = l 
        если sx был отрицательным, нужно сдлать его отричательным опять sx = -sx
        */
    }
}










