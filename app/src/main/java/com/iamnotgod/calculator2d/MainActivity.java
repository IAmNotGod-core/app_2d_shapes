package com.iamnotgod.calculator2d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtPanjang, edtLebar;
    Button btnPersegi, btnSegitiga, btnLingkaran;
    TextView txtKeliling, txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent() {
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        btnPersegi = findViewById(R.id.btnPersegi);
        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnLingkaran = findViewById(R.id.btnLingkaran);
        txtKeliling = findViewById(R.id.txtKeliling);
        txtLuas = findViewById(R.id.txtLuas);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungPersegi();
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungSegitiga();
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungLingkaran();
            }
        });
    }

    public void hitungPersegi() {
        double keliling = 2 * Double.parseDouble(edtPanjang.getText().toString()) + 2 * Double.parseDouble(edtLebar.getText().toString());
        double luas = Double.parseDouble(edtPanjang.getText().toString()) * Double.parseDouble(edtLebar.getText().toString());

        txtKeliling.setText(keliling+" cm");
        txtLuas.setText(luas+" cm");
    }

    public void hitungSegitiga() {
        double sisiMiring = Math.sqrt(Math.pow(Double.parseDouble(edtPanjang.getText().toString()),2) + Math.pow(Double.parseDouble(edtLebar.getText().toString()),2));
        double keliling = Double.parseDouble(edtPanjang.getText().toString()) + Double.parseDouble(edtLebar.getText().toString()) + sisiMiring;
        double luas = 0.5 * Double.parseDouble(edtPanjang.getText().toString()) * Double.parseDouble(edtLebar.getText().toString());

        txtKeliling.setText(keliling+" cm");
        txtLuas.setText(luas+" cm");
    }

    public void hitungLingkaran() {
        double keliling = Math.PI * Double.parseDouble(edtPanjang.getText().toString());
        double luas = Math.PI * Math.pow((Double.parseDouble(edtPanjang.getText().toString()) / 2),2);

        txtKeliling.setText(keliling+" cm");
        txtLuas.setText(luas+" cm");
    }
}