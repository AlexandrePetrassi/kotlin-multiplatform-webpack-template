import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun simpleTest() {
        assertEquals(listOf(1,2,3).reversed(), listOf(3,2,1))
    }
}
