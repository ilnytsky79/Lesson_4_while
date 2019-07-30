package classes

fun main(){
   val WhileExample = WhileExample()
       WhileExample.whileLoop()
  }



class WhileExample{


    fun whileLoop (){

        val maxCount=100
        var currentCount=0

        while (currentCount<=maxCount) {
          println(currentCount)
          currentCount++
        }

    }
}