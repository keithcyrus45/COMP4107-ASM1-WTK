//  [Lab05] Create a new Kotlin file named Player.kt
//  to define the Player interface and the concrete player classes.

//  [Lab05] Declare the Player interface
interface Player{
    // An integer variable representing the current health points of the player.
    var currentHP: Int
    // A string variable representing the specific identity of the player.
    val identity: String
}

// [Lab05] Implement four concrete player classes that implement the Player interface: Lord, Loyalist, Spy, and Rebel.
class Lord : Player{
    // In each concrete class, set the currentHP property to 0.
    override var currentHP: Int = 0
    override val identity: String = "Lord"
}

class Loyalist : Player{
    override var currentHP: Int = 0
    override val identity: String = "Loyalist"
}

class Spy : Player{
    override var currentHP: Int = 0
    override val identity: String = "Spy"
}

class Rebel : Player{
    override var currentHP: Int = 0
    override val identity: String = "Rebel"
}