package no.transfinite.Elements;

/**
 * Created by ronnyma on 09/08/16.
 */
class NameArbiter
{
    public boolean isValid(String name, String symbol)
    {
        //If the length of the symbol is not two, report as invalid
        if (symbol.length() != 2)
            return false;

        // Tokenize the name with the first letter of the symbol

        String[] token = name.split("(?i)" + symbol.substring(0, 1), 2);
        if(token.length != 2)
            return false;

        //Return true iff the second letter of the symbol is contained in the second token
        return token[1].contains(symbol.substring(1, 2));

    }
}
