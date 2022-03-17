var inventory: Map[String, Int] = 
    Map("STONE" -> 2, 
        "STICK" -> 3, 
        "ORE" -> 3)

def haveInInventory(what: String, amount: Int): Boolean =
    inventory.contains(what) && inventory(what) >= amount

def addInInventory(what: String, amount: Int): Unit =
    if (inventory.contains(what)) inventory += what -> (inventory(what) + amount)
    else inventory += what -> amount

case class Recepie(e1: Option[String],
                   e2: Option[String],
                   e3: Option[String]) {
     def toList: Seq[String] = Seq(e1,e2, e3).flatten
     def toMap: Map[String, Int] = 
        toList.groupBy (x => x).map{case(x, y) => (x, y.size)}
        
}

var book:Map[String, Recepie] = Map(
    "LIGHTER" -> Recepie(Some("IRON"), Some("FLINT"), None),
    "PLANK" -> Recepie(Some("STICK"), Some("STICK"), None),
    "IRON" -> Recepie(Some("ORE"), None, None)
    )
    
def canCraft(what: String): Boolean = 
    book.contains(what) && 
    book(what).toMap.toSeq.forall{case (e, c) => haveInInventory(e, c)}

def craft(what: String) : Unit = {    
    if(canCraft(what)) {
        println(s"Кравчу $what")
        book(what).toMap.foreach{case (e, c) => addInInventory(e, -c)}
        addInInventory(what, 1)
    } else {
        if(!book.contains(what)){
            println(s"Неизвестный рецепт $what")
        } else {
            println(s"Нехватает ингридиентов на $what")
        }
    }
}



craft("LIGHTER")
craft("IRON")
craft("LIGHTER")
    
    
                        