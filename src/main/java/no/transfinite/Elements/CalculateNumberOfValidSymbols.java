package no.transfinite.Elements;

import java.util.HashMap;

/**
 * Created by ronnyma on 10/08/16.
 */
public class CalculateNumberOfValidSymbols
{

    public int numberOfSymbols(String elementName)
    {
        //We'll use a hash as a comparison utility
        HashMap<String, Integer> cache = new HashMap<String, Integer>();
        char[] s = new char[2];

        //Loop through the string, juxtapose character n with m
        //having n > m, advancing m first
        for(int i = 0; i < elementName.length(); i++)
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
