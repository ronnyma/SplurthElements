package no.transfinite.Elements;

/**
 * Created by ronnyma on 10/08/16.
 * This works by iterating through the element name.
 * First it finds the letter with smallest value withing
 * the words excluding the last letter. Then, it searches
 * for the smallest again, limited to the letters with indices
 * greater than the first letter it found.
 */
public class SymbolGenerator
{
    public String generateSymbol(String elementName)
    {

        char[] s = new char[2];
        s[0] = elementName.toLowerCase().charAt(0);
        s[1] = elementName.toLowerCase().charAt(elementName.length()-1);
        int idx = 0;

        //Find the lowest ascii value from 0 to l-1.
        for(int i = 1; i < elementName.length()-1; i++)
        {
            if (elementName.toLowerCase().charAt(i) < s[0])
            {
                s[0] = elementName.charAt(i);
                idx = i;
            }
        }
        //Find the lowest ascii value from index of the
        //first letter + 1 to l, inclusive (i.e. in the
        //string segment after the first letter
        for(int i = idx+1; i < elementName.length(); i++)
        {
            if (elementName.toLowerCase().charAt(i) < s[1])
            {
                s[1] = elementName.charAt(i);
            }
        }
        s[0] = Character.toUpperCase(s[0]);

        return new String(s);
    }
}
