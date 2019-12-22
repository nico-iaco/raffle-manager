package it.iacovelli

import it.iacovelli.extractor.NumberExtractor
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    private lateinit var numberExtractor: NumberExtractor;

    @Before
    fun init() {
        numberExtractor = NumberExtractor(1, 90);
    }

    @Test
    fun extractNumber() {
        val number = numberExtractor.getNumber()
        print(number)
        assert(number >= 1)
        assert(number <= 90)
    }

}
