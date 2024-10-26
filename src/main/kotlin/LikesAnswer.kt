package org.example

object LikesAnswer {
    fun likes(names: Array<String>): String
            = when(names.size){
        0 -> "no one likes this"
        1 -> "${names[0]} likes this"
        2, 3 -> "${names.dropLast(1).joinToString(", ")} and ${names.last()} like this"
        else -> "${names.take(2).joinToString(", ")} and ${names.size - 2} others like this"
    }
}