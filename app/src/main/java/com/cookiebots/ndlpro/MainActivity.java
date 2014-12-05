package com.cookiebots.ndlpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if(id == R.id.action_ajout){
            Intent intent = new Intent(this, AjoutRefugieActivity.class);
            startActivity(intent);
            return true;
        }

        else if(id == R.id.action_recherche){
            Intent intent = new Intent(this, RechercheActivity.class);
            startActivity(intent);
            return true;
        }

        else if(id == R.id.action_refugie){
            Intent intent = new Intent(this, RefugieActivity.class);
            startActivity(intent);
            return true;
        }

        else if(id == R.id.action_stock){
            Intent intent = new Intent(this, StockActivity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
