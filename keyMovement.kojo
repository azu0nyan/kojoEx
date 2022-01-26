//Упправление с клавиатуры - задание

cleari
val p = Picture.rect(20, 40)
p.draw()
val o1 = Picture.rect(100, 20)
o1.setPosition(100, 0)
o1.draw()
val o2 = Picture.rect(100, 20)
o2.setPosition(-100, 0)
o2.draw()
 
var v = 1d
animate{
    if(isKeyPressed(Kc.VK_RIGHT)){
        p.translate(v, 0)
    }
    
    if(o1.intersects(p) || o2.intersects(p)){
        stopAnimations()
        Picture.textu("GAME OVER", 80).draw()
    }
}
//1)Доделать управление на 4 кнопки
//2)Добавить больше препятствий
//3)Сделать управление "как у машины" с разгоном
//И поворотом
 
