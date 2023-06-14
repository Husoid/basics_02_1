fun main() {
    var amount = 10000
    var commission = if (amount * 75 / 10000 > 35) {
        amount * 75 / 10000
    } else { 35 }

    println("коммиссия составит $commission")
}