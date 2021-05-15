package com.company;

public class QuizCard {
    String question;
    String answer;

    QuizCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    String getQuestion() {
        return question;
    }

    String getAnswer( ) {
        return answer;
    }
}
