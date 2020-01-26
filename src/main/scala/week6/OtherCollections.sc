

val xs = Array(1,2,3,44)
xs map(x=> x*2)

val s = "Hello World"
s filter(c => c.isUpper)


// A number n is prime if the only divisors of n are 1 and n itself.
// What is high-level way to write a test for primarily of numbers?
// For once, value conciseness over efficiency

def isPrime(n: Int): Boolean = (2 until n) forall(d => n % d != 0)





