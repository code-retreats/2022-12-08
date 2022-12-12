import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MainKtTest {

    @Test
    fun trivialTest() {
        assertEquals(3, 1 + 2)
    }

    @Test
    fun `read lines from file`() {
        assertEquals(
            listOf("Argentina", "Croatia", "France", "Morocco"),
            readLinesFromFile("src/test/resources/test-input.txt")
        )
    }

}
