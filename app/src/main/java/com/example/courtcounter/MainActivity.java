package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Keeps track of score of both the teams
     */
    private int scoreForTeamA = 0, scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * displays the score of team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_A);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increases the score of team A by 1.
     */
    public void addOneForTeamA(View view) {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * increases the score of team A by 2.
     */
    public void addTwoForTeamA(View view) {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * increases the score of team A by 3.
     */
    public void addThreeForTeamA(View view) {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * displays the score of team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_B);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increases the score of team B by 1.
     */
    public void addOneForTeamB(View view) {
        scoreForTeamB += 1;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * increases the score of team B by 2.
     */
    public void addTwoForTeamB(View view) {
        scoreForTeamB += 2;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * increases the score of team B by 3.
     */
    public void addThreeForTeamB(View view) {
        scoreForTeamB += 3;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * resets the scores of both the teams back to 0.
     */
    public void resetScore(View view) {
        scoreForTeamA = scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

}