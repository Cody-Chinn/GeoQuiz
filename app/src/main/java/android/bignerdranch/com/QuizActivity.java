package android.bignerdranch.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creating the correct toast Toast object
                Toast correctToast = Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT);

                // Setting the Gravity to Top for Challenge One
                correctToast.setGravity(Gravity.TOP, 0, 0);

                //setting message for correct toast
                correctToast.show();

            }
        });

        mFalseButton = findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creating the correct toast Toast object
                Toast incorrectToast = Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT);

                // Setting the Gravity to Top for Challenge One
                incorrectToast.setGravity(Gravity.TOP, 0, 0);

                //setting message for incorrect toast
                incorrectToast.show();
            }
        });

    }
}
