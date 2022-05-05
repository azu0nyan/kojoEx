//Старый код 
//  https://pastebin.com/E0k9xJ5t

cleari
//Заводим необходимые переменные
//....

def spawnEnemy() : Unit = { 
    /* Код спавна противников */
}
def input() : Unit = {
    /*код управления*/
}
def move() : Unit = {
    /*код перемещения противников*/
}
def collide() : Unit = {
    /*код столкновения с пулями*/
}
animate{
    spawnEnemy()
    input()
    move()
    collide()
    frame = frame + 1
}



/////Теперь примерно так можно сделать разные типы противников
//и спавн конкретного тиав в конкретные кадры
def spawnEnemy1() : Unit = {
    val spawnFrames = 
        Seq(30, 35, 300, 305)
    var found = false    
    for(sf <- spawnFrames) 
        if(frame == sf) found = true
    if(found) {
        //код спавна противника
        //var p = Picture....
    }
}

def spawnEnemy() : Unit = {
    spawnEnemy1()
    spawnEnemy2()
    .......
}    


/*Задание:
1)Переделайте код с прошлых занятий под предложенную структуру
2)Один из типов противников появляется в определенные кадры из списка,
пример ниже
3)В игре можно победить продержавшись определенное время, и проиграть
должно выводится сообщение о победе или поражении.
4)При старте и конце игры вызывается toggleFullScreenOutput()
*/    

