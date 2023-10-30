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
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) throws UnsupportedOperationException {
        String str = new String(delimiters.toString());
        StringTokenizer token = new StringTokenizer(source, str);
        ArrayList<String> hehe = new ArrayList<String>();

        try {
            while (token.hasMoreTokens()) {
                hehe.add(token.nextToken());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }




        return hehe;


    }
}
