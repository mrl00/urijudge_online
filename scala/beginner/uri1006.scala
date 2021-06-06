object Main extends App {
  val a = io.StdIn.readDouble()
  val b = io.StdIn.readDouble()
  val c = io.StdIn.readDouble()
  printf("MEDIA = %.1f\n", (a * 2 + b * 3 + c * 5) / 10.0)
}
