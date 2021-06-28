class Player {
    var name ="翁子皓"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
    fun castFireball(numFireballs: Int = 2)=
        println("一個FireBall出現了. (x$numFireballs)")
}