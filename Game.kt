
import java.lang.Math.pow
import java.lang.Math.random

fun main() {

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



