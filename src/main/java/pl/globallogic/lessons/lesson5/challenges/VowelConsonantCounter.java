package pl.globallogic.lessons.lesson5.challenges;

import java.util.Locale;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String word = "Arrays";
        int [] result = numberOfVowelAndConsonants(word);
        System.out.println(String.format("Number of vowels is %s and consonants is %s in '%s'",
                result[0],result[1],word));

    }

    private static int[] numberOfVowelAndConsonants(String word){
        int vowelsCount = 0;
        String vowels = "aiouey";
        String lowerCased = word.toLowerCase();
        int wordsLength = word.length();
        for(int i=0;i<wordsLength;i++){
            if(vowels.contains(String.valueOf(word.toLowerCase().charAt((i))))){
                vowelsCount++;
            }
        }
        return new int[]{vowelsCount, wordsLength-vowelsCount};
    }
}
