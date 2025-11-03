package com.example.btaprecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FruitAdapter fruitAdapter;
    private List<Fruit> fruitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Tạo dữ liệu mẫu
        fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Táo", "Giàu vitamin C, tốt cho da và sức khỏe", R.drawable.tao));
        fruitList.add(new Fruit("Chuối", "Giúp bổ sung năng lượng nhanh chóng", R.drawable.chuoi));
        fruitList.add(new Fruit("Cam", "Chứa nhiều vitamin C, tăng đề kháng", R.drawable.cam));
        fruitList.add(new Fruit("Dưa hấu", "Giúp giải khát, nhiều nước", R.drawable.duahau));
        fruitList.add(new Fruit("Xoài", "Ngọt, thơm và rất giàu dinh dưỡng", R.drawable.xoai));
        fruitList.add(new Fruit("Nho", "Chống oxy hóa, tốt cho tim mạch", R.drawable.nho));

        // Gắn adapter
        fruitAdapter = new FruitAdapter(this, fruitList);
        recyclerView.setAdapter(fruitAdapter);
    }
}
