package com.bhattaraibikash.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsAdapter {

    public class ContactsViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProfile;
        TextView txtname, txtmovie;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            txtname = itemView.findViewById(R.id.txtname);
            txtmovie = itemView.findViewById(R.id.txtmovie);
        }
    }
}
