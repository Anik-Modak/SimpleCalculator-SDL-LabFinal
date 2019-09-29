package com.example.cse.samplecalculator_sdl_labfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultDisplay;
    TextView inputDisplay;

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonDot;
    Button buttonPower;
    Button buttonSqrt;
    Button buttonMod;
    Button buttonC;
    Button buttonEqual;

    ImageButton imgButtonDlt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputDisplay=(TextView) findViewById(R.id.input);
        resultDisplay=(TextView)findViewById(R.id.result);
        button0=(Button) findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttonDot=(Button)findViewById(R.id.buttondot);
        buttonAdd=(Button)findViewById(R.id.buttonadd);
        buttonSub=(Button)findViewById(R.id.buttonsub);
        buttonDiv=(Button)findViewById(R.id.buttondiv);
        buttonMul=(Button)findViewById(R.id.buttonmul);
        buttonEqual=(Button)findViewById(R.id.buttonequal);
        buttonMod=(Button)findViewById(R.id.buttonmod);
        buttonPower=(Button)findViewById(R.id.buttonpower);
        buttonSqrt=(Button)findViewById(R.id.buttonroot);
        buttonC=(Button)findViewById(R.id.buttonclear);
        imgButtonDlt=(ImageButton) findViewById(R.id.imgbuttondlt);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("0"));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("1"));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("2"));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("3"));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("4"));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("5"));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("6"));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("7"));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("8"));
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("9"));
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("+"));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("-"));
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("*"));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(CalculatorController.setOperation("/"));
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("^"));
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("%"));
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("."));
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("Sqrt of "));
            }
        });

        imgButtonDlt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String clearAll = Controller.setOperation("clear");
                inputDisplay.setText(clearAll);
                resultDisplay.setText(clearAll);
                return true;
            }
        });

        imgButtonDlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("delete"));
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String clearAll = Controller.setOperation("clear");
                inputDisplay.setText(clearAll);
                resultDisplay.setText(clearAll);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultDisplay.setText(Controller.setOperation("="));
            }
        });
    }
}
