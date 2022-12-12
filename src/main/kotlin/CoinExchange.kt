enum class Coin(val value: Int) {
    FiveP(5),
    TwoP(2),
    OneP(1),
}

fun mostChangeFor(money: Int, allInCoin: Coin) = money / allInCoin.value

fun leavesBehind(money: Int, inCoin: Coin) = money % inCoin.value

//Find the least number of coins that can make a sum of money (also specified in pennies)

fun exchangeForLeastCoin(money: Int) = enumValues<Coin>().fold(emptyMap<Coin, Int>() to money) { acc, coin ->
    val (bagOfCoins, stillRemains) = acc //an example of "destructuring" a `Pair`
    val countOfCoins = mostChangeFor(stillRemains, coin)
    val leavesBehind = stillRemains - (countOfCoins * coin.value)
    bagOfCoins.plus(coin to countOfCoins) to leavesBehind
}