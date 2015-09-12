package claudswo.com.test3;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.text.Editable;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener,TextWatcher {

    private Spinner spinner1, spinner2;
    private EditText age_entry;
    private TextView result;
    private double temp;
    private double spinner1num = 0,spinner2num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        // Create an ArrayAdapter using the string array and a default spinner          layout
        ArrayAdapter<CharSequence> adapter =   ArrayAdapter.createFromResource(this,
                R.array.animals_1_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        init();
    }

    private void init() {
        age_entry = (EditText)findViewById(R.id.age_entry);
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(this);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(this);
        result = (TextView)findViewById(R.id.result);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

        if (String.valueOf(parent.getItemAtPosition(pos)).equals("human") )
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 1;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));

                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 1;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("dog") )
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 3.64;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 3.64;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }

        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("cat"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 3.2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 3.2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("bear"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("hamster"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 20;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 20;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("hippo"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 1.78;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 1.78;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("kangaroo"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 8.89;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 8.89;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("chicken"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 5.33;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 5.33;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("cow"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 3.64;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 3.64;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("deer"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 2.29;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 2.29;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("duck"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 4.21;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 4.21;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("elephant"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 1.14;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 1.14;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("fox"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 5.71;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 5.71;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("goat"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 5.33;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 5.33;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("groundhog"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 5.71;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 5.71;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("guinea pig"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 10;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 10;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("horse"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("lion"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 2.29;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 2.29;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("monkey"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 3.2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 3.2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("mouse"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 20;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 20;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("parakeet"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 4.44;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 4.44;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("pig"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 3.2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 3.2;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("pigeon"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 7.27;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 7.27;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("rabbit"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 8.89;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 8.89;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("rat"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 26.67;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 26.67;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("sheep"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 5.33;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 5.33;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("squirrel"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 5;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 5;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals("wolf"))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    spinner1num = 4.44;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0){
                        result.setText(String.valueOf((int)(temp*spinner2num)));
                    }
                    break;
                case R.id.spinner2:
                    spinner2num = 4.44;
                    temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
                    if (spinner2num!=0) {
                        result.setText(String.valueOf((int) (temp * spinner2num)));
                    }
                    break;
            }
        }
        else if (String.valueOf(parent.getItemAtPosition(pos)).equals(""))
        {
            switch (parent.getId()) {
                case R.id.spinner1:
                    result.setText(null);
                    break;
                case R.id.spinner2:
                    result.setText(null);
                    break;
            }
        }
    }
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void afterTextChanged(Editable arg0) {

        temp = Double.parseDouble(age_entry.getText().toString())/spinner1num;
        result.setText(String.valueOf((int) (temp * spinner2num)));

    }

    @Override
    public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                  int arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTextChanged(CharSequence s, int a, int b, int c) {
        // TODO Auto-generated method stub
    }};