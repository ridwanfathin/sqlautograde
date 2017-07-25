/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlautograde;

/**
 *
 * @author M Ridwan Fathin
 */
public class Question {
    private String qText;
    private String query;
    private String result;
    private int qId;
    private int examId;
    
    public Question(int qId, String qText, String query, String result , int examId) {
        this.examId = examId;
        this.query = query;
        this.qText = qText;
        this.result = result;
    }
    
    public Question(int qId, String qText, String query) {
        this.query = query;
        this.qText = qText;
        this.qId = qId;
    }
    
    public int getQId() {
        return qId;
    }

    public void setQId(int qId) {
        this.qId = qId;
    }
    
    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
     public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
     public String getQText() {
        return qText;
    }

    public void setQText(String qText) {
        this.qText = qText;
    }
}
