//  [Lab05] Create a new file General.kt file in your project.
//  Move your General abstract class and all concrete subclasses to this file.

//  [Lab05] Modify the General class to implement the Player interface by adding : Player after the class declaration.
abstract class General(val name: String, val player: Player) : Player by player {
    open val maxHP: Int = 4
    override val identity: String = "General"
}

//  [Lab05] Add/modify a constructor to the General class that takes a player parameter of type Player.
class LiuBei(player: Player) : General("LiuBei", player) {
    override val maxHP: Int = 5

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class CaoCao(player: Player) : General("CaoCao", player) {
    override val maxHP: Int = 5

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class SunQuan(player: Player) : General("SunQuan", player) {
    override val maxHP: Int = 5

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class ZhangFei(player: Player) : General("ZhangFei", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class ZhaoYun(player: Player) : General("ZhaoYun", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class XiahouDun(player: Player) : General("XiahouDun", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class MaChao(player: Player) : General("MaChao", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class HuangZhong(player: Player) : General("HuangZhong", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class ZhouYu(player: Player) : General("ZhouYu", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class LuXun(player: Player) : General("LuXun", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class SimaYi(player: Player) : General("SimaYi", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class ZhangLiao(player: Player) : General("ZhangLiao", player) {
    override val maxHP: Int = 4

    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }

}

class GuanYu {
    val maximumHP = 4
}
class GuanYuAdapter(private val GuanYu: GuanYu, player: Player) : General("GuanYu", player) {
    init {
        currentHP = maxHP
        println("General $name created.")
        println("$name, ${player.identity} , has $currentHP health points.")
    }
}

object GeneralManager {
    private val list: MutableList<General> = mutableListOf()

    fun addGeneral(general: General) {
        list.add(general)
    }

    fun removeGeneral(general: General) {
        list.remove(general)
    }

    fun getGeneralCount(): Int {
        return list.size
    }

    fun createGenerals(nonLordFactory: GeneralFactory, nonLords: Int) {
        val lord = LordFactory().createRandomGeneral()
        addGeneral(lord)

        repeat(nonLords) {
            val nonLord = nonLordFactory.createRandomGeneral()
            addGeneral(nonLord)
        }
    }
}
fun main() {
    val lordFactory = LordFactory()
    val nonLordFactory = NonLordFactory()

    println("Enter the number of players: 4 to 10")
    var nonLords = readLine()?.toIntOrNull() ?: 0

    GeneralManager.createGenerals(nonLordFactory, nonLords - 1)

    val generalCount = GeneralManager.getGeneralCount()
    println("Total number of generals: $generalCount")
}
