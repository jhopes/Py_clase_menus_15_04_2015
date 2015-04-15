package pe.edu.upeu.www.py_clase_menus_15_04_2015;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.widget.TextView;


public class MainActvity extends ActionBarActivity {

    TextView txt01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_actvity);
    txt01 = (TextView) findViewById(R.id.Txt_result);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_actvity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.action_settings:  return true;
            case R.id.inicio: return true;
            case R.id.opcion1: txt01.setText("settings opcion1"); txt01.getText(); return true;
            case R.id.opcion2: txt01.setText("settings opcion2"); txt01.getText(); return true;
            default: return super.onOptionsItemSelected(item);
        }


    }

}
