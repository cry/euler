val e = List.range(100, 999)

List.range(900*900, 999*999).filter(x => x.toString == x.toString.reverse).reverse.foreach(i => {
    e.foreach(j => {
        if (i % j == 0 && i/j < 999) println(i + " : " + j)
    })
})