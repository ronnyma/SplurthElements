package no.transfinite.Elements;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
/**
 * Created by ronnyma on 09/08/16.
 */

@RunWith(Parameterized.class)
public class NameArbiterTest {

    @Before
    public void initialize() {
        na = new NameArbiter();
    }


    public NameArbiterTest(String name, String symbol, boolean expectedResult)
    {
        this.name = name;
        this.symbol = symbol;
        this.expectedResult = expectedResult;
    }

    /**
     * All tests from the website, not limited to. */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { "Spenglerium", "Ee", true },
                { "Zeddemorium", "Zr", true },
                { "Venkmine", "Kn", true },
                { "Stantzon", "Zt", false },
                { "Melintzum", "Nn", false },
                { "Tullium", "Uu", true },
                { "Tullium", "Kk", false },
                { "Tullium", "Ki", false },
                { "Tullium", "Kif", false },
                { "Zeddemorium", "Di", true },
                { "Xenon", "Nn", true },
                { "Xenon", "Xx", false },
        });
    }

    @org.junit.Test
    public void isValid() throws Exception {
        assertEquals(expectedResult, na.isValid(name, symbol));
    }

    private NameArbiter na;

    private String name;
    private String symbol;
    private Boolean expectedResult;
}