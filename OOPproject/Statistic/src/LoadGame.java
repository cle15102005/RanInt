public class LoadGame extends Information{
    public LoadGame(int HP,float CPA, int Currency, int Items, int Level, int Arc, int Year, int Credit, int TotalCredit, String age, String name, String cLass){
        super(HP,CPA,Currency,Level,Arc,Year,Credit,TotalCredit,age,name,cLass);
    }
    public int loadHP(int svHP){
        int HP = svHP;
        return HP;
    }
    public float loadCPA(float svCPA){
        float CPA = svCPA;
        return CPA;
    }
    public int loadCurrency(int svCurrency){
        int Currency = svCurrency;
        return Currency;
    }
    public int loadLevel(int svLevel){
        int Level = svLevel;
        return Level;
    }
    public int loadArc(int svArc){
        int Arc = svArc;
        return Arc;
    }
    public int loadYear( int svYear){
        int Year = svYear;
        return Year;
    }
    public int loadCredit(int svCredit){
        int Credit = svCredit;
        return Credit;
    }
    public int loadTotalCredit(int svTotalCredit){
        int TotalCredit = svTotalCredit;
        return TotalCredit;
    }
    public String loadage(String svage){
        String age = svage;
        return age;
    }
    public String loadname(String svname){
        String name = svname;
        return name;
    }
    public String loadclass(String svclass){
        String cLass = svclass;
        return cLass;
    }
}
