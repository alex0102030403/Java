package isp.lab2.Exercise4StringSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {

        String[] res = input.split("[,]", 0);
        ArrayList<String> ar = new ArrayList<String>();

        for(String myStr: res) {
            if(myStr.contains(substring)==true)
            {
                ar.add(myStr);

                /*System.out.println(myStr);
                System.out.println("RES");*/
            }


        }
        String[] resF = new String[ar.size()];
        int i = 0;
        for(String myStr :ar)
        {
            resF[i++]=myStr;
        }

        return resF;
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {

            System.out.println(string);
            //System.out.println("here");
        }
    }
}
