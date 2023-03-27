package id.ac.uinsuska.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Adapterdata adapterdata;
    List<String> listdata;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvData);
        listdata = new ArrayList<>();

        for (int i=0; i<10; i++){
            listdata.add("data ke" + i);
        }
        LinearLayoutManager LinearLayoutManager = new LinearLayoutManager(this, androidx.recyclerview.widget.LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(LinearLayoutManager);

        adapterdata = new Adapterdata(this,listdata);
        recyclerView.setAdapter(adapterdata);
        adapterdata.notifyDataSetChanged();
    }
}