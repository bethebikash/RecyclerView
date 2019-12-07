package com.bhattaraibikash.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvList = (RecyclerView) findViewById(R.id.rvList);

        List<Contacts> contactsList =new ArrayList<>();
        contactsList.add(new Contacts("Iron Man", "9854585451", R.drawable.ironman));
        contactsList.add(new Contacts("Spider Man", "9808154251", R.drawable.spiderman));
        contactsList.add(new Contacts("Caption Marvel", "9843252158", R.drawable.captionmarvel));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        rvList.setAdapter(contactsAdapter);
        rvList.setLayoutManager(new LinearLayoutManager(this));
    }
}
