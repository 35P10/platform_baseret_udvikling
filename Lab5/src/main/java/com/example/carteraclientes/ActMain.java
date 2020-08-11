package com.example.carteraclientes;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.example.carteraclientes.table.Datos;
import com.example.carteraclientes.BaseDatos.DatosOpenHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.example.carteraclientes.cliente;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.BaseColumns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActMain extends AppCompatActivity {
    private ListView lstDatos;
    //private ArrayAdapter<String> adaptador;
    private ArrayAdapter<cliente> adaptador;
    //private ArrayList<String> clientes;
    private ArrayList<cliente> clientes;
    private SQLiteDatabase conexion;
    private DatosOpenHelper datosOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(ActMain.this, ActNuevoCliente.class);
                //startActivity(it);
                startActivityForResult(it, 0);
            }
        });

        listar();
        //actualizar();

    }

    private void listar(){
        datosOpenHelper = new DatosOpenHelper(this);
        conexion = datosOpenHelper.getWritableDatabase();
        Toast.makeText(ActMain.this, "En Inicio", Toast.LENGTH_SHORT).show();
        String[] projection = {
                BaseColumns._ID,
                    Datos.COL_1,
                    Datos.COL_4
        };

        String selection = Datos.COL_1+ " = ?";
        String[] selectionArgs = { "*" };

        Cursor cursor = conexion.query(
                Datos.TABLE_NAME,   // The table to query
                null,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                null             // The sort order
        );

        lstDatos = (ListView) findViewById(R.id.lstDatos);
        clientes = new ArrayList<cliente>();

        while(cursor.moveToNext()) {
            String nombre = cursor.getString(0);
            String telefono = cursor.getString(3);
            Toast.makeText(ActMain.this, nombre, Toast.LENGTH_SHORT).show();
            cliente newCliente = new cliente(nombre, telefono);

            clientes.add(newCliente);
        }
        cursor.close();
        adaptador = new ArrayAdapter<cliente>(this, android.R.layout.simple_list_item_1, clientes);
        lstDatos.setAdapter(adaptador);

        lstDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                cliente text = (cliente) lstDatos.getItemAtPosition(position);
                String selection = Datos.COL_1 + " LIKE ?";
                String[] selectionArgs = { text.getNombre()};
                int deletedRows = conexion.delete(Datos.TABLE_NAME, selection, selectionArgs);
                Toast.makeText(ActMain.this, "BORRANDO: "+text.getNombre(), Toast.LENGTH_SHORT).show();
                listar();
            }
        });
    }



    @Override
    protected  void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        listar();
    }
}