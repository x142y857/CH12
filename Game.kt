
import java.lang.Math.pow
import java.lang.Math.random

fun main() {
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false

    val player = Player()
    player.castFireball()
    val karma = (pow(random(),(110-healthPoints)/100.0)*20).toInt()
    //Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal, karma)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    printPlayerStatus(auraColor, isBlessed, player.name, healthStatus)

}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("光環顏色：$auraColor" + "    走運嗎？${if (isBlessed) "是的" else "很背"}")
    println("$name $healthStatus")
}

private fun auraColor(
    isBlessed: Boolean,
    healthPoints: Int,
    isImmortal: Boolean,
    karma: Int
): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = when (karma) {
        in (0..5) -> "紅色"
        in (6..10) -> "橘色"
        in (11..15) -> "紫色"
        in (16..20) -> "綠色"
        else -> "無光環"
    }
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean)=
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



