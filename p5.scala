import util.control.Breaks._

val e = List.range(1,21)

for (i <- 2147483640 to 1 by -20) {
    breakable {
        e.foreach(j => {
            if (i % j != 0) break
            else if (j == 20) println(i)
        })
    }
}