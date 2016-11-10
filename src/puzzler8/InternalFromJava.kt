package puzzler8

import kotlin.reflect.jvm.javaMethod

class InternalFromJava {
  internal fun hello() = "world"
}

fun main(args: Array<String>) {
  println(InternalFromJava::hello.javaMethod?.name)
}

// What will it print?
// a) hello
// b) world
// c) hello$kotlin_puzzlers
// d) null
