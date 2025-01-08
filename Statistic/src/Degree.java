public class Degree {
    Information Degree;
    public String Certificate(Information CPArls){
        float CPA = CPArls.getCPA();
        String cf = "";
        if (CPA < 1f){
            cf = "Weak";
        }else if(CPA>= 1f && CPA <= 1.99f){
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

