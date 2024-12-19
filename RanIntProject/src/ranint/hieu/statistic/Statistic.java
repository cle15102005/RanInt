package ranint.hieu.statistic;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Statistic extends Information{
    private float GPA;
    private int TTCrGPA;
    private float convertpoint;
    private int balance;
    private float normalPT;
    private float midtermexam;
    private float finalexam;

    public float getGPA() {
        return GPA;
    }
    public void setGPA(float gPA) {
        GPA = gPA;
    }
    public int getTTCrGPA() {
        return TTCrGPA;
    }
    public void setTTCrGPA(int tTCrGPA) {
        TTCrGPA = tTCrGPA;
    }

    public float getNormalPT() {
        return normalPT;
    }
    public void setNormalPT(float normalPT) {
        this.normalPT = normalPT;
    }
    public float getMidtermexam() {
        return midtermexam;
    }
    public void setMidtermexam(float midtermexam) {
        this.midtermexam = midtermexam;
    }
    public float getFinalexam() {
        return finalexam;
    }
    public void setFinalexam(float finalexam) {
        this.finalexam = finalexam;
    }
    public Statistic(float CPA,float GPA, float point, int Credit, int TotalCredit, int TTCrGPA){
        super(CPA,Credit,point,TotalCredit);
        this.TTCrGPA = TTCrGPA;
        this.GPA = GPA;
        
    }
    
    public Statistic(float normalPT, float midtermexam, float finalexam, float point){
        this.normalPT = normalPT;
        this.midtermexam= midtermexam;
        this.finalexam= finalexam;
        super(point);
    }
    
    public float calculatecoursePT(float normalPT, float midtermexam, float finalexam, float point){
        float componentPT;
        componentPT = 2 + normalPT*0.2f + midtermexam*0.6f/3;
        System.out.println("before round: "+ componentPT);
        float a = (float) Math.ceil(componentPT);
        System.out.println(a);
        System.out.println("component- round "+Math.abs(componentPT-a));
        if (Math.abs(componentPT-a) > 0.5){
            componentPT = a - 0.5f;
        }else{
            componentPT = a;
        }
        System.out.println("componentPT "+ componentPT);
        point = 0.5f*(componentPT+finalexam);
        return point;
    }
    public float whatpoints(float point){
        if (point <= 3.9){
            convertpoint = 0;
        }else if (point >= 4 && point <= 4.9){
            convertpoint = 1;
        }else if (point >= 5 && point <= 5.4){
            convertpoint = 1.5f;
        }else if (point >= 5.5 && point <= 6.4){
            convertpoint = 2;
        }else if (point >= 6.5 && point <= 6.9){
            convertpoint = 2.5f;
        }else if (point >= 7 && point <= 7.9){
            convertpoint = 3;
        }else if (point >= 8 && point <= 8.4){
            convertpoint = 3.5f;
        }else if (point >= 8.5){
            convertpoint = 4;
        }
        return convertpoint;
    }
    public int updateTTCrGPA(int Credit, int TTCrGPA){
        return TTCrGPA = TTCrGPA + Credit;
    }
    public float calculateGPA(float GPA,float convertpoint,int Credit,int TTCrGPA){
        int preTTCrGPA = TTCrGPA;
        // System.out.println("preTTCrGPA: "+ preTTCrGPA);
        TTCrGPA = updateTTCrGPA(Credit, TTCrGPA);
        // System.out.println("TTCrGPA: "+ TTCrGPA);
        float preGPA = GPA;
        // System.out.println("preGPA: "+ preGPA);
        return GPA = (preGPA*preTTCrGPA + convertpoint*Credit)/TTCrGPA;
    }
    public int updateTotalCredit(int TotalCredit, int TTCrGPA){
        return TotalCredit = TotalCredit + TTCrGPA;
    }
    public float updateCPA(float CPA, float GPA,int TotalCredit, int TTCrGPA){
        float preCPA = CPA;
        // System.out.println("PreCPA: "+ preCPA);
        int preTotalCredit = TotalCredit;
        // System.out.println("PreTotalCredit: "+ preTotalCredit);
        TotalCredit = updateTotalCredit(TotalCredit, TTCrGPA);
        // System.out.println("total credit: "+ TotalCredit);
        return CPA = (preCPA * preTotalCredit + GPA*TTCrGPA)/TotalCredit;  
    }
    public int updateHP(int HP){
        return HP; // HP = HP after battle
    }
    public int updateCurrency(int Currency){
        return Currency = Currency + balance;  //currency =  currency + bonus 
    }
    public int updateLevel(int Level){
        return Level; // level = completedLV
    }
    
}