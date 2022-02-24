clear
//рисуем тестувую картинку
setSpeed(fast)
setFillColor(blue)
repeat(4){
    forward(20)
    right()
}
setPosition(canvasBounds.x, canvasBounds.y)
repeat(4){
    forward(20)
    right()
}
setPosition(canvasBounds.x + canvasBounds.width, canvasBounds.y + canvasBounds.height)
right(180)
repeat(4){
    forward(20)
    right()
}
//Через МАГИЮ получаем текущую картинку, нарисованную на экране, запишем её в img
val dAPI = TSCanvas.asInstanceOf[net.kogics.kojo.lite.DrawingCanvasAPI]
val cam = dAPI.tCanvas.getCamera 
val img = cam.toImage.asInstanceOf[java.awt.image.BufferedImage] //!!!!!!Это долгая операция
//img.getRGB(x, y) возвращает цвет пикселя как число, в экраннык координатах
//0, 0 находится в верхнем левом углу(что неудобно)
//цвет возвращается как его 32-битное значение  Int
println(img.getRGB(0, 0))
println(img.getRGB(0, img.getHeight - 1))
println(new Color(img.getRGB(0, img.getHeight - 1)))

animate{
    //viewToLocal получает положение курсора мыши в экранных координатах
    val onCamera = cam.viewToLocal(new java.awt.Point(mouseX.toInt, mouseY.toInt))
    println(onCamera)
    //если курсор мыши попл на экран
    if(onCamera.getX >= 0 && onCamera.getX < img.getWidth && 
        onCamera.getY >= 0 && onCamera.getY < img.getHeight){
        val colorInt = img.getRGB(onCamera.getX.toInt, onCamera.getY.toInt)
        //конвертируем цвет в привычный нам формат
        val color = ColorMaker.hex(colorInt)       
        println(color)
    }
}
//А так можно сохранить картинку из kojo на диск
javax.imageio.ImageIO.write(
    img, 
    "png", 
    new java.io.File("/tmp/text.png"))
