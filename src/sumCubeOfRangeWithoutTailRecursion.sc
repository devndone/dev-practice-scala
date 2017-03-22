object sumCubeOfRangeWithoutTailRecursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def cube(n: Int): Int = n*n*n;                  //> cube: (n: Int)Int
  def sumOfCubes(a: Int, b: Int): Int = {
  	if(a > b) 0;
  	else cube(a) + sumOfCubes(a+1, b);
  }                                               //> sumOfCubes: (a: Int, b: Int)Int
  sumOfCubes(3, 5)                                //> res0: Int = 216
}