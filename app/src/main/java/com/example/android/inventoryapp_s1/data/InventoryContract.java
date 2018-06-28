package com.example.android.inventoryapp_s1.data;

import android.provider.BaseColumns;

public final class InventoryContract {

    private InventoryContract() {}

    public static final class InventoryEntry implements BaseColumns {

        // Name of database table for all products
        public final static String TABLE_NAME = "products";

        // Unique ID number for each product in database table
        public final static String _ID = BaseColumns._ID;

        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_PRICE = "price";
        public static final String COLUMN_QTY = "quantity";
        public static final String COLUMN_SUPPLIER = "supplier";
        public static final String COLUMN_SUPPLIER_PHONE = "phone";
    }
}