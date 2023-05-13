package com.example.lab2_ph35761;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        Button btnSave = findViewById(R.id.btnSave);

        EditText edtName =  findViewById(R.id.txtName);

        EditText edtAge =  findViewById(R.id.txtAge);

        TextView txtReSult = findViewById(R.id.txtReSult);
        EditText edtMsSv =  findViewById(R.id.txtMsSv);

        RadioButton rdoNam = findViewById(R.id.rdoNam);
        RadioButton rdoNu = findViewById(R.id.rdoNu);

        CheckBox chkDaBong = findViewById(R.id.chkDabong);
        CheckBox chkChoiGame = findViewById(R.id.chkChoiGame);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String age = edtAge.getText().toString();
                String MsSv = edtMsSv.getText().toString();
            
                String gender = rdoNam.isChecked()
                        ?   rdoNam.getText().toString()
                        :   rdoNu.isChecked()
                        ?   rdoNu.getText().toString()
                        :   "chua lua chon gioi tinh";


                String interest = chkDaBong.isChecked() && chkChoiGame.isChecked()
                        ? "da bong va choi game"
                        : chkDaBong.isChecked()
                        ? chkDaBong.getText().toString()
                        : chkChoiGame.isChecked()
                        ? chkChoiGame.getText().toString()
                        : "khong choi gi ca...";
                
                txtReSult.setText(
                            "ho ten: " + name + "\n"
                        +   "MSSV: " + MsSv + "\n"
                        +   "Tuoi: " + age + "\n"
                        +   "Gioi tinh: " + gender
                        +   "\n" + "So thich" + interest
                );

            }
        });
    }


}