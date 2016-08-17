package no.transfinite.elements;

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



    public SymbolGeneratorTest(String name, String symbol)
    {
        this.name = name;
        this.symbol = symbol;
    }

    @Before
    public void initialize() {
        sg = new SymbolGenerator();
    }


    /**
     * All tests from the website, not limited to. */
    @Parameterized.Parameters
    public static Collection elements() {
        return Arrays.asList(new Object[][] {
                { "Gozerium", "Ei" },
                { "Slimyrine", "Ie" },
                { "Titanium", "Ai" },
                { "Uranium", "Ai" },
                { "Plutonium", "Im" },
                { "Aurum", "Am" },
                { "Aluminium", "Ai"},
                { "Boronium", "Bi"}
        });
    }

    @org.junit.Test
    public void symbolIsValid() {
        assertEquals(symbol, sg.generateSymbol(name));
    }

    private SymbolGenerator sg;

    private String name;
    private String symbol;
}