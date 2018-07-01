package com.example.android.physics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int score = 0;
    String input;

    /**
     * Validating whether the text input is the correct answer
     * trim() used to ignore trailing spaces
     * equalsIgnoreCase()is used to compare equivalence of two strings despite the case
     **/

    public void nameEntered() {
        EditText name = findViewById(R.id.name);
        input = name.getText().toString();

        if (input.trim().equalsIgnoreCase("Earth")) {

            score += 20;

        } else {
            score += 0;

        }

    }

    /**
     * function onRadioButtonClicked checks on the radio button which is checked
     * method isChecked() checks whether the radio button is checked and returns a boolean
     *
     * @param view used to reference to the view
     */
    public void onRadioButtonClicked(View view) {

        // Is the button now checked? store the answer in checked
        boolean checked = ((RadioButton) view).isChecked();

        /*Check which radio button was clicked and add 20 marks on the correct answer given

         */
        switch (view.getId()) {
            case R.id.energy://correct answer
                if (checked)

                    score += 20;
                Toast.makeText(this, "Correct answer!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.momentum:
                if (checked)
                    score += 0;
                Toast.makeText(this, "Wrong answer!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.force:
                if (checked)
                    score += 0;
                Toast.makeText(this, "Wrong answer!!", Toast.LENGTH_SHORT).show();
                break;
        }
/* Check which radio button was clicked and add 20 marks on the correct answer given
        otherwise a toast message on wrong answer
         */
        switch (view.getId()) {
            case R.id.barometer:
                if (checked)
                    score += 0;
                Toast.makeText(this, "Wrong answer!!", Toast.LENGTH_SHORT).show();

                break;
            case R.id.sonometer:
                if (checked)
                    score += 0;
                Toast.makeText(this, "Wrong answer!!", Toast.LENGTH_SHORT).show();

                break;
            case R.id.galvanometer://correct answer
                if (checked)
                    score += 20;
                Toast.makeText(this, "Correct answer!!", Toast.LENGTH_SHORT).show();

                break;
        }
        //Check which radio button was clicked and add 20 marks on the correct answer given


        switch (view.getId()) {
            case R.id.gram:
                if (checked)
                    score += 0;
                Toast.makeText(this, "Wrong answer!!", Toast.LENGTH_SHORT).show();

                break;
            case R.id.kilogram://correct answer
                if (checked)
                    score += 20;
                Toast.makeText(this, "Correct answer!!", Toast.LENGTH_SHORT).show();

                break;
            case R.id.pound:
                if (checked)
                    score += 0;
                Toast.makeText(this, "Wrong answer!!", Toast.LENGTH_SHORT).show();

                break;
        }

    }

    //Validates the right checkbox click
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.reduction://Wrong answer
                if (checked) {
                    score += 0;
                    Toast.makeText(this, "Wrong answer!!", Toast.LENGTH_SHORT).show();
                    break;

                }
            case R.id.radiation:
                if (checked) {
                    score += 10;
                    break;
                }
            case R.id.convection:
                if (checked) {
                    score += 10;
                    break;
                }

        }
    }


//Method to be called on clicking the submit button and it displays the score using a toast message

    public void onSubmit(View view) {


        nameEntered();

        if (score >= 50) {
            Toast.makeText(this, "Congratulations your score is:" + score, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Pull up your socks score is:" + score, Toast.LENGTH_SHORT).show();
        }
        score = 0;

    }

}

