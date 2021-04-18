import java.util.Scanner
case class Product(val code: Int, quantity: Int, val value: Double)

object Main extends App {
  val sc = new Scanner(System.in)
  val p1 = new Product(sc.nextInt(), sc.nextInt(), sc.nextDouble())
  val p2 = new Product(sc.nextInt(), sc.nextInt(), sc.nextDouble())
  val tot= List(p1,p2).foldLeft(0.0)((acc, x) => x.value * x.quantity + acc)
  println(tot)
  sc.close()
}