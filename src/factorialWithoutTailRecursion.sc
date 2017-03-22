object factorialWithoutTailRecursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def factorial(n: Int): Int = {
  	if(n == 0) 1
  	else n * factorial(n-1)
  }                                               //> factorial: (n: Int)Int
  factorial(5);                                   //> res0: Int = 120
}