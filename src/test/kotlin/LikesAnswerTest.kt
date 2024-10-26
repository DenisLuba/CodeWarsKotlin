import org.example.LikesAnswer
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LikesAnswerTest {
    @Test
    fun tests(){
        assertEquals("no one likes this", LikesAnswer.likes(arrayOf()))
        assertEquals("Peter likes this", LikesAnswer.likes(arrayOf("Peter")))
        assertEquals("Jacob and Alex like this", LikesAnswer.likes(arrayOf("Jacob", "Alex")))
        assertEquals("Max, John and Mark like this", LikesAnswer.likes(arrayOf("Max", "John", "Mark")))
        assertEquals("Alex, Jacob and 2 others like this", LikesAnswer.likes(arrayOf("Alex", "Jacob", "Mark", "Max")))
    }
}