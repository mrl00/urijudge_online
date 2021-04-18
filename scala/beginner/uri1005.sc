object Main extends App {
  val a = io.StdIn.readDouble()
  val b = io.StdIn.readDouble()
  printf("MEDIA = %.5f\n", (a*3.5+b*7.5)/11.0)
}