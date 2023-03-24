package com.example.test2try2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    EditText edittext1;
    EditText editText2;
    Button btnSendNum;
    board board1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1.findViewById(R.id.ETnumInput1);
        editText2.findViewById(R.id.ETnumInput2);
        btnSendNum.findViewById(R.id.btnSend);


        btnSendNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numofsquares1;
                String numofsquares2;
                numofsquares1 = edittext1.getText().toString();
                numofsquares2 = editText2.getText().toString();

                board1.rows = numofsquares;
                openGame();
            }
        });
    }

    board chessBoard = new board(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER;
        chessBoard.setLayoutParams(layoutParams);

        LinearLayout mainLayout  = findViewById(R.id.main_layout);
        mainLayout.addView(chessBoard);
    }
}