//Ожидание используя счетчик кадров

cleari
var frame = 0
var framesLeft = -1
var framesLeft2 = -1
val p1 = Picture {
    setPenColor(red)
    circle(10)
}
val p2 = Picture {
    setPenColor(green)
    circle(10)
}
p1.draw()
p2.draw()
p2.invisible
p1.visible
onKeyPress {
    case Kc.VK_SPACE =>
       framesLeft = 100 
    case Kc.VK_A =>
       println("A pressed")
    case _ =>
}
animate{
    frame += 1
    framesLeft -= 1
    framesLeft2 -= 1
    println(frame, framesLeft, framesLeft2)
    if(framesLeft == 0){
        p1.invisible
        p2.visible
        framesLeft2 = 100 
    }
    if(framesLeft2 == 0){
        p2.invisible
        p1.visible
    }
}


//1)3 меняющихся цвета, смена цветов запускается после нажатия клавиши
//2)2 шарика меняют цвета, после нажатия на разные клавиши


