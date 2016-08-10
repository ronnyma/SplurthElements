package no.transfinite.Elements;

import java.util.HashMap;

import static org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient;

/**
 * Created by ronnyma on 10/08/16.
 */
public class CalculateNumberOfValidSymbols
{

    public long numberOfSymbols(String elementName)
    {
        int length = elementName.length();
        HashMap<String, Integer> cache = new HashMap<String, Integer>();

        for(String name: elementName.split(""))
        {
            if(cache.containsKey(name))
                cache.put(name,1);
            else
                cache.put(name,0);
        }

        int sum = 0;
        for (int f : cache.values()) {
            sum += f;
        }


        return binomialCoefficient(cache.size(), 2) + sum;
    }
}
