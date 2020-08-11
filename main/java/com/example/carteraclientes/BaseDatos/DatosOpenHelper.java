package com.example.carteraclientes.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.carteraclientes.table.*;
public class DatosOpenHelper extends SQLiteOpenHelper{
    public DatosOpenHelper(Context context){
        super(context, "DATOS", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(Datos.SQL_CREATE_ENTRIES );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il){
        sqLiteDatabase.execSQL(Datos.SQL_DELETE_ENTRIES);
        onCreate(sqLiteDatabase);
    }
}
