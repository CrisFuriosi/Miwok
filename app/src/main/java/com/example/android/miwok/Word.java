package com.example.android.miwok;

/*
{@link Word} represents a vocabulary word. Contains default and Miwok translations for the word.
 */
public class Word {

    // State: Variable declaration
    private String mDefaultText;
    private String mMiwokText;

    // Constructor: assign String 1 (Default language) and String 2 (Miwok)
    public Word(String defaultText, String miwokText) {
        mDefaultText = defaultText;
        mMiwokText = miwokText;
    }

    // Method: Output String  1 (Default)
    public String getDefaultTranslation() {
        return mDefaultText;
    }

    // Method: Output String 2 (Miwok)
    public String getMiwokTranslation() {
        return mMiwokText;
    }
}
