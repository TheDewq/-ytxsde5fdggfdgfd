package com.example.appsmob2_1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.appsmob2_1.databinding.ActivityMainBinding;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private TextView rpt_textview;
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_divi;
    private Button btn_mult;

    private EditText numero1;
    private EditText numero2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void suma (){
        int[] vlr = xd();
        int rpt = vlr[0] + vlr[1];
        dibujar_rpt(String.valueOf(rpt));
        
    }

    public void resta (){
        int[] vlr = xd();
        int rpt = vlr[0] - vlr[1];
        dibujar_rpt(String.valueOf(rpt));
    }

    public void multiplicacion (){
        int[] vlr = xd();
        int rpt = vlr[0] * vlr[1];
        dibujar_rpt(String.valueOf(rpt));
    }

    public void division (){
        int[] vlr = xd();

        if (vlr[1]!=0){
            int rpt = vlr[0] + vlr[1];
            dibujar_rpt(String.valueOf(rpt));
        }else{
            dibujar_rpt(String.valueOf("pendejo no se puede dividir en 0"));
        }


    }
    public void dibujar_rpt(String rpt){
        rpt_textview.setText(rpt);
        
}
    public int[] xd(){
        int n1 = Integer.parseInt(String.valueOf(numero1.getText()));

        int n2 = Integer.parseInt(String.valueOf(numero2.getText()));

        return new int[]{n1, n2};
    }
}