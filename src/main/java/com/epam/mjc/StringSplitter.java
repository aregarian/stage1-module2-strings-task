package com.epam.mjc;

import java.util.*;

public class StringSplitter {

    StringJoiner deli = new StringJoiner("");
    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters)  {

        ArrayList<String> hehe = new ArrayList<String>();

        try {
            String str = new String(delimiters.toString());
            StringTokenizer token = new StringTokenizer(source, str);

            while (token.hasMoreTokens()) {
                hehe.add(token.nextToken());
            }

        } catch (java.lang.UnsupportedOperationException e) {
            e.printStackTrace();
        }




        return hehe;


    }
}
