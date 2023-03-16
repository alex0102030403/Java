package isp.lab2.Exercise6WordGuess;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise6WordGuess {

    static int wordLenght;




    /**
     * This method will return the number of occurrences of a character in a word
     * @param
     * @param
     * @return
     */

    public static String randomString(String[] arr)
    {
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static String replaceHiddenLetters(char newLetter)
    {
        return "Hello";
    }

    /*Functia ce se apeleaza pt teste*/
    public static int countOccurence(char c, char[] word) {

        int res = 0;
        for(char ch : word)
        {
            if(ch == c)
                res++;
        }
        return res;
    }

    public static void printWord(char[] word) {
        for(int i = 0;i<word.length;++i)
            System.out.print(word[i]);
        System.out.println();
    }

    public static char[] checkLetter(char let,char[] shWord ,char[] hidWord){
        char[] res = new char[shWord.length];

        for(int i = 0;i<shWord.length;++i){
            res[i] = '*';
        }

        for(int i = 0;i<shWord.length;++i){
            if(hidWord[i]!='*'){
                res[i] = hidWord[i];
            }
        }



        for(int i = 0;i<shWord.length;++i){
            if(let == shWord[i]){
                res[i] = let;
                wordLenght--;
            }
        }



        return res;
    }


    public static void main(String[] args) throws IOException {
        String[] Dict = {"book","car","restaurant","shelf","keyboard"};
        String wordOfTheDay = randomString(Dict);
        //System.out.println(wordOfTheDay);
        wordLenght = wordOfTheDay.length();

        char[] hiddenWord = new char[wordLenght];
        char[] shownWord = new char[wordLenght];


        for(int i = 0;i<wordOfTheDay.length();++i)
        {

            hiddenWord[i] = '*';
            shownWord[i] = wordOfTheDay.charAt(i);
            //System.out.print(shownWord[i]);
        }

        while(wordLenght!=0)
        {


            System.out.println("Enter a letter: ");
            char guess = (char) System.in.read();

            hiddenWord = checkLetter(guess , shownWord,hiddenWord);

            printWord(hiddenWord);


        }
    }

}
