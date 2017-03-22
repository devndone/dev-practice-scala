object gcdWithTailRecursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def gcd(a: Int, b: Int): Int = {
  	if(b == 0) a
  	else gcd(b, a%b)
  }                                               //> gcd: (a: Int, b: Int)Int
  gcd(16, 32);                                    //> res0: Int = 16
  //gcd(17, 32);
}