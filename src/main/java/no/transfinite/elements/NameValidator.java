package no.transfinite.elements;

/**
 * Created by ronnyma on 09/08/16.
 * This works by splitting the name with the first letter of the symbol
 * as delimiter into two string segments. Then it checks for the second
 * letter of the symbol in the last segment. If it exists, it is guaranteed
 * that the symbol is valid for the name.
 */
public class NameValidator
{
    public boolean isValid(String name, String symbol)
    {
        //If the length of the symbol is not two, report as false
        if (symbol.length() != 2) return false;

        // Tokenize the name with the first letter of the symbol, max two tokens, not case sensitive
        String[] token = name.split("(?i)" + symbol.substring(0, 1), 2);

        //Return true iff the second letter of the symbol is contained in the second token
        return token.length != 2 ? false:token[1].contains(symbol.substring(1, 2));
    }
}
