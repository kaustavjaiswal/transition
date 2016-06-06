package com.amadeus.kkaushikjaiswal.transitionz.Adapters;

/**
 * Created by kkaushikjaiswal on 6/6/2016.
 */
import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amadeus.kkaushikjaiswal.transitionz.R;

public class CursorAdapter extends CursorRecycler<CursorAdapter.ViewHolder>{

    public CursorAdapter(Context context, Cursor cursor){
        super(context,cursor);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.amount_text);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_listview, parent, false);
        ViewHolder vh = new ViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Cursor cursor) {
        ListItem myListItem = ListItem.fromCursor(cursor);
        viewHolder.mTextView.setText(myListItem.getAmount());
    }
}
