package no.transfinite.Elements;

/**
 * Created by ronnyma on 10/08/16.
 */
class SymbolGenerator
{
    String generateSymbol(String elementName)
    {
        //Find the lowest ascii value from idx 0 to l-1
        char[] s = new char[2];
        s[0] = elementName.toLowerCase().charAt(0);
        s[1] = elementName.toLowerCase().charAt(elementName.length()-1);
        int idx = 0;

        for(int i = 1;i < elementName.length()-1; i++)
        {
            if (elementName.toLowerCase().charAt(i) < s[0])
            {
                s[0] = elementName.charAt(i);
                idx = ++i;
            }
        }

        for(int i = idx;i < elementName.length(); i++)
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
