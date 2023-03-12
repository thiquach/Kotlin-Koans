fun foo(name: String, number: Int, toUpperCase: Boolean) =
        (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
        foo("a", number = 42, toUpperCase = false),
        foo("b", number = 1, toUpperCase = false),
        foo("c", number = 42, toUpperCase = true),
        foo("d", number = 2, toUpperCase = true)
)
