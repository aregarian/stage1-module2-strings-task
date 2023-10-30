package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class MethodParser {
    String accessModifier = null;
    String returnType = null;
    String methodName = null;
    ArrayList<String > argument = new ArrayList();




    /**
     * Parses string that represents a method signature and stores all it's members into a {@link MethodSignature} object.
     * signatureString is a java-like method signature with following parts:
     *      1. access modifier - optional, followed by space: ' '
     *      2. return type - followed by space: ' '
     *      3. method name
     *      4. arguments - surrounded with braces: '()' and separated by commas: ','
     * Each argument consists of argument type and argument name, separated by space: ' '.
     * Examples:
     *      accessModifier returnType methodName(argumentType1 argumentName1, argumentType2 argumentName2)
     *      private void log(String value)
     *      Vector3 distort(int x, int y, int z, float magnitude)
     *      public DateTime getCurrentDateTime()
     *
     * @param signatureString source string to parse
     * @return {@link MethodSignature} object filled with parsed values from source string
     */
    public MethodSignature parseFunction(String signatureString)  {
        try {

        }catch (java.lang.UnsupportedOperationException e) {

        }


        StringTokenizer data = new StringTokenizer(signatureString, "(,) ");


        accessModifier = null;
        returnType = null;
        methodName = null;
        argument.clear();

        boolean parsingArguments = false;

        while (data.hasMoreTokens()) {
            String token = data.nextToken();

            if (token.equals("public") || token.equals("private")) {
                accessModifier = token;
            } else if (returnType == null) {
                returnType = token;
            } else if (methodName == null) {

                    methodName = token;
            }

             else  {

                argument.add(token);
            }
        }



        // Create a MethodSignature object and return it
        List<MethodSignature.Argument> argumentList = new ArrayList<>();
        for (int i = 0; i < argument.size(); i += 2) {
            argumentList.add(new MethodSignature.Argument(argument.get(i), argument.get(i + 1)));
        }

        MethodSignature methodSignature = new MethodSignature(methodName, argumentList);
        methodSignature.setAccessModifier(accessModifier);
        methodSignature.setReturnType(returnType);

        return methodSignature;
    }
}
