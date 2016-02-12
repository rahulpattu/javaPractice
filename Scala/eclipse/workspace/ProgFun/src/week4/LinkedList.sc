package week4
import week4._

object LinkedList {
 
 def nth[T] (n : Int, t: list[T]) : T =
 if(t.isEmpty ) throw new IndexOutOfBoundsException
 else if (n == 0) t.head
 else nth(n-1, t.tail)                            //> nth: [T](n: Int, t: week4.list[T])T
 
 val list = new Cons(1, new Cons(2, new Cons (3, new Nil)))
                                                  //> list  : week4.Cons[Int] = week4.Cons@39ba5a14
    nth(2, list)                                  //> res0: Int = 3
    nth(1, list)                                  //> res1: Int = 2
    
 }
 