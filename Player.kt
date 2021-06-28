class Player {
    var name ="翁子皓"
        get() = field.capitalize()
    private set(value) {
            field = value.trim()
        }

    var healthPoints = 89
    var isBlessed = true
    private val isImmortal = false

    fun castFireball(numFireballs: Int = 2)=
        println("一個FireBall出現了. (x$numFireballs)")
}