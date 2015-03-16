package com.example.fani.fitcraftgame;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.NumberPicker;
import android.widget.TextView;

import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.content.Context;
import android.app.Activity;

public class SignupPage extends Activity {

    Context context = this;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setPaintFlags(textView5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView email = (TextView) findViewById(R.id.email);
        email.setPaintFlags(email.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView password = (TextView) findViewById(R.id.password);
        password.setPaintFlags(password.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        fillArray();

        TextView legalpolicies = (TextView) findViewById(R.id.legalpolicies);
        legalpolicies.setPaintFlags(legalpolicies.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        legalpolicies.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Policies.class);
                startActivity(intent);
            }
        });
    }

    public void fillArray() {

        NumberPicker AgePicker, WeightPicker;

        View inflatedView = getLayoutInflater().inflate(R.layout.signuppage, null);
        AgePicker = ( NumberPicker ) inflatedView.findViewById( R.id.AgePicker);
        WeightPicker = ( NumberPicker ) inflatedView.findViewById( R.id.WeightPicker);
        String[] Ages = new String[100];
        String[] Weights = new String[100];

        for( int i = 1; i <= Ages.length; i++ ) {
            Ages[i-1] = Integer.toString( i );
        }
        AgePicker.setMinValue( 1 );
        AgePicker.setMaxValue( 100 );
        AgePicker.setWrapSelectorWheel( false );
        AgePicker.setDisplayedValues( Ages );

        for( int x = 0 ; x < Weights.length; x++ ){
            Weights[x] = Integer.toString( x + 100);
        }
        WeightPicker.setMinValue( 100 );
        WeightPicker.setMaxValue( 199 );
        WeightPicker.setWrapSelectorWheel( false );
        WeightPicker.setDisplayedValues( Weights );
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
