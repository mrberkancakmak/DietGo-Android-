package com.hakber.dietgo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List1 extends AppCompatActivity {
    private String[] ulkeler =
            {"Atıştırmalar", "Fast Food", "Balık & Deniz Ürünleri", "Çorbalar","Ekmek & Kahvaltı Tahılları",
                    "Et", "Fasülye ve Baklagiller", "İçecekler", "Kuru Yemişler & Tohum Ürünleri", "Makarna & Pirinç", "Meyve",
                    "Salata Çeşitleri", "Sebzeler", "Sos, Baharat & Ezme Çeşitleri", "Süt Ürünleri", "Tatlı & Şekerleme Çeşitleri",
                    "Yumurtalar", "Diğer"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listemiz=(ListView) findViewById(R.id.list1View1);


        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, ulkeler);

        listemiz.setAdapter(veriAdaptoru);

        listemiz.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {


                Intent i = new Intent(List1.this, List2.class);
                i.putExtra("index",String.valueOf(position));
                startActivity(i);

            }
        });
    }
}
