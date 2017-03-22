object sumCubeOfRangeWithTailRecursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	def sumOfCubes(a: Int, b: Int): Int = {
		if(a > b) 0;
		def cube(n: Int): Int = n*n*n;
		def loop(base: Int, acc: Int, count: Int): Int = {
			if(count == 0) acc;
			else loop(base, acc+cube(base+count), count-1);
		}
		loop(a, cube(a), b-a);
	}                                         //> sumOfCubes: (a: Int, b: Int)Int
	sumOfCubes(3,5);                          //> res0: Int = 216
}