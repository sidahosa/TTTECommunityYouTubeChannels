package com.thetttecommunity.tttecommunityyoutubechannels;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class contact_me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_me);

        TextView titleFont = (TextView) findViewById(R.id.con_us);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/flange.ttf");
        titleFont.setTypeface(custom_font);

        ImageView contact_email = (ImageView) findViewById(R.id.contact);
        contact_email.setBackgroundResource(R.drawable.contact_me_pic);

        final TextView YouTubeName = (TextView) findViewById(R.id.YTNAME);
        final TextView YouTubeMSG = (TextView) findViewById(R.id.YTMSG);

        Button Button2 = (Button) findViewById(R.id.submit);

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail(YouTubeName, YouTubeMSG);
                finish();
            }
        });
    }

    protected void sendEmail(TextView text, TextView text_message) {
        Log.i("Send email", "");

        String[] TO = {"thetttecommunity@gmail.com"};
        String[] CC = {"familyguy3160@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hey " + text.getText().toString() + ", wants to join " +
                "the ThomasTubers Database");
        emailIntent.putExtra(Intent.EXTRA_TEXT, text_message.getText().toString());

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            //Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(contact_me.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

}
