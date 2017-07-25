package sqlautograde;

public class Answer {
    private int idCucian;
    private int berat;
    
    public Answer(int berat) {
        this.berat = berat;
    }    
        
    public Answer(int id, int berat){
        idCucian = id;
        this.berat = berat;
    }

    public void setId(int id){
        idCucian = id;
    }
    
    public int getId(){
        return idCucian;
    }
    
    public void setBerat(int berat){
        this.berat = berat;
    }
    
    public int getBerat(){
        return berat;
    }
}
