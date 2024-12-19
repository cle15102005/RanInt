package ranint.hieu.statistic;
public class Degree {
    public String Certificate(float CPA){
        String cf = "";
        if (CPA < 1){
            cf = "Weak";
        }else if(CPA>= 1 && CPA <= 1.99f){
            cf = "Below Average";
        }else if(CPA >= 2 && CPA <= 2.49f){
            cf = "Average";
        }else if(CPA >= 2.5f && CPA <= 3.19f){
            cf = "Good";
        }else if( CPA >= 3.2f && CPA <= 3.59f){
            cf = "Great";
        }else if(CPA >= 3.6f){
            cf = "Excellent";
        }
        return cf;
    }
}
