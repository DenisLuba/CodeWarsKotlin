import org.example.PascalDiagonal
import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class PascalDiagonalTest {
    @Test
    fun tests() {
        assertEquals(BigInteger.valueOf(5985), PascalDiagonal.diagonal(20, 3))
        assertEquals(BigInteger.valueOf(20349), PascalDiagonal.diagonal(20, 4))
        assertEquals(BigInteger.valueOf(54264), PascalDiagonal.diagonal(20, 5))
    }

}