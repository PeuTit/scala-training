object recursionLesson {
  // Factorial function 1*2*3*4*n
  def factorial(n: Int): BigInt = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  // println(factorial(10))
  // println(factorial(200000)) => StackOverFlow

  def anotherFactorial(n: Int): BigInt = {
    @scala.annotation.tailrec
    def factorialHelper(x: Int, acc: BigInt): BigInt =
      if (x <= 1) acc
      else factorialHelper(x - 1, x * acc) // tail recursive

    factorialHelper(n, 1)
  }
  // println(anotherFactorial(5000))

  // When you need loops, use tail recursion.

  // Concatenate a string n times
  // string * n => stringstringstring...string
  def greeting(s: String, n: Int): String = {
    @scala.annotation.tailrec
    def greetingHelper(x: Int, acc: String): String = {
      if (x <= 1) acc
      else greetingHelper(x - 1, acc + s)
    }

    greetingHelper(n, s)
  }

  // 0 case not handled
  println("0" + greeting("Titouan", 0))
  println(greeting("Titouan", 1))
  println(greeting("Titouan", 2))
  println(greeting("Titouan", 4))
  println(greeting("Titouan", 10))

  println("-" * 50)

  // IsPrime function tail recursive

  def isPrime(n: Int): Boolean = {
    @scala.annotation.tailrec
    def isPrimeUntil(t: BigInt): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(1))
  println(isPrime(2))
  println(isPrime(3))
  println(isPrime(4))
  // println(isPrime(2003)) => true
  println(isPrime(1_000_000_000))

  println("-" * 50)

  // Fibonacci function, tail recursive
  // f(1) = 1 f(2) = 1 f(n) f(n-1) + f(n-2)
  def fibonacci(n: Int): Int = {
    @scala.annotation.tailrec
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailRec(i + 1, nextToLast + last, last)
    }
    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)

  }

  println(fibonacci(1))
  println(fibonacci(2))
  println(fibonacci(3))
  println(fibonacci(4))
  println(fibonacci(5))
  println(fibonacci(6))
  println(fibonacci(7))
  println(fibonacci(8))

}
