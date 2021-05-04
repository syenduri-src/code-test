package com.code.test.string;

public class StringOperations {

    public String swapLastTwoCharacters(String str) {

        int length = str.length();

        if(length < 2) return str;

        char lastChar = str.charAt(length - 1);

        char secondLastChar = str.charAt(length - 2);

        String restOfTheString = str.substring(0, length - 2);

        return restOfTheString + lastChar + secondLastChar;

    }

    public String truncateAInFirst2Positions(String str) {

        if(str.length()<2)
            return str.replaceAll("A", "");

        String first2Characters = str.substring(0, 2);

        String first2CharactersUpdated = first2Characters.replaceAll("A", "");

        String restOfTheString = str.substring(2);

        return first2CharactersUpdated + restOfTheString;
    }

    public static void main(String[] args){
        StringOperations object = new StringOperations();
        System.out.println("swapLastTwoCharacters::" + object.swapLastTwoCharacters("SRIKS") );
        System.out.println("truncateAInFirst2Positions::" + object.truncateAInFirst2Positions("SAARIKS") );

    }

}
