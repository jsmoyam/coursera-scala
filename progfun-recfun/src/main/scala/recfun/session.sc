package recfun

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    	
  	if (c==0 || r==c) 1
  	else pascal(c-1, r-1) + pascal(c, r-1)
    
  }                                               //> pascal: (c: Int, r: Int)Int
	
	pascal(3, 5)                              //> res0: Int = 10
	
	
	
	def balance(chars: List[Char]): Boolean = {
    
    def balanceImpl(cont: Int, chars: List[Char]): Boolean = {
      if (cont==0 && chars.isEmpty) true
      else if (cont!=0 && chars.isEmpty) false
      else {
        var head = chars.head
        if (head!='(' && head!=')') balanceImpl(cont, chars.tail)
        else {
          if (head=='(') balanceImpl(cont+1, chars.tail)
          else balanceImpl(cont-1, chars.tail)
        }
      }
    }

    balanceImpl(0, chars)
  }                                               //> balance: (chars: List[Char])Boolean
  
  balance("())(".toList)                          //> res1: Boolean = true
	
}