package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.finalquiz.R;

public class DisplayResultActivity extends AppCompatActivity {
    String sendMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        Intent intent =getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        sendMessage=message;
        TextView resultTextView = (TextView) findViewById(R.id.finTextView);
        resultTextView.setText(message);
       // setContentView(resultTextView);
//        TextView textView = new TextView(this);
//        textView.setTextSize(40);
//        textView.setText(message);
//        setContentView(textView);
    }

    public void clickToReturn(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickSendMail(View view) {

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Your result :");
        intent.putExtra(Intent.EXTRA_TEXT, sendMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
    }

    }
}
