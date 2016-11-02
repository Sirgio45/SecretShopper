package com.ebookfrenzy.secretshopper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class SecretShopperActivity extends AppCompatActivity {

    //the sume of all radio buttons and check boxes.
    private int[]checklistValues=new int[100];//100 is the max points you can get.




    //Declare the checkboxes.
    CheckBox happyCheckBox;
    CheckBox annoyedCheckBox;
    CheckBox fairCheckBox;




    //Declare the RadioButtons
    RadioGroup yesNoRadioGroupBox;
    RadioButton yesRadioButton;
    RadioButton noRadioButton;
    RadioButton askRadioButton;


    //Declare the spinner
    Spinner ratingScaleSpinner;

    //Declare the Buttons
    Button submitButton;
    Button clearButton;
    Button exitButton;

    //EditText for the Results and Name
    EditText FinalscoreEditTextView;
    EditText CurrentscoreEditTextView;
    EditText nameEstablishmentTextView;

    //name of the establishment
    private static final String NAME_ESTABLISHMENT="NAME_ESTABLISHMENT";
    private static final String FINAL_SCORE="FINAL_SCORE";
    private static final String Current_Score="CURRENT_SCORE";
    private double scoreCurrentRating;//the score before the user adds ratings
    private double scoreFinalRating;//the score for FINAL SCORE.




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_shopper);


        //check if the app has started, or if its being restored

        if(savedInstanceState == null)
        {
            //just started
            scoreCurrentRating=0;
            scoreFinalRating=0;
        }
        else
        {
            //app is being restored

        }
    }
}
