//Игра - динозаврик - базовая версия

cleari
//Картинка динозаврика
val dino = Picture.rect(20, 10)
dino.draw()
dino.setPosition(-150, 0)
//Картинка земли
val earth = Picture {
    setPenColor(green)
    setPosition(-300, 0)
    lineTo(300, 0)
}
earth.draw()
//Картинка кактуса
val cactus = Picture {
    setPenColor(new Color(0, 127, 0))
    setPenThickness(15)
    forward(35)
}
cactus.setPosition(300, 0)
cactus.draw()

val g = -0.5 //Сила гравитации
var sy = 0.0 //вертикальная скорость
var onGround = true //на земле ли мы
var isDucked = false //присели ли мы
onKeyPress {
    //прыгаем, если на земле
    case Kc.VK_SPACE if onGround =>
        sy = 10 //задаем вертикальую скорость
        onGround = false
        if (isDucked) {
            //нельзя приседать в воздухе
            //отменяем приседание
            dino.scale(2.0, 1.0)
            isDucked = false
        }
        //приседаем, если на земле и уже "не присели"
    case Kc.VK_DOWN if onGround && !isDucked =>
        isDucked = true
        //сжимаем dino в 2 раза по вертикали
        dino.scale(1.0, 0.5)
    case _ =>
}
onKeyRelease {
    //встаем если были присевшими и отпустили кнопку
    case Kc.VK_DOWN if isDucked =>
        dino.scale(1.0, 2.0)
        isDucked = false
    case _ =>
}

animate {
    //двигаем кактус
    cactus.offset(-3, 0)
    //если кактус уехал за левый край, телепортирум за парвый
    if (cactus.position.x < -350) {
        cactus.setPosition(350, 0)
    }
    //если столкнулись с кактусом - поражение
    if (cactus.intersects(dino)) {
        stopAnimations()
        val gotext = Picture.textu("GAME OVER", 90, red)
        gotext.draw()
        gotext.offset(-300, 200)
    }
    //если в воздухе
    if (!onGround) {
        sy += g //меняем скорость
        dino.offset(0, sy) //сдвигаемся вверх или в них, в зависимости от скорости
        if (dino.position.y < 0) {
            //если упали на землю, остаемся на ней
            sy = 0.0
            onGround = true
            dino.setPosition(dino.position.x, 0)
        }
    }

} 
//1)Добавить еще кактус и птицу
//2)Добавить Картинки
//3)Добавить кнопку перезапуска игры
//4)Усложнение игры от времени(увеличение скорости)
//5*)Добавить много препятстсвий
//6*)Добавить дабл джамп

