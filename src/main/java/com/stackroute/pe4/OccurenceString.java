import java.io.*;

public class OccurenceString {


        public int countOccurences(String str)
        {
            // split the string by spaces in a
            String s[] = str.split(" ");
            int charcount = str.length() - str.replaceAll("a", "").length();
            return charcount;
        }


    }
