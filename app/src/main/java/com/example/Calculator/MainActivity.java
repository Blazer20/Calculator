package com.example.Calculator;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    private EditText field;
    private Button zero, one, two, three, four, five, six, seven, eight, nine, addition,
            subtruction, division, multiplication, equal, dot, all_clear, percent, sign_changer;
    private TransitionDrawable transition;
    private double first_input = 0, second_input = 0, temp = 0, result = 0;;
    private boolean Addition, Subtruction, Division, Multiplication, Percent, flag1, Error;
    private int flag2 = 0, flag3 = 0, call = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        field = (EditText) findViewById(R.id.Field);

        zero = (Button) findViewById(R.id.Zero);
        one = (Button) findViewById(R.id.One);
        two = (Button) findViewById(R.id.Two);
        three = (Button) findViewById(R.id.Three);
        four = (Button) findViewById(R.id.Four);
        five = (Button) findViewById(R.id.Five);
        six = (Button) findViewById(R.id.Six);
        seven = (Button) findViewById(R.id.Seven);
        eight = (Button) findViewById(R.id.Eight);
        nine = (Button) findViewById(R.id.Nine);

        addition = (Button) findViewById(R.id.Addtion);
        subtruction = (Button) findViewById(R.id.Subtruction);
        division = (Button) findViewById(R.id.Division);
        multiplication = (Button) findViewById(R.id.Multiplication);
        equal = (Button) findViewById(R.id.Equal);
        dot = (Button) findViewById(R.id.Dot);
        all_clear = (Button) findViewById(R.id.AllClear);
        percent = (Button) findViewById(R.id.Percent);
        sign_changer = (Button) findViewById(R.id.SignChanger);

        field.setOnClickListener(this);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

        addition.setOnClickListener(this);
        subtruction.setOnClickListener(this);
        division.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        equal.setOnClickListener(this);
        dot.setOnClickListener(this);
        all_clear.setOnClickListener(this);
        percent.setOnClickListener(this);
        sign_changer.setOnClickListener(this);

        zero.setOnTouchListener(this);
        one.setOnTouchListener(this);
        two.setOnTouchListener(this);
        three.setOnTouchListener(this);
        four.setOnTouchListener(this);
        five.setOnTouchListener(this);
        six.setOnTouchListener(this);
        seven.setOnTouchListener(this);
        eight.setOnTouchListener(this);
        nine.setOnTouchListener(this);

        equal.setOnTouchListener(this);
        dot.setOnTouchListener(this);
        all_clear.setOnTouchListener(this);
        percent.setOnTouchListener(this);
        sign_changer.setOnTouchListener(this);
    }

    private void outPut(double value) {
        if (value % 1 == 0)
            field.setText(String.format("%d", (long) value));
        else{
            field.setText(String.format("%s", value));
        }
    }

    private double parseField() {
        return Double.parseDouble(field.getText().toString().replaceAll(",", "."));
    }

    private void transitionCheck(){
        if(flag3 == 1){
            addition.setTextColor(getResources().getColor(R.color.white1));
            transition = (TransitionDrawable) addition.getBackground();
            transition.reverseTransition(500);
        }

        if(flag3 == 2){
            subtruction.setTextColor(getResources().getColor(R.color.white1));
            transition = (TransitionDrawable) subtruction.getBackground();
            transition.reverseTransition(500);
        }

        if(flag3 == 3){
            division.setTextColor(getResources().getColor(R.color.white1));
            transition = (TransitionDrawable) division.getBackground();
            transition.reverseTransition(500);
        }

        if(flag3 == 4){
            multiplication.setTextColor(getResources().getColor(R.color.white1));
            transition = (TransitionDrawable) multiplication.getBackground();
            transition.reverseTransition(500);
        }
    }

    private void clearAll(){
        Addition = false;
        Subtruction = false;
        Multiplication = false;
        Division = false;
        Percent = false;
        Error = false;
        first_input = 0;
        second_input = 0;
        result = 0;
        flag1 = false;
        flag2 = 0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Field:
                if (field.getText() != null && field.length() > 0)
                    field.setText(field.getText().delete(field.length() - 1, field.length()));
                break;
            case R.id.Zero:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "0"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "0"));
                break;
            case R.id.One:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "1"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "1"));
                break;
            case R.id.Two:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "2"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "2"));
                break;
            case R.id.Three:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "3"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "3"));
                break;
            case R.id.Four:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "4"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "4"));
                break;
            case R.id.Five:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "5"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "5"));
                break;
            case R.id.Six:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "6"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "6"));
                break;
            case R.id.Seven:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "7"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "7"));
                break;
            case R.id.Eight:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "8"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "8"));
                break;
            case R.id.Nine:
                if (flag2 == 0) {
                    field.setText(null);
                    field.setText(String.format(field.getText() + "9"));
                    flag2 = 1;
                } else
                    field.setText(String.format(field.getText() + "9"));
                break;
            case R.id.Addtion:
                if (field.getText().length() != 0) {
                    first_input = parseField();
                    Addition = true;
                    Subtruction = false;
                    Multiplication = false;
                    Division = false;
                    Percent = false;
                    transitionCheck();
                    addition.setTextColor(getResources().getColor(R.color.arithmetic_buttons));
                    transition = (TransitionDrawable) addition.getBackground();
                    transition.startTransition(500);
                    flag3 = 1;
                }
                flag2 = 0;
                break;
            case R.id.Subtruction:
                if (field.getText().length() != 0) {
                    first_input = parseField();
                    Subtruction = true;
                    Addition = false;
                    Multiplication = false;
                    Division = false;
                    Percent = false;
                    transitionCheck();
                    subtruction.setTextColor(getResources().getColor(R.color.arithmetic_buttons));
                    transition = (TransitionDrawable) subtruction.getBackground();
                    transition.startTransition(500);
                    flag3 = 2;
                }
                flag2 = 0;
                break;
            case R.id.Division:
                if(field.getText().length() != 0){
                    first_input = parseField();
                    result = first_input / 100;
                    Division = true;
                    Addition = false;
                    Subtruction = false;
                    Multiplication = false;
                    Percent = false;
                    transitionCheck();
                    division.setTextColor(getResources().getColor(R.color.arithmetic_buttons));
                    transition = (TransitionDrawable) division.getBackground();
                    transition.startTransition(500);
                    flag3 = 3;
                }
                flag2 = 0;
                break;
            case R.id.Multiplication:
                if(field.getText().length() != 0){
                    first_input = parseField();
                    Multiplication = true;
                    Addition = false;
                    Subtruction = false;
                    Division = false;
                    Percent = false;
                    transitionCheck();
                    multiplication.setTextColor(getResources().getColor(R.color.arithmetic_buttons));
                    transition = (TransitionDrawable) multiplication.getBackground();
                    transition.startTransition(500);
                    flag3 = 4;
                }
                flag2 = 0;
                break;
            case R.id.Percent:
                if(field.getText().length() != 0 && flag3 != 0){
                    second_input = parseField();
                    second_input /= 100;
                    if(flag3 == 1){
                        result = first_input + second_input;
                        outPut(result);
                        clearAll();
                    }else if(flag3 == 2){
                        result = first_input - second_input;
                        outPut(result);
                        clearAll();
                    }else if(flag3 == 3){
                        result = first_input / second_input;
                        outPut(result);
                        clearAll();
                    }else if(flag3 == 4){
                        result = first_input * second_input;
                        outPut(result);
                        clearAll();
                    }
                    call = 0;
                }else if(field.getText().length() != 0 && flag3 == 0 && call == 0){
                    first_input = parseField();
                    first_input /= 100;
                    outPut(first_input);
                    call = 1;
                    clearAll();
                }

                if(flag3 != 0){
                    transitionCheck();
                    flag3 = 0;
                }
                flag2 = 0;
                break;
            case R.id.Equal:
                if (Addition || Subtruction || Division || Multiplication){
                    if(field.getText().length() != 0){
                        second_input = parseField();
                        if(!flag1)
                            temp = second_input;
                    }
                }

                if (Addition) {
                    if(flag1)
                        result += temp;
                    else {
                        result = first_input + second_input;
                        flag1 = true;
                    }
                }

                if (Subtruction) {
                    if(flag1)
                        result -= temp;
                    else {
                        result = first_input - second_input;
                        flag1 = true;
                    }
                }

                if (Division) {
                    if(second_input != 0) {
                        if (flag1)
                            result /= temp;
                        else {
                            result = first_input / second_input;
                            flag1 = true;
                        }
                    }else
                        Error = true;
                }

                if (Multiplication) {
                    if(flag1)
                        result *= temp;
                    else {
                        result = first_input * second_input;
                        flag1 = true;
                    }
                }

                if(Error){
                    field.setText("Error!");
                    Toast.makeText(MainActivity.this, "Нельзя делить на 0", Toast.LENGTH_SHORT).show();
                }
                else
                    outPut(result);

                clearAll();
                transitionCheck();
                flag2 = 0;
                flag3 = 0;
                break;
            case R.id.Dot:
                if (field.getText().length() > 0)
                    field.setText(String.format(field.getText() + ","));
                else{
                    field.setText(String.format(field.getText() + "0" + ","));
                    flag2 = 1;
                }
                break;
            case R.id.AllClear:
                if(all_clear.getText() == "AC"){
                    clearAll();
                    call = 0;
                    transitionCheck();
                    flag3 = 0;
                    field.setText(null);
                }else {
                    second_input = 0;
                    field.setText(null);
                }
                    break;
            case R.id.SignChanger:
                if(field.getText().length() != 0) {
                    if (Addition || Subtruction || Division || Multiplication || Percent){
                        second_input = parseField();
                        second_input *= (-1);
                        outPut(second_input);
                    }else{
                        first_input = parseField();
                        first_input *= (-1);
                        outPut(first_input);
                    }
                }
                break;
        }

        if(field.getText().length() != 0)
            all_clear.setText("C");
        else
            all_clear.setText("AC");
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                transition = (TransitionDrawable) v.getBackground();
                transition.startTransition(250);
                break;
            case MotionEvent.ACTION_UP:
                transition.reverseTransition(250);
                break;
            case MotionEvent.ACTION_CANCEL:
                transition.reverseTransition(250);
                break;
        }
        return false;
    }
}
