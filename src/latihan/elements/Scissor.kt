package latihan.elements

import latihan.ResultSuit
import latihan.StringContainer
import latihan.Suit

class Scissor(name: String): Suit(name) {

    override fun loseTo(): String {
        return StringContainer.rock
    }

    override fun winFrom(): String {
        return StringContainer.paper
    }

    override fun drawFrom(): String {
        return this.name
    }


}