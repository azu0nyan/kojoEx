cleari 
/*Цель игры - уклоняться от падающих шариков*/
var me = Picture.rect(20, 30)
me.draw()
var enemies: Seq[Picture] = Seq()
var f = 0
animate{
    if(f % 20 == 0){//спавн противников
        var ne = Picture.circle(20)
        ne.draw()
        ne.setPosition(random(-100, 100), 200)
        enemies = enemies :+ ne
    }
    //перемещение противников
    for(e <- enemies)e.translate(0, -5)
    //управление
    if(isKeyPressed(Kc.VK_A))me.translate(-5, 0)
    //проверка столкновений
    var in = false
    for(e <- enemies) if(e.intersects(me)) in = true            
    if(in)stopAnimation()
    f = f + 1
}
/*https://pastebin.com/jN3fwkDV
1)Доделать управление, добавить ускорение при зажатом shift
var speed = if(isKeyPressed(Kc.VK_SHIFT)) 10 else 3
2)Шарики имеют 2 типа траекторий
3)Добавить шарики вылетающие снизу, или справа и слева.
4)Запретить игроку улетать за края игрового поля.
me.position.x < КООРДИНАТА_ПРАВОГО_КРАЯ
5)Ускорение противников от времени
p.translate(5 + f / 100)
6)Случайный противник "стреляет" в направлении игрока или
из-случайного противника исходит "фейерверк" пуль.
bullet.setPosition(shooter.position)
*/