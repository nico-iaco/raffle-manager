package it.iacovelli

import it.iacovelli.extractor.NumberExtractor
import it.iacovelli.generator.RuffleFolderGenerator
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    private lateinit var numberExtractor: NumberExtractor

    private lateinit var folderGenerator: RuffleFolderGenerator

    @Before
    fun init() {
        numberExtractor = NumberExtractor(1, 90);
        folderGenerator = RuffleFolderGenerator(1, 90)
    }

    @Test
    fun extractNumber() {
        val number = numberExtractor.getNumber()
        print(number)
        assert(number >= 1)
        assert(number <= 90)
    }

    @Test
    fun generateFolder() {
        val ruffleFolder = folderGenerator.generateRuffleFolder(17)
        print(ruffleFolder)
    }

}
