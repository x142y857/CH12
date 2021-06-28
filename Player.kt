class Player {
    val name ="翁子皓"
        get() = field.capitalize()
    fun castFireball(numFireballs: Int = 2)=
        println("一個FireBall出現了. (x$numFireballs)")
}