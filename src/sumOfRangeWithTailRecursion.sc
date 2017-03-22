object sumOfRangeWithTailRecursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def sumInts(a: Int, b: Int):Int = {
  	if(a > b) 0;
  	def loop(base: Int, acc: Int, count: Int): Int = {
  		if(count == 0) acc;
  		else loop(base, acc+base+count, count-1);
  	}
  	loop(a, a, b-a);
  }                                               //> sumInts: (a: Int, b: Int)Int
  sumInts(3,7);                                   //> res0: Int = 25
}