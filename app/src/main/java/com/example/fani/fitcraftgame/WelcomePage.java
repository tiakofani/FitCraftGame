package com.example.fani.fitcraftgame;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.content.Context;
import android.app.Activity;

public class WelcomePage extends Activity {

    Context context = this;
    Button Enter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomepage);

        TextView sign_in = (TextView) findViewById(R.id.signin);
        sign_in.setPaintFlags(sign_in.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        Enter = (Button) findViewById(R.id.signinOK);
        Enter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Compte.class);
                startActivity(intent);
                // setContentView(R.layout.welcomepage);
            }
        });

        TextView sign_up = (TextView) findViewById(R.id.signup);
        sign_up.setPaintFlags(sign_up.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sign_up.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SignupPage.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
