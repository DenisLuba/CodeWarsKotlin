import org.example.SumSquaredDivisors
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SumSquaredDivisorsTest {
    @Test
    fun test() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250))
        assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250))
        assertEquals("[[1, 1]]", SumSquaredDivisors.listSquared(1, 1))
    }
}