package com.example.gf_reyesdelciclismo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Inscritos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscritos);
    }

    public void consultapornumid (View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administración", null,1);
        SQLiteDatabase GFReyes = admin.getWritableDatabase();
        String numID = numID.rawQuery(
                "select eTPersonName from agenda where numID=" + numID, null
        );
        if (fila.moveToFirst()) {
            eTPersonName.setText(fila.getString(0));
        } else
            Toast.makeText(this, "No existe un numero de identidad asociado", Toast.LENGTH_SHORT).show();
        GFReyes.close();
    }
}