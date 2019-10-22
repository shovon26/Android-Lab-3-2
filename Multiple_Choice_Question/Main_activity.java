package com.example.mutiplechoicequestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView,mQuestionView;

    private Button mbtnchoice1,mbtnchoice2,mbtnchoice3,mquit;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = findViewById(R.id.score);
        mQuestionView=findViewById(R.id.question);
        mbtnchoice1 = findViewById(R.id.choice1);
        mbtnchoice2 = findViewById(R.id.choice2);
        mbtnchoice3 = findViewById(R.id.choice3);
        mquit = findViewById(R.id.choice4);

        public void updateQuestion();
        public void updateScore(int point);

        mbtnchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mbtnchoice1.getText()==mAnswer){
                mScore+=1;
                    updateScore(mAnswer);
                    updateQuestion();

                    Toast.makeText("Correct",.show("Correct");)
            }

        });

    }

    public void updateQuestion(){
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mbtnchoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mbtnchoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mbtnchoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

            mAnswer=mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }

        private void updateScore(int point){
            mScoreView.setText(""+mScore);
        }
}
