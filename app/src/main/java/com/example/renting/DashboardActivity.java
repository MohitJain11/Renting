package com.example.renting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {
    ImageView iv_add_product, iv_user_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        iv_user_menu = findViewById(R.id.iv_user_menu);
        iv_add_product = findViewById(R.id.iv_add_product);

        iv_add_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent intent = new Intent(DashboardActivity.this, AddProduct.class);
                startActivity(intent);
            }
        });


    }
}