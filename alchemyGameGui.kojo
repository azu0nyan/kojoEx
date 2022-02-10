clear
val p1 = Picture.rect(20, 40)
val p2 = Picture.rect(20, 40)
p1.draw()
p2.draw()
p2.setPosition(200, 0)
 
 
var imageToElement: Map[Picture, String] = Map()
 
def setupElement(p:Picture, el: String) : Unit ={
    imageToElement = imageToElement + (p -> el)
 
    p.onMouseDrag { (x, y) =>
        p.setPosition(x, y)
    }
 
    p.onMouseRelease { (x, y) =>
        val touched = imageToElement.keys.find (pict => pict != p && pict.intersects(p))
        println(touched)
        if(touched.nonEmpty)  {
            println(imageToElement(touched.get))
            println(imageToElement(p))
        }
    }
}
setupElement(p1, "earth")
setupElement(p2, "air")