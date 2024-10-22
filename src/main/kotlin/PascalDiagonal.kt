package org.example

import java.math.BigInteger

object PascalDiagonal {
    fun diagonal(row: Int, diagonal: Int) : BigInteger = binominal(row + 1, diagonal + 1)

    private fun binominal(row: Int, diagonal: Int) : BigInteger {
        var koef: BigInteger = BigInteger.valueOf(1)
        var pos = diagonal
        if (row - pos > pos) pos = row - pos
        for (i in (pos + 1)..row)
            koef = koef.multiply(BigInteger.valueOf(i.toLong()))
        for (i in 1 .. (row - pos))
            koef = koef.divide(BigInteger.valueOf(i.toLong()))
        return koef
    }
}