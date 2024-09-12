package com.example.e_commercestorefront;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String title = extras.getString("title", "");
            String description = extras.getString("description", "");
            int imageResourceId = extras.getInt("imageResourceId", 0);

            TextView titleTextView = findViewById(R.id.productTitleTextView);
            TextView descTextView = findViewById(R.id.productDescTextView);
            ImageView imageView = findViewById(R.id.productImageView);

            titleTextView.setText(title);
            descTextView.setText(description);
            imageView.setImageResource(imageResourceId);
        }
    }

    public void addToCartClicked(View view) {
        Toast.makeText(this, "Product added to cart!", Toast.LENGTH_SHORT).show();
    }
}
