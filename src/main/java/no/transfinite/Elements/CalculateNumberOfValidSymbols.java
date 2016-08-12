package no.transfinite.Elements;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ronnyma on 10/08/16.
 * This works by generating all possible symbols
 * adhering to the rule set. Duplicates are eliminated by
 * inserting the symbol as a key in a hash in O(1).
 */
public class CalculateNumberOfValidSymbols
{

    public int numberOfSymbols(String elementName)
    {
        //We'll use a hash as a comparison utility
        Map<String, Integer> cache = new HashMap<String, Integer>();
        char[] s = new char[2];

        //Loop through the string, juxtapose characters in positions n and m
        //having indices n < m, advancing m through elementName for every advance of n
        for(int i = 0; i < elementName.length()-1; i++)
        {
            s[0] = elementName.toLowerCase().charAt(i);

            for(int j = i+1; j < elementName.length(); j++)
            {
                s[1] = elementName.toLowerCase().charAt(j);
                cache.put(new String(s),0);
            }
        }

        return cache.size();
    }
}
