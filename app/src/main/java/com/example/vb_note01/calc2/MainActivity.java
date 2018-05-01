package com.example.vb_note01.calc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String DisplayText = "";
    private String num[] = new String[2];
    private String CalcType = "";
    private TextView DisplayColumn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.vb_note01.calc2.R.layout.activity_main);//xmlを読み込む。このあとじゃないとfindviewは効かない

        DisplayColumn = this.findViewById(com.example.vb_note01.calc2.R.id.displayColumn);

//        ArrayList<Button> number_button = new ArrayList<Button>();
        for (int i = 1; i <= 9; i++) {
            int id = getResources().getIdentifier("button" + i, "id", getPackageName());
//            number_button.add((Button) findViewById(id).setOnClickListener(this);
            findViewById(id).setOnClickListener(this);
        }
//        Button Button0 = this.findViewById(R.id.button0);
//        Button Button1 = this.findViewById(R.id.button1);
//        Button Button2 = this.findViewById(R.id.button2);
//        Button Button3 = this.findViewById(R.id.button3);
//        Button Button4 = this.findViewById(R.id.button4);
//        Button Button5 = this.findViewById(R.id.button5);
//        Button Button6 = this.findViewById(R.id.button6);
//        Button Button7 = this.findViewById(R.id.button7);
//        Button Button8 = this.findViewById(R.id.button8);
//        Button Button9 = this.findViewById(R.id.button9);
        Button ButtonPlus = this.findViewById(com.example.vb_note01.calc2.R.id.buttonPlus);
        Button ButtonMinus = this.findViewById(com.example.vb_note01.calc2.R.id.buttonMinus);
        Button ButtonDiv = this.findViewById(com.example.vb_note01.calc2.R.id.buttonDiv);
        Button ButtonTimes = this.findViewById(com.example.vb_note01.calc2.R.id.buttonTimes);

//        Map<String, String> CalcType = new HashMap<>();
//        CalcType.put("Plus","+");
//        CalcType.put("Minus","-");
//        CalcType.put("Times","*");
//        CalcType.put("Div","/");



//        Button0.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
////               クリックされた時の処理
//                text3.setText(text.getText()+"こんにちは");
//                text4.setText(text.getText()+"こんにちは");
//
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        if (v != null) {
            Button pressed_button = (Button) v;
            if (CalcType == "") {
                if( num[0] != null ){
                    num[0] = num[0] + pressed_button.getText().toString();
                }else{
                    num[0] = pressed_button.getText().toString();
                }
                DisplayText = num[0];
            } else {
                if( num[1] != null ){
                    num[1] = num[1] + pressed_button.getText().toString();
                }else{
                    num[1] = pressed_button.getText().toString();
                }
                num[1] = num[1] + pressed_button.getText().toString();
                DisplayText = num[1];
            }
        }
        DisplayColumn.setText(DisplayText);
    }
}