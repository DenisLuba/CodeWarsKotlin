import org.example.ASum
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ASumTest {
    @Test
    fun tests() {
        assertEquals(-1, ASum.findNb(56396345062501))
        assertEquals(2225, ASum.findNb(6132680780625))
        assertEquals(-1, ASum.findNb(28080884739601))
    }
}