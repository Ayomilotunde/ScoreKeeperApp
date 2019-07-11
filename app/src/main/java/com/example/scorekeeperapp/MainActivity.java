package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    int increaseNumber = 0;
    int increaseNumber2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Reset(View view) {
        increaseNumber = 0;
        increaseNumber2 = 0;
        displayForIncreasedPoints(increaseNumber);
        displayForIncreasedPoint(increaseNumber2);
    }


    public void IncreasePoints(View view) {
        increaseNumber = increaseNumber + 1;

        displayForIncreasedPoint(increaseNumber);
    }

    public void IncreasePoints2(View view) {
        increaseNumber = increaseNumber + 2;
        displayForIncreasedPoint(increaseNumber);
    }

    public void IncreasePoints3(View view) {
        increaseNumber = increaseNumber + 3;
        displayForIncreasedPoint(increaseNumber);
    }

    private void displayForIncreasedPoint(int score) {
        TextView scoreView = findViewById(R.id.txt0);
        scoreView.setText("" + score);

    }

    public void IncreasePoint4(View view) {
        increaseNumber2 = increaseNumber2 + 1;
        displayForIncreasedPoints(increaseNumber2);
    }

    public void IncreasePoint5(View view) {
        increaseNumber2 = increaseNumber2 + 2;
        displayForIncreasedPoints(increaseNumber2);
    }

    public void IncreasePoint6(View view) {
        increaseNumber2 = increaseNumber2 + 3;
        displayForIncreasedPoints(increaseNumber2);
    }


    private void displayForIncreasedPoints(int score1) {
        TextView scoreView = findViewById(R.id.txt00);
        scoreView.setText("" + score1);

    }
}
