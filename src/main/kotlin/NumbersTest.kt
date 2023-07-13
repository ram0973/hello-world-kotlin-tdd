import org.junit.Test
import org.junit.Assert.assertEquals
internal class NumbersTest {

    /**
     * @author ram0973 on 13.07.2023
     */

    @Test
    fun testSum() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.sum()
        val expected = 16
        assertEquals(expected, actual)
    }

    @Test
    fun testDifference() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.difference()
        val expected = 8
        assertEquals(expected, actual)
    }

}