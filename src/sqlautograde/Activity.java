package sqlautograde;

import java.util.Date;

public class Activity {
    private int idResult;
    private int idQuestion;
    private int idAnswer;
    private java.util.Date date;
    private boolean predict;

    public Activity(int idQuestion, int idAnswer, Date date, boolean predict) {
        this.idQuestion = idQuestion;
        this.idAnswer = idAnswer;
        this.date = date;
        this.predict = predict;
      
    }
    
    public boolean getPredict() {
        return predict;
    }
    
    public void setPredict() {
        this.predict = predict;
    }
}
