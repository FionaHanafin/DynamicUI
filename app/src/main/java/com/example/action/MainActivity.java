package com.example.action;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scrollView = new ScrollView(this);
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        scrollView.addView(layout);
        setContentView(scrollView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    int i = 0,j=0,k=0;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.button:
            Button b = new Button(this);
            b.setTag("b"+i);
            b.setText("button "+i);
            layout.addView(b);
            setContentView(scrollView);
            i++;
            return(true);
        case R.id.edit:
            EditText e = new EditText(this);
            e.setTag("e"+j);
            e.setText("EditText "+j);
            layout.addView(e);
            setContentView(scrollView);
            j++;
            return(true);
        case R.id.text:
            TextView t = new TextView(this);
            t.setTag("t"+k);
            t.setText("EditText "+k);
            layout.addView(t);
            setContentView(scrollView);
            k++;

            return(true);
    }
        return(super.onOptionsItemSelected(item));
    }

}
