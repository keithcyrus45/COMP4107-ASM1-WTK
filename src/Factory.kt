//  [Lab05] Create a new file named Factory.kt in your project.
//  Move all the factory classes to the newly created Factory.kt file. Make sure to update the package declaration accordingly.

abstract class GeneralFactory {
    abstract fun createRandomGeneral(): General
    abstract fun createPlayer(participantNumber: Int): Player
}

class LordFactory : GeneralFactory() {
    private val lords: MutableList<String> = mutableListOf("LiuBei", "CaoCao", "SunQuan")
    override fun createRandomGeneral(): General {
        val name = lords.random()
        lords.remove(name)
        val player = createPlayer(1)

        return when (name) {
            "LiuBei" -> LiuBei(player)
            "CaoCao" -> CaoCao(player)
            "SunQuan" -> SunQuan(player)
            else -> SunQuan(player)
        }
    }

    override fun createPlayer(participantNumber: Int): Player {
        return Lord()
    }
}

class NonLordFactory : GeneralFactory() {
    private val nonLords: MutableList<String> = mutableListOf(
        "ZhangFei", "ZhaoYun", "XiahouDun",
        "MaChao", "HuangZhong", "ZhouYu",
        "LuXun", "SimaYi", "ZhangLiao", "GuanYu")
    override fun createRandomGeneral(): General {
        val name = nonLords.random()
        nonLords.remove(name)
        val player = createPlayer(nonLords.size)

        return when (name) {
            "ZhangFei" -> ZhangFei(player)
            "ZhaoYun" -> ZhaoYun(player)
            "XiahouDun" -> XiahouDun(player)
            "MaChao" -> MaChao(player)
            "HuangZhong" -> HuangZhong(player)
            "ZhouYu" -> ZhouYu(player)
            "LuXun" -> LuXun(player)
            "SimaYi" -> SimaYi(player)
            "ZhangLiao" -> ZhangLiao(player)
            "GuanYu" -> GuanYuAdapter(GuanYu(), player)
            else -> throw IllegalArgumentException("Unknown non-lord name")
        }
    }

    override fun createPlayer(participantNumber: Int): Player {
        return when (participantNumber){
            9 -> Loyalist()
            8 -> Rebel()
            7 -> Spy()
            6 -> Rebel()
            5 -> Rebel()
            4 -> Loyalist()
            3 -> Rebel()
            2 -> Loyalist()
            1 -> Spy()
            else -> throw IllegalArgumentException("Unknown non-lord name")
        }
    }
}


