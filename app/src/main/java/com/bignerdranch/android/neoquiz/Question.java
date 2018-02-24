package com.bignerdranch.android.neoquiz;

/**
 * Created by Matt on 2/6/2018.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mHasCheated;

    public Question(int textResId, boolean answerTrue, boolean hasCheated) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mHasCheated = hasCheated;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean getHasCheated() { return mHasCheated;}

    public void setHasCheated(boolean didCheat) {mHasCheated = didCheat;}
    //test

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
