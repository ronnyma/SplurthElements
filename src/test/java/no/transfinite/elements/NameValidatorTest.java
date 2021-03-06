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
public class NameValidatorTest {



    public NameValidatorTest(String name, String symbol, boolean expectedResult)
    {
        this.name = name;
        this.symbol = symbol;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        na = new NameValidator();
    }

    /**
     * All tests from the website, not limited to. */
    @Parameterized.Parameters
    public static Collection Elements() {
        return Arrays.asList(new Object[][] {
                { "Spenglerium", "Ee", true },
                { "Zeddemorium", "Zr", true },
                { "Venkmine", "Kn", true },
                { "Venkmine", "Nv", false },
                { "Stantzon", "Zt", false },
                { "Melintzum", "Nn", false },
                { "Tullium", "Uu", true },
                { "Tullium", "Kk", false },
                { "Tullium", "Ki", false },
                { "Tullium", "Kif", false },
                { "Zeddemorium", "Di", true },
                { "Xenon", "Nn", true },
                { "Xenon", "Xx", false },
                { "Xenon", "Ox", false },
                { "Xenon", "O", false },
                { "Helium", "He", true },
                { "Helium", "Me", false },

        });
    }

    @org.junit.Test
    public void isValid() {
        assertEquals(expectedResult, na.isValid(name, symbol));
    }

    private NameValidator na;

    private String name;
    private String symbol;
    private Boolean expectedResult;
}