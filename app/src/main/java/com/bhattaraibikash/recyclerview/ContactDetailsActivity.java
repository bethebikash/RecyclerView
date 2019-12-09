package com.bhattaraibikash.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactDetailsActivity extends AppCompatActivity {

    ImageView imgProfile;
    TextView txtname, txtphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        imgProfile = findViewById(R.id.imgProfile);
        txtname =  findViewById(R.id.txtname);
        txtphone = (TextView) findViewById(R.id.txtphone);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            imgProfile.setImageResource(bundle.getInt("image"));
            txtname.setText(bundle.getString("name"));
            txtphone.setText(bundle.getString("phone"));
        }
    }
}
