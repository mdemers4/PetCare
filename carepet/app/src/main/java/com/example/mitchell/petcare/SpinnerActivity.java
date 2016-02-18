package com.example.mitchell.petcare;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * Created by Mitchell on 16-02-18.
 */
public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        parent.getItemAtPosition(pos);
        Spinner spinner = (Spinner) findViewById(R.id.pet_type);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
