package com.example.gf_reyesdelciclismo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity {

    private EditText numID, eTPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        numID=(EditText) findViewById(R.id.numID);
        eTPersonName=(EditText) findViewById(R.id.eTPersonName);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void guardar(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase GFReyes = admin.getReadableDatabase();
        String numID = numID.getText().toString();
        String eTPersonName = eTPersonName.getText(.toString);

        ContentValues registro = new ContentValues();
        registro.put("Numero_de_identidad", numID);
        registro.put("Nombre_completo", eTPersonName);

        GFReyes.insert("agenda", null, registro);
        GFReyes.close();
        numID.setText("");
        eTPersonName.setText("");
        Toast.makeText(this, "Se guardaron los datos", Toast.LENGTH_SHORT).show();
    }

}