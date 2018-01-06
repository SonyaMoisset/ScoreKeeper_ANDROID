package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScoreTeamA = 0;
    private int mScoreTeamB = 0;
    private final static int mFreeThrow = 1;
    private final static int mTwoPoints = 2;
    private final static int mThreePoints = 3;

    TextView mScoreTeamATextView;
    TextView mScoreTeamBTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreTeamATextView = findViewById(R.id.team_a_score);
        mScoreTeamBTextView = findViewById(R.id.team_b_score);
    }

    public void addOneToTeamA(View view) {
        mScoreTeamA = mScoreTeamA + mFreeThrow;
        updateTeamAScore(mScoreTeamA);
    }

    public void addOneToTeamB(View view) {
        mScoreTeamB = mScoreTeamB + mFreeThrow;
        updateTeamBScore(mScoreTeamB);
    }

    public void addTwoToTeamA(View view) {
        mScoreTeamA = mScoreTeamA + mTwoPoints;
        updateTeamAScore(mScoreTeamA);
    }

    public void addTwoToTeamB(View view) {
        mScoreTeamB = mScoreTeamB + mTwoPoints;
        updateTeamBScore(mScoreTeamB);
    }

    public void addThreeToTeamA(View view) {
        mScoreTeamA = mScoreTeamA + mThreePoints;
        updateTeamAScore(mScoreTeamA);
    }

    public void addThreeToTeamB(View view) {
        mScoreTeamB = mScoreTeamB + mThreePoints;
        updateTeamBScore(mScoreTeamB);
    }

    public void updateTeamAScore(int score) {
        mScoreTeamATextView.setText(String.valueOf(score));
    }

    public void updateTeamBScore(int score) {
        mScoreTeamBTextView.setText(String.valueOf(score));
    }

    public void resetScores(View view) {
        mScoreTeamA = 0;
        mScoreTeamB = 0;
        mScoreTeamATextView.setText(String.valueOf(mScoreTeamA));
        mScoreTeamBTextView.setText(String.valueOf(mScoreTeamB));
    }
}
