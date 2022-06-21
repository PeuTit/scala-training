object functionLesson {
  // Greeting function
  def greeting(name: String, age: Int): String = {
    "Hi my name is " + name + " and I'am " + age + " year(s) old."
  }

  println(greeting("Titouan", 22))
  println(greeting("Sacha", 22))

  println("-" * 50)

  // Factorial function 1*2*3*4*n
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(0))
  println(factorial(1))
  println(factorial(2))
  println(factorial(4))
  println(factorial(5))
  println(factorial(10))
  println(factorial(12))

  println("-" * 50)

  // Fibonacci f(1) = 1 f(2) = 1 f(n) f(n-1) + f(n-2)
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(1))
  println(fibonacci(2))
  println(fibonacci(3))
  println(fibonacci(4))
  println(fibonacci(5))
  println(fibonacci(6))
  println(fibonacci(7))
  println(fibonacci(8))

  println("-" * 50)

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
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

}
