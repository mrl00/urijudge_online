import Math.pow

object Main extends App {
  val π = 3.14159
  val r = io.StdIn.readDouble()
  printf("%.4f\n", π * pow(r, 2))
}
