package recfun

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(149); 
	
	  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    	
  	if (c==0 || r==c) 1
  	else pascal(c-1, r-1) + pascal(c, r-1)
    
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(16); val res$0 = 
	
	pascal(3, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(490); 
	
	
	
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
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(28); val res$1 = 
  
  balance("())(".toList);System.out.println("""res1: Boolean = """ + $show(res$1))}
	
}
