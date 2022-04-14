cleari
var s: Seq[Picture] = Seq()
for (i <- 0 until 360 by 10) {
    var p = Picture.image("fire3.png")
    p.draw()
    p.rotate(i)
    p.scale(0.7)
    s = s :+ p
}
var f = 0
animate {
    f = f + 1
    for (p <- s) {
        p.translate(10, 0)
        if((f / 25) % 2 == 0) p.rotate(4)
        else p.rotate(-4)
        if (f % 3 == 0) {
            var c = Picture.image("fire2.png")
            c.scale(0.2)
            c.draw()
            c.setPosition(p.position)
        }
    }

}
