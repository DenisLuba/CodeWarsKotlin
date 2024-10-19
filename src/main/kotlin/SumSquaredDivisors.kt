package org.example

import kotlin.math.*

object SumSquaredDivisors {
    fun listSquared(start: Long, end:Long): String {
        val line = StringBuilder("[");

        for (number in start..end){
            var sumDivisorsSquares = 0L

            for (divisor in 1..number)
                if (number % divisor == 0L) sumDivisorsSquares += divisor * divisor

            if (fastSqrt(sumDivisorsSquares) % 1 == .0)
                line.append("[$number, $sumDivisorsSquares], ")
        }

        return line.removeSuffix(", ").toString() + "]"
    }

    private fun fastSqrt(x: Long): Double {
        if (x < 2) return x.toDouble()

        var y = x.toDouble()
        var z = (y + (x / y)) / 2

        while (abs(y - z) >= 0.00001) {
            y = z;
            z = (y + (x / y)) / 2
        }
        return z
    }

    /*
    not fast enough

    fun listSquared(start: Long, end: Long): String
        = (start..end)
        .map { x ->
            x to (1..x)
                .filter { x % it == 0L }
                .sumOf { it * it }
        }
        .filter { sqrt(it.second.toDouble()) % 1 == .0 }
        .joinToString(", ", "[", "]") { "[${it.first}, ${it.second}]" }
     */
}