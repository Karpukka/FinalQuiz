package com.example.android.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.example.android.finalquiz.R;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity  {

    float answerOnequest = 0; // float variable for first question
    float answerTwoquest = 0;// float variable for second question
    float answerThreequest = 0;// float variable for third question
    float answerFourquest = 0;// float variable for fourth question
    float answerFifthquest=0;// float variable for fifth question
    float finalAnswer = 0;// float variable for final Answer
    String answerText1 = ""; // string variable who answer for first question
    String answerText2 = "";
    String answerText3 = "";
    String answerText4 = "";
    String answerText5 = "";

    public final static String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        doWork();
        showVideo();
        initRadioGroup1();
        initRadioGroup2();
initRadioGroup3();

    }

    /**
     *
     */
    public void initRadioGroup1() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case -1:
                        answerText1 = "Nothing";
                        answerOnequest = 0;
                        break;
                    case R.id.radio_one:

                        answerText1 = "Barak Obama is incorrect answer";
                        answerOnequest = 0;
                        break;

                    case R.id.radio_two:
                        answerText1 = "Donald Tramp is correct answer";
                        answerOnequest = 1;
                        break;


                    case R.id.radio_three:
                        answerText1 = "John F.Kennedy is incorrect answer";
                        answerOnequest = 0;
                        break;
                    case R.id.radio_four:
                        answerText1 = "Nelson Rockfeller is incorrect answer";
                        answerOnequest = 0;
                        break;
                }
            }

        });

    }

    /**
     *
     */
    public void initRadioGroup2() {
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroups);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group1, int checkedId1) {

                switch (checkedId1) {
                    case -1:
                        answerText2 = "Nothing";
                        answerTwoquest = 0;
                        break;

                    case R.id.radio_one1:
                        answerTwoquest = 0;
                        answerText2 = "Winter is incorrect answer";
                        break;

                    case R.id.radio_two1:
                        answerTwoquest = 0;
                        answerText2 = "Summer is incorrect answer";
                        break;

                    case R.id.radio_three1:

                        answerTwoquest = 0;
                        answerText2 = "Spring is incorrect answer";
                        break;


                    case R.id.radio_four1:

                        answerTwoquest = 1;
                        answerText2 = "Autumn is correct answer";
                        break;

                }
            }

        });
    }

    /**
     *
     */
    public void initRadioGroup3(){
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group1, int checkedId1) {

                switch (checkedId1) {
                    case -1:
                        answerText5 = "Nothing";
                        answerFifthquest = 0;
                        break;

                    case R.id.radio_one2:
                        answerFifthquest = 1;
                        answerText5 = "Bill Gates is correct answer";
                        break;

                    case R.id.radio_two2:
                        answerFifthquest = 0;
                        answerText2 = "Michael Bloomberg is incorrect answer";
                        break;

                    case R.id.radio_three2:

                        answerFifthquest = 0;
                        answerText2 = "Carlos Slim Helu is incorrect answer";
                        break;


                    case R.id.radio_four2:

                        answerFifthquest = 0;
                        answerText2 = "Warren Buffet is incorrect answer";
                        break;

                }
            }

        });

    }


    /**
     *
     */
    public void doWork() {
        try {
            TextView txtCurrentTime = (TextView) findViewById(R.id.editText);
            Calendar c = Calendar.getInstance();
            String curTime = "Now is : " + c.get(Calendar.YEAR) + "-"
                    + c.get(Calendar.MONTH)
                    + "-" + c.get(Calendar.DAY_OF_MONTH)
                    + " at " + c.get(Calendar.HOUR_OF_DAY)
                    + ":" + c.get(Calendar.MINUTE);
            txtCurrentTime.setText(curTime);
        } catch (Exception e) {
        }
    }

    /**
     *
     */
    public void showVideo() {
        try {
            ImageView imageView = (ImageView) findViewById(R.id.gigshow);
            GlideDrawableImageViewTarget loadingImageViewTarget = new GlideDrawableImageViewTarget(imageView);
            Glide.with(this).load(R.raw.asqw).into(loadingImageViewTarget);
        } catch (Exception e) {
        }


    }

    /**
     * @param view
     */
    ////////////////////////
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
       boolean checkedNext = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_airbus:
                if (checkedNext) {
                    answerThreequest += 0.3;
                    answerText3 += "\n Airbus  is correct answer";
                    break;
                } else
                    answerThreequest -= 0.3;
                answerText3 = "-";
                break;

            case R.id.checkbox_boeng:
                if (checkedNext) {
                    answerThreequest += 0.3;
                    answerText3 += "\n Boeing  is correct answer";
                    break;
                } else
                    answerText3 = "-";
                answerThreequest -= 0.3;
                break;
            case R.id.checkbox_cessna:
                if (checkedNext) {
                    answerThreequest += 0.4;
                    answerText3 += "\n Cessna  is correct answer";
                    break;
                } else
                    answerText3 = "-";
                answerThreequest -= 0.4;
                break;
            case R.id.checkbox_ford:
                if (checkedNext) {
                    answerThreequest = 0;
                    answerText3 += "\n Ford  is incorrect answer";
                    break;
                } else
                    answerText3 = "-";
                break;

        }
    }


//

    /**
     * @param view
     */

    public void onSwitchClicked(View view) {
      boolean  on=((Switch)view).isChecked();
        if (on) {
            answerFourquest = 1;
            answerText4 = "Yes, it is 'Back to the future' movie";
        } else {
            answerFourquest = 0;
            answerText4 = "No ,it isn't 'Back to the future' movie";
            ;
        }
    }


    /**
     * @return
     */
    public String createFinalReport() {
        EditText editText = (EditText) findViewById(R.id.name_text);

        String currentName = editText.getText().toString();

        if (currentName.isEmpty()) {
            currentName += "Nobody";
        }


        finalAnswer = answerOnequest + answerTwoquest + answerThreequest + answerFourquest+answerFifthquest;
       float incorrectAnswer = 5 - finalAnswer;

        String finalString = " Hello - " + currentName;
        finalString += "\n Your result : ";
        finalString += "\n First question :" +answerText1;
        finalString += "\n Second question :" +answerText2;
        finalString += "\n Third question :" +answerText3;
        finalString += "\n Fourth question :" +answerText4;
        finalString += "\n Fifth question :" +answerText5;
        finalString += "\n Correct answers :  " +finalAnswer;
        finalString += "\n Incorrect answers :  " +incorrectAnswer;
        return finalString;
    }



    public void stopQuiz(View view) {

        Intent intent=new Intent(this,DisplayResultActivity.class);
        intent.putExtra(EXTRA_MESSAGE,createFinalReport());
        startActivity(intent);
    }



}


