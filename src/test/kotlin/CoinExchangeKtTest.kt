import Coin.*
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CoinExchangeKtTest {


    @Test
    fun exchangeFully() {
        val (leastNumberOfCoins, remainder) = exchangeForLeastCoin(27)
        assertEquals(0, remainder)
        assertEquals(5, leastNumberOfCoins[FiveP])
        assertEquals(1, leastNumberOfCoins[TwoP])
        assertEquals(0, leastNumberOfCoins[OneP])
    }


    @Test
    fun `ensure coin denominations are ordered with highest value first `() {
        assertArrayEquals(arrayOf(FiveP, TwoP, OneP), enumValues<Coin>())
    }


    @Test
    fun `most coins of the same denomination that does NOT exceed some money`() {
        val money = 25
        assertEquals(5, mostChangeFor(money, FiveP))
        assertEquals(12, mostChangeFor(money, TwoP))
        assertEquals(money, mostChangeFor(money, OneP))
    }


    @Test
    fun `sum of money left behind when exchanged for all of the same coin`() {
        assertEquals(3, leavesBehind(3, FiveP))
        assertEquals(1, leavesBehind(3, TwoP))
        assertEquals(0, leavesBehind(3, OneP))
    }

}