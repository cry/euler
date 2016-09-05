import scala.collection.mutable.Map

object fib {
    private val cache = Map[Int, BigInt]()

    def term(n: Int): BigInt = {
        if(cache.contains(n)) cache(n)
        else {
            if(n <= 2){
                cache += (n -> 1)
                1
            } else {
                cache += (n -> (this.term(n-1) + this.term(n-2)))
                cache(n)
            }         
        }
    }
}

List.tabulate(35)(n => fib.term(n)).filter(_ % 2 == 0).sum