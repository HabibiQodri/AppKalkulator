package com.habibi.aplikasikalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText angka_pertama , angka_kedua;
    private Button b_tambah , b_kali , b_kurang , b_bagi;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator_main);
    angka_pertama = (EditText)findViewById(R.id.txtAngkaPertama);
    angka_kedua = (EditText)findViewById(R.id.txtAngkaKedua);
    b_tambah = (Button)findViewById(R.id.tambah);
    b_kali = (Button)findViewById(R.id.kali);
    b_kurang = (Button)findViewById(R.id.kuurang);
    b_bagi = (Button)findViewById(R.id.bagi);
    hasil = (TextView)findViewById(R.id.txt_hasil);
    }


    public void methodPenjumlahan(View v){
        if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0) ){
            double angka_1 = Double.parseDouble(angka_pertama.getText().toString());
            double angka_2 = Double.parseDouble(angka_kedua.getText().toString());
            double result = angka_1 + angka_2;
            hasil.setText(Double.toString(result));
        }else{
            Toast toast = Toast.makeText(MainActivity.this,"Masukkan Angka Pertama dan Kedua ",Toast .LENGTH_LONG);
            toast.show();
        }
    }

    public void methodePengurangan(View v){
        if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0) ){
            double angka_1 = Double.parseDouble(angka_pertama.getText().toString());
            double angka_2 = Double.parseDouble(angka_kedua.getText().toString());
            double result = angka_1 - angka_2;
            hasil.setText(Double.toString(result));
        }else{
            Toast toast = Toast.makeText(MainActivity.this,"Masukkan Angka Pertama dan Kedua ",Toast .LENGTH_LONG);
            toast.show();
        }
    }

    public void methodPerkalian(View v){
        if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0) ){
            double angka_1 = Double.parseDouble(angka_pertama.getText().toString());
            double angka_2 = Double.parseDouble(angka_kedua.getText().toString());
            double result = angka_1 * angka_2;
            hasil.setText(Double.toString(result));
        }else{
            Toast toast = Toast.makeText(MainActivity.this,"Masukkan Angka Pertama dan Kedua ",Toast .LENGTH_LONG);
            toast.show();
        }
    }

    public void methodPembagian(View v){
        if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0) ){
            double angka_1 = Double.parseDouble(angka_pertama.getText().toString());
            double angka_2 = Double.parseDouble(angka_kedua.getText().toString());
            double result = angka_1 / angka_2;
            hasil.setText(Double.toString(result));
        }else{
            Toast toast = Toast.makeText(MainActivity.this,"Masukkan Angka Pertama dan Kedua ",Toast .LENGTH_LONG);
            toast.show();
        }
    }

    public void clear(View v){
        angka_pertama.setText("");
        angka_kedua.setText("");
        hasil.setText("0");
        angka_pertama.requestFocus();
    }

}