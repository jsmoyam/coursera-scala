package greeter

object WorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(10); 
  val x=1;System.out.println("""x  : Int = """ + $show(x ));$skip(29); 
  def increase(i: Int) = i+1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(14); val res$1 = 
  increase(x);System.out.println("""res1: Int = """ + $show(res$1))}
  
  
  
  
  
  
}