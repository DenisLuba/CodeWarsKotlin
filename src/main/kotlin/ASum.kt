package org.example

object ASum {
    fun findNb(m: Long): Long {
        var s = 0L
        var i = 0L

        while (s < m) {
            s += (i * i * i)
            i++
        }
        return if (s == m) --i else -1
    }
}