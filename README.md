# Kotlin Tuples

## How to Use

Maybe you want to use a Tuple to hold the result of a function, and you don not want to write a certain data class for that, this may help.

I generated 20 tuple types with `Generator.kts`, mutable and immutable. So use it like this:

```kotlin
fun returnFourValues() = tupleOf(1,2,3,4)

val (a, b, c, d) = returnFourValues()
``` 

You can convert the tuples to list:

```kotlin
val typedList = tupleOf(1,2,3,4).toTypedList() // List<Int>

val list = tupleOf(1, 2.0, 3f, "hello").toList() // List<Any?>
```

You can also use a infix function `U` to construct a tuple conveniently:

```kotlin
fun returnFourValues() = 1 U 2 U 3 U 4 // equivalent to tupleOf(1,2,3,4)
```

## Use in your project

It has been deployed to jCenter.

```
compile "com.bennyhuo.kotlin:kotlin-tuples:1.0"
```

## Issue

Please feel free to issue and pull request.

## License

[MIT License](LICENSE)