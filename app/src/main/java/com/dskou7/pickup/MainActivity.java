package com.dskou7.pickup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView postListingButton = (TextView) findViewById(R.id.postListingButton);
        postListingButton.setText("Post a Listing");
        TextView searchListingsButton = (TextView) findViewById(R.id.searchListingsButton);
        postListingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Main","post listing button touch handler");
                Intent listingIntent = new Intent(view.getContext(), CreateListing.class);
                startActivityForResult(listingIntent, 0);

            }
        });
        searchListingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Main","search listings button touch handler");
                Intent searchIntent = new Intent(view.getContext(), SearchActivity.class);
                startActivityForResult(searchIntent, 0);
            }
        });

    }


}
