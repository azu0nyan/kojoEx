for(i <- 0 until 256){   //min = 0            max = 65535 = 2^16 - 1
    print(f"$i%3d ${i.toChar}   |") 
    if(i % 8 == 0) println()
}
