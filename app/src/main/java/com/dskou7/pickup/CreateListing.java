package com.dskou7.pickup;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;
import android.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.jjobes.slidedatetimepicker.SlideDateTimeListener;
import com.github.jjobes.slidedatetimepicker.SlideDateTimePicker;

import java.text.SimpleDateFormat;
import java.util.Date;


//public class CreateListing extends AppCompatActivity {
public class CreateListing extends FragmentActivity {
    //stuff to save
    String ListingTitle;
    String GameName;
    String PlayersNeeded;
    String ListingDescription;
    Date ListingTime;



    private SimpleDateFormat mFormatter = new SimpleDateFormat("MMMM dd yyyy hh:mm aa");
    private Button dateTimeButton;
    private SlideDateTimeListener sdtl = new SlideDateTimeListener() {

        @Override
        public void onDateTimeSet(Date date)
        {
            Log.d("CL Time","onDateTimeSet");
            ListingTime = date;
            Toast.makeText(CreateListing.this,
                    mFormatter.format(date), Toast.LENGTH_SHORT).show();
            // Do something with the date. This Date object contains
            // the date and time that the user has selected.
        }

        @Override
        public void onDateTimeCancel()
        {
            Log.d("CL Time","onDateTimeCancel");
            Toast.makeText(CreateListing.this,
                    "Canceled", Toast.LENGTH_SHORT).show();
            // Overriding onDateTimeCancel() is optional.
        }
    };

    android.support.v4.app.FragmentManager mgmt = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Listing thisListing = new Listing();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_listing);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        dateTimeButton = (Button) findViewById(R.id.timeButton_listing);
        dateTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CL Time","clickhandler onclick");
                new SlideDateTimePicker.Builder(mgmt)
                        .setListener(sdtl)
                        .setInitialDate(new Date())
                        .build()
                        .show();
            }
        });


        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
