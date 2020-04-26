package com.example.nguyenduytuan_59132945_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    EditText edtHoTen, edtNgaySinh, edtSThich;
    RadioGroup rdgGioiTinh;
    CheckBox cbXemPhim, cbNgheNhac, cbCaFe, cbONha, cbVaoBep;
    Button btnXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddView();
        AddEvent();
    }
    private void AddView(){
        edtHoTen = findViewById(R.id.edtHoTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSThich = findViewById(R.id.edtSthich);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        cbXemPhim = findViewById(R.id.cbXemPhim);
        cbNgheNhac = findViewById(R.id.cbNgheNhac);
        cbCaFe = findViewById(R.id.cbCaFe);
        cbONha = findViewById(R.id.cbONha);
        cbVaoBep = findViewById(R.id.cbVaoBep);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }
    private void AddEvent(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chuoi();
            }
        });
    }
    private void Chuoi(){
        String Ketqua = "";
        Ketqua = "Ho Ten: " +  edtHoTen.getText() + "\n" +
                "Ngau Sinh: " + edtNgaySinh.getText() + "\n";
        switch (rdgGioiTinh.getCheckedRadioButtonId()){
            case R.id.rbNam: Ketqua += "Gioi Tinh: " + "Nam" + "\n" + "So Thich: "; break;
            case R.id.rbNu: Ketqua += "Gioi Tinh: " + "Nu" + "\n" + "So Thich: "; break;
        }
        CheckBox [] arrCb = new CheckBox[]{cbXemPhim, cbNgheNhac, cbCaFe, cbONha, cbVaoBep};
        for (int i = 0; i < arrCb.length;i++)
        {
            if (arrCb[i].isChecked())
            {
                Ketqua += arrCb[i].getText().toString() + ";";
            }
        }
        Toast.makeText(MainActivity.this,Ketqua, Toast.LENGTH_SHORT).show();

    }


}
