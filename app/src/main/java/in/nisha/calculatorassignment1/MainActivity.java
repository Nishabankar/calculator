package in.nisha.calculatorassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText calArea;
    private Button btnAC;
    private Button btnper;
    private Button btnmod;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnmul;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btnsub;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btnadd;
    private Button btn0;
    private Button btnclear;
    private Button btnequal;
    private String Data;
    private String editarea;
    private TextView text;
    private int result=0;
    int val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAC = findViewById(R.id.btnAC);
        btnper = findViewById(R.id.btnper);
        btnmod = findViewById(R.id.btnmod);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnmul = findViewById(R.id.btnmul);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnsub = findViewById(R.id.btnsub);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btnadd= findViewById(R.id.btnadd);
        btn0= findViewById(R.id.btn0);
        btnclear=findViewById(R.id.btnCLEAR);
        btnequal= findViewById(R.id.btnequal);
        text=findViewById(R.id.edittext);


   btn7.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Data=text.getText().toString();
           text.setText(Data+"7");
              }
   });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"9");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"5");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"6");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"2");
            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"3");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=text.getText().toString();
                text.setText(Data+"0");
            }
        });






        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(text.getText().toString());
                Data=text.getText().toString();
                text.setText(Data+"*");

                }
        });



        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(text.getText().toString());
                Data=text.getText().toString();
                text.setText(Data+"+");


            }
        });


        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(text.getText().toString());
                Data=text.getText().toString();
                text.setText(Data+"-");
            }
        });


        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(text.getText().toString());
                Data=text.getText().toString();
                text.setText(Data+"/");
            }
        });


        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(text.getText().toString());
                Data=text.getText().toString();
                text.setText(Data+"%");
            }
        });



        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(text.getText().toString());
                Data=text.getText().toString();
                text.setText("");
            }
        });


        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(text.getText().toString());
                Data=text.getText().toString();
                text.setText(Data+"AC");
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editarea=text.getText().toString();
                for(int i=0; i<=editarea.length()-1;i++){
                    String secondhalf="";
                    switch(editarea.charAt(i)){
                        case'+':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1+val2;
                            text.setText(String.valueOf(result));
                            break;


                        case'-':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1-val2;
                            text.setText(String.valueOf(result));
                            break;

                        case'*':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1*val2;
                            text.setText(String.valueOf(result));
                            break;


                        case'/':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1/val2;
                            text.setText(String.valueOf(result));
                            break;
                    }

                }
                 }
        });

    }
}