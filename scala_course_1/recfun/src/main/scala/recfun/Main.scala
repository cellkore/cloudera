package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = 
      if(c==0 || c==r) 1
      else pascal(c-1,r-1)+pascal(c,r-1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balancedParantheses(chars: List[Char], open: Int): Boolean = {
        if (chars.isEmpty) open == 0
            else
                if (chars.head == '(') balancedParantheses(chars.tail,open+1)        
                else
                    if (chars.head == ')') open>0 && balancedParantheses(chars.tail,open-1)
                    else balancedParantheses(chars.tail,open)
      }      
      balancedParantheses(chars,0)
   }
    
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money==0) 1
      else if(money>0 && !coins.isEmpty)
        return countChange(money-coins.head, coins) + countChange(money, coins.tail);
      else 0;
    }
  }
