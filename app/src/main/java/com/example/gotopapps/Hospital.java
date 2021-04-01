package com.example.gotopapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class Hospital extends ListActivity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listHospital = new String[] {"Rumah Sakit awal Bross", "RS Esa Hospital", "Rumah sakit jiwa tanpan", "RS Tabrani"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listHospital));
    }

    protected void  onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);


    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;

            if(pilihan.equals("Rumah Sakit awal Bross")) {
                a = new Intent(this,RumahSakitawalBross.class);


                } else if (pilihan.equals("RS Esa Hospital"))
                {

                }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    }
