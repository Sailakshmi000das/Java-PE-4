package com.stackroute.pe3;

import java.util.Arrays;

class SortingWords {

    public String[] sortString(String str) {

        int count = 0;                                                    // Counts number of words
        boolean isWord = false;                 // Indicates start of a word found

        String[] s=str.split(" ");
        // Create the array of strings to contain all the words:
        String[] words = new String[s.length];

        // Now extract the words from the text
        int start = 0;                                                     // Position of first letter of a word
        int wordIndex = 0;                                                 // Current vacant words array element
        isWord = false;                                                    // Indicates when a word start is found
        for (int i = 0 ; i < str.length() ; ++i) {
            if(!isWord) {                                                    // If we are not in a word...
                if(Character.isLetter(str.charAt(i))) {                       // look for first letter of a word.
                    start = i;                                                   // Record word start index
                    isWord = true;                                               // We have a word
                }
            }
            else {                                                           // We are in a word
                if(Character.isLetter(str.charAt(i)) || str.charAt(i) == '\'')
                    continue;                                                    // Still the same word so continue
                else {                                                         // It is the end of the word
                    isWord = false;                                              // so reset word indicator
                    words[wordIndex++] = str.substring(start,i);                // and extract the word
                }
            }
        }
        // If the text ends with a letter, we will not have stored the last word
        if(wordIndex < words.length)
            words[wordIndex] = str.substring(start);

        // Sort the array of words
        String temp = null;                                                // Stores a word reference
        boolean exchange = true;                                           // Indicate we exchanged a pair of words
        while(exchange) {
            exchange = false;                                                // No exchange so far
            for(int i = 1 ; i < words.length ; ++i) {                        // For each word starting with the second
                if(words[i-1].compareTo(words[i]) > 0) {                       // If the previous word is greater
                    temp = words[i];                                             // exchange them
                    words[i] = words[i-1];
                    words[i-1] = temp;
                    exchange = true;                                             // and record that exchange occurred
                }
            }
        }

        // Display the sorted array of words:
        return words;
        }
    }
