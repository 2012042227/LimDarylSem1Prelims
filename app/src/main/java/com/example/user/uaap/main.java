package com.example.user.uaap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;


public class main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        /*Spinner spinner = (Spinner) findViewById(R.id.spinner);*/
        /*
        Button mybutton = (Button) findViewById(R.id.next);
        Button asd = (Button) findViewById(R.id.next2);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(main.this, main2.class));
            }
        });


        asd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(main.this, main3.class));
            }
        });
        */

        //``FINAL UPDATE``

        RadioGroup group1 = (RadioGroup) findViewById(R.id.Radio1);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                              @Override
                                              public void onCheckedChanged(RadioGroup radio1, int checkedId) {
                                                  Button button = (Button) findViewById(R.id.submit_area);
                                                  switch (checkedId) {
                                                      case R.id.next:
                                                          button.setOnClickListener(
                                                                  new Button.OnClickListener() {
                                                                      public void onClick(View v) {
                                                                          startActivity(new Intent(getApplicationContext(), main2.class));
                                                                      }
                                                                  }
                                                          );

                                                          break;
                                                      case R.id.next2:
                                                          button.setOnClickListener(
                                                                  new Button.OnClickListener() {
                                                                      public void onClick(View v) {
                                                                          startActivity(new Intent(getApplicationContext(), main3.class));
                                                                      }
                                                                  }
                                                          );
                                                          break;
                                                  }
                                              }
                                          }
        );

          /*if (spinner.getSelectedItem().toString().equals("Highlights")){
            Button mybutton = (Button) findViewById(R.id.next);
            mybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(main.this, main3.class));
                }
            });

        }

        if (spinner.getSelectedItem().toString().equals("Schedule")){
            Button mybutton = (Button) findViewById(R.id.next);
            mybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(main.this, main2.class));
                }
            }); */

        }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
