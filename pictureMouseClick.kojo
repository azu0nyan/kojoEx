cleari
var mk = Picture.image("mousek.jpg")
mk.draw()
mk.setPosition(-130, -50)
mk.scale(0.5)
mk.invisible()
var score = 0

mk.onMouseClick { (x, y) =>
    score += 1
    println(score)
    mk.invisible()
}
animate{
    if(!mk.isVisible){
        var x = random(100)
        if(x == 99){
            mk.visible()    
        }
    } else {
        var x = random(100)
        if(x == 99){
            mk.invisible()    
        }
    }
}
