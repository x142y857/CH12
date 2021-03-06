class Player {
    var name ="翁子皓"
        get() = field.capitalize()
    private set(value) {
            field = value.trim()
        }

    var healthPoints = 89
    var isBlessed = true
    private val isImmortal = false

    fun auraColor(): String {
        val auraVisible = isBlessed && healthPoints > 50 || isImmortal
        val auraColor = if (auraVisible) "綠色" else "沒有"
        return auraColor
    }
    fun formatHealthStatus()=
        when (healthPoints) {
            100 -> "健康狀態極佳"
            in 90..99 -> "有一些小擦傷"
            in 75..89 -> if (isBlessed) {
                "雖有一些傷口，但恢復很快"
            } else {
                "有一些傷口"
            }
            in 15..74 -> "嚴重受傷"
            //顯示玩家狀態
            else -> "情況不妙"
        }


    fun castFireball(numFireballs: Int = 2)=
        println("一個FireBall出現了. (x$numFireballs)")
}