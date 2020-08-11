package com.example.carteraclientes.table;
import android.provider.BaseColumns;

/* Inner class that defines the table contents */
    public class Datos implements BaseColumns {
    public static final String TABLE_NAME = "CLIENTE";
        public static final String COL_1 = "NOMBRE";
        public static final String COL_2 = "DIRECCION";
        public static final String COL_3 = "EMAIL";
        public static final String COL_4 = "TELEFONO";

        public static final String SQL_CREATE_ENTRIES =
                    "CREATE TABLE IF NOT EXISTS CLIENTE (" +
                            _ID + " INTEGER PRIMARY KEY," +
                            COL_1 + " TEXT," +
                            COL_2 + " TEXT," +
                            COL_3 + " TEXT," +
                            COL_4 + " TEXT)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS CLIENTE";


    }


