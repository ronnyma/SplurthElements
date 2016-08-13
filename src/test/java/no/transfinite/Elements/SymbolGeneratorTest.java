package no.transfinite.Elements;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
/**
 * Created by ronnyma on 09/08/16.
 */

@RunWith(Parameterized.class)
public class SymbolGeneratorTest {

    @Before
    public void initialize() {
        sg = new SymbolGenerator();
    }


    public SymbolGeneratorTest(String name, String symbol)
    {
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * All tests from the website, not limited to. */
    @Parameterized.Parameters
    public static Collection elements() {
        return Arrays.asList(new Object[][] {
                { "Gozerium", "Ei" },
                { "Slimyrine", "Ie" },
                { "Titanium", "Ai" },
                { "Titanium", "Tm" },
        });
    }

    @org.junit.Test
    public void symbolIsValid() throws Exception {
        assertEquals(symbol, sg.generateSymbol(name));
    }

    private SymbolGenerator sg;

    private String name;
    private String symbol;
}