package com.example.gotopapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RumahSakitawalBross extends ListActivity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListAct = new String[] {"Call Center", "SMS Center","Driving Direction", "Website", "Info di google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListAct));
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

            if(pilihan.equals("Call Center")) {
                String nomortel = "tel:082283172773";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));


            } else if (pilihan.equals("SMS Center"))
            {
                String smsText="Isnan Mellian Ramadhan H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:081365650193"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("Driving Direction"))
                {
                    String lokasirs = "https://goo.gl/maps/CDiLckzAsj9GBD158";
                    a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

                } else if (pilihan.equals("Website"))
                {
                    String website ="http://awalbros.com";
                    a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));


                } else if (pilihan.equals("Info di google"))
                {
                    a = new Intent(Intent.ACTION_WEB_SEARCH);
                    a.putExtra(SearchManager.QUERY, "Rumah Sakit Bross");
                }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

