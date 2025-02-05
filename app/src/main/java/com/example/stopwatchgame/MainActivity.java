package com.example.stopwatchgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ゲーム開始ボタンを押した時にGameActivityに遷移
    public void startGame(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}