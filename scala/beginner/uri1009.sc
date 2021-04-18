import java.io.DataOutput
object Main extends App {
  val nam = io.StdIn.readLine()
  val sal = io.StdIn.readFloat()
  val ven = io.StdIn.readFloat()
  printf("TOTAL = R$ %.2f\n", sal + 0.15 * ven)
}