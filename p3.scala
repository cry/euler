def fermatFactorisation(i: Double): Unit = {
    if (i % 2 == 0 || i == 1) -1
    
    var sqrt = math.ceil(math.sqrt(i))
    var b2 = sqrt*sqrt - i
    
    while (math.sqrt(b2) % 1 != 0) {
        sqrt += 1
        b2 = sqrt*sqrt - i
    }

    val res = sqrt + math.sqrt(b2)

    println(res)

    if(res != 1){
        fermatFactorisation(i/(sqrt + math.sqrt(b2)))   
    }
    
}

val x:Double = 600851475143L

fermatFactorisation(x)