//Сочетания клавишь + задание

clear
//Переменные в которах хранится нажата ли сейчас клавиша
var isControl = false
var isC = false
//в программе должен быть ровно один onKeyPress, onKeyRelease, animate
//по одному case на каждую клавишу, запомнимем что клавиша зажата
onKeyPress { 
    case Kc.VK_CONTROL => isControl = true
    case Kc.VK_C => isC = true
    case _ =>
}
//запоминаем что клавиша отпущена
onKeyRelease { 
    case Kc.VK_CONTROL => isControl = false
    case Kc.VK_C => isC = false 
    case _ =>
}

animate{
    //если нажаты и control и С
    if(isControl && isC){
        println("copy")
    }
}
//Обратите внимание что для того чтобы нажатия клавиш считывались
//необходимо выбрать "окно рисования" кликом мыши

//Задание
//1)Добавить больше сочетаний клавиш, их нажатие должно выводить соответствующий текст
//ctrl+V -> paste
//ctrl+A -> select all
//ctrl+X -> cut
//ctrl+Z -> undo
//ctrl+shift+Z -> redo
//C+A+T -> cat
//D+O+G -> dog
//2)В приведенном примере кода, при удержании сочетания клавиш, соответствующий 
//текст печатается много раз. Сделайте так чтобы для каждого нажатия сочетаний клавишь 
//текст выводился ровно один раз.




