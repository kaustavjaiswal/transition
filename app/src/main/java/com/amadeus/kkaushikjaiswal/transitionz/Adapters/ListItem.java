package com.amadeus.kkaushikjaiswal.transitionz.Adapters;

import android.database.Cursor;

/**
 * Created by kkaushikjaiswal on 6/6/2016.
 */
public class ListItem
{
    private static int COLUMN_TRANSACTION_AMOUNT = 1;
    private String amount;

    public void setAmount(String name){
        this.amount = name;
    }
    public String getAmount(){
        return amount;
    }

    public static ListItem fromCursor(Cursor cursor) {
        //TODO return your MyListItem from cursor.;
        ListItem listItem = new ListItem();
        listItem.setAmount(cursor.getString(COLUMN_TRANSACTION_AMOUNT));
        return listItem;
    }
}