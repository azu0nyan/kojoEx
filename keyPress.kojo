//Реакция на нажатие клавишь

cleari

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
        p1.invisible
        p2.visible
       
    case _ =>
}
onKeyRelease {
    case Kc.VK_SPACE =>
        p2.invisible
        p1.visible        
    case _ =>
}
