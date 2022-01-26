cleari


var mk = Picture.image("mousek.jpg")
mk.draw()
mk.setPosition(-130, -50)
mk.scale(0.5) 
mk.invisible()
var m = Picture.image("mouse.jpg")
m.draw()
m.setPosition(-130, -50)
m.scale(0.5)
m.invisible()
var md = Picture.image("moused.jpg")
md.draw()
md.setPosition(-130, -50)
md.scale(0.5)
md.invisible()
 
var score = 0
var frame = 0 //номер кадра
var state = 0 
var stateStart = 0 //когда началост текущее состояние
//0 - нет на экране 0 -> 1 (прошло время + рандом)
//1 - появляется 1 -> 2 (прошло время)
//2 - есть на экране 2 -> 3 (навели курсор)
//3 - испугалась 3 ->2 (убрали курсор), 3 -> 4 (кликнули)(прошло время)
//4 - исчезает 4 -> 0 (прошло время)
 
mk.onMouseEnter { (x, y) =>
    if(state == 2){
        state = 3
        m.visible()
        mk.invisible()
    }
}
 
m.onMouseExit{ (x, y) =>
    if(state == 3){
        state = 2
        mk.visible()
        m.invisible()
    }
}
m.onMouseClick { (x, y) =>
    if(state == 3) {
        state = 4
        score = score + 1
    }
}
mk.onMouseClick { (x, y) =>
    if(state == 2) {
        state = 4
        score = score + 1
    }
}
 
animate{
    println(s"state: $state  score: $score")
    frame = frame + 1
    var stateTime = frame - stateStart //сколько идет state
    if(state == 0){
        if(stateTime > 40) {
            var x = random(50)
            if(x == 49){
                state = 1
                mk.visible()
                mk.setOpacity(0.0)
                stateStart = frame
            }
        }
    } else if(state == 1){
        if(stateTime > 20){
            state = 2
            m.setOpacity(1.0)
            mk.setOpacity(1.0)
            stateStart = frame
        } else {
            mk.setOpacity(stateTime / 20.0)
        }
    } else if(state == 2){
        if(stateTime > 40) {
            var x = random(50)
            if(x == 49){
                state = 4   
                stateStart = frame
            }
        }
    } else if(state == 3){
        if(stateTime > 40) {
            var x = random(50)
            if(x == 49){
                state = 4   
                stateStart = frame
            }
        }
    } else if(state == 4){
        if(stateTime > 20){
            state = 0
            m.invisible()
            mk.invisible()
            stateStart = frame
        } else {
            m.setOpacity(1.0 - stateTime / 20.0)
            mk.setOpacity(1.0 - stateTime / 20.0)
        }
    }
}
