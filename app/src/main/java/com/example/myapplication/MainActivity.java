package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionPlus(View view) {
        int firstNum = getFirstValue();
        int secondNum = getSecondValue();
        goToActivity2(firstNum+secondNum);
    }

    public void clickFunctionMinus(View view) {
        int firstNum = getFirstValue();
        int secondNum = getSecondValue();
        goToActivity2(firstNum-secondNum);
    }

    public void clickFunctionTimes(View view) {
        int firstNum = getFirstValue();
        int secondNum = getSecondValue();
        goToActivity2(firstNum*secondNum);
    }

    public void clickFunctionDivide(View view) {
        int firstNum = getFirstValue();
        int secondNum = getSecondValue();
        goToActivity2(firstNum/secondNum);
    }

    public int getFirstValue() {
        EditText first = (EditText) findViewById(R.id.editTextTextPersonName);
        String str = first.getText().toString();
        int firstNum = Integer.valueOf(str);
        return firstNum;
    }

    public int getSecondValue() {
        EditText second = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str = second.getText().toString();
        int secondNum = Integer.valueOf(str);
        return secondNum;
    }

    public void goToActivity2(int answer) {
        String show = Integer.toString(answer);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("answer", show);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}