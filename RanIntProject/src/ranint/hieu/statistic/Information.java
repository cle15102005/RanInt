package ranint.hieu.statistic;

public class Information{
    private int HP;
    private float CPA;
    private int Currency;
    private int Level;
    private int Arc;
    private int Year;
    private int Credit;
    private int TotalCredit;
    private String name;
    private String age;
    private String cLass;
    private float point;
    // private float normalPT;
    // private float componentPT;
    // private float midtermexam;
    // private float finalexam;

    public int getHP() {
        return HP;
    }
    public void setHP(int hp) {
        HP = hp;
    }
    public float getCPA() {
        return CPA;
    }
    public void setCPA(float cpa) {
        CPA = cpa;
    }
    public int getCurrency() {
        return Currency;
    }
    public void setCurrency(int currency) {
        Currency = currency;
    }
    public int getLevel() {
        return Level;
    }
    public void setLevel(int level) {
        Level = level;
    }
    public int getArc() {
        return Arc;
    }
    public void setArc(int arc) {
        Arc = arc;
    }
    public int getYear() {
        return Year;
    }
    public void setYear(int year) {
        Year = year;
    }
    public int getCredit() {
        return Credit;
    }
    public void setCredit(int credit) {
        Credit = credit;
    }
    public int getTotalCredit() {
        return TotalCredit;
    }
    public void setTotalCredit(int totalCredit) {
        TotalCredit = totalCredit;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getcLlass() {
        return cLass;
    }
    public void setcLass(String class1) {
        cLass = class1;
    }
    
    public float getPoint() {
        return point;
    }
    public void setPoint(float point) {
        this.point = point;
    }
    // public float getNormalPT() {
    //     return normalPT;
    // }
    // public void setNormalPT(float normalPT) {
    //     this.normalPT = normalPT;
    // }
    // public float getComponentPT() {
    //     return componentPT;
    // }
    // public void setComponentPT(float componentPT) {
    //     this.componentPT = componentPT;
    // }
    // public float getMidtermexam() {
    //     return midtermexam;
    // }
    // public void setMidtermexam(float midtermexam) {
    //     this.midtermexam = midtermexam;
    // }
    // public float getFinalexam() {
    //     return finalexam;
    // }
    // public void setFinalexam(float finalexam) {
    //     this.finalexam = finalexam;
    // }
    public Information(float point){
        this.point = point;
    }
    public Information(float CPA, int Credit,float point,int TotalCredit){
        this.CPA = CPA;
        this.Credit = Credit;
        this.point = point;
        this.TotalCredit = TotalCredit;
    }
    public Information(int HP,float CPA, int Currency, int Level, int Arc, int Year, int Credit, int TotalCredit, String age, String name, String cLass){
        this.HP = HP;
        this.CPA = CPA;
        this.Currency = Currency;
        this.Level = Level;
        this.Arc = Arc;
        this.Year = Year;
        this.Credit = Credit;
        this.TotalCredit = TotalCredit;
        this.age = age;
        this.name = name;
        this.cLass = cLass;
    }
    
}