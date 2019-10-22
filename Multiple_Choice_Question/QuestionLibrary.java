package com.example.mutiplechoicequestion;

public class QuestionLibrary {

    private String mQuestions[] = {
            "Which part of the planet holds in the soil?",
            "This part of the planet energy in the sun." ,
            "This part of the planet attracts bees",
            "The---holds the planet upright"
    };

    private String mChoice[][]={
            {"Roots","Stem","Flower"},
            {"Fruits","Leaves", "Seeds"},
            {"Bark", "Flower" , "Root"},
            {"Flower", "Leaves","Stem"}
    };

    private String mCorrectAnswer[] = {"Roots","Leaves", "Flower", "Stem"};

    public String getQuestion(int a){
        String q=mQuestions[a];
        return q;
    }

    public String getChoice1(int a)
    {
        String choice0=  mChoice[a][0];
        return choice0;
    }

    public String getChoice2(int a)
    {
        String choice0=  mChoice[a][1];
        return choice0;
    }

    public String getChoice3(int a)
    {
        String choice0=  mChoice[a][2];
        return choice0;
    }

    public String getCorrectAnswer(int a){
        String ans=mCorrectAnswer[a];
        return ans;
    }


}
