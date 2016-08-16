package no.transfinite.Elements;

import no.transfinite.elements.CalculateNumberOfValidSymbols;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by ronnyma on 10/08/16.
 */
@RunWith(Parameterized.class)
public class CalculateNumberOfValidSymbolsTest
{
    @Before
    public void initialize()
    {
        cs = new CalculateNumberOfValidSymbols();
    }


    public CalculateNumberOfValidSymbolsTest(String name, int validSymbols)
    {
        this.name = name;
        this.symbol = validSymbols;
    }

    /**
     * All tests from the website, not limited to.
     */
    @Parameterized.Parameters
    public static Collection elements() {
        return Arrays.asList(new Object[][]{
                {"Zuulon", 11},
                {"Argon", 10},
                {"Xenon", 8},
                {"Xenno", 7},
                {"Xenonon", 9},
                {"Xenonooooooooooooooooooooon", 9},
                {"Xenonooooooooooooooooooooonnnnnnnononononon", 9},
                {"Abcdek", 15},
        });
    }

    @org.junit.Test
    public void symbolIsValid() {
        assertEquals(symbol, cs.numberOfSymbols(name));
    }

    private CalculateNumberOfValidSymbols cs;

    private String name;
    private int symbol;
}
