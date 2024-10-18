package org.example

fun gps(s:Int, x:DoubleArray):Int
        = if (x.size > 1)
    x
        .toList()
        .zipWithNext() { i1, i2 -> (3600 * (i2 - i1)) / s }
        .max()
        .toInt()
else 0