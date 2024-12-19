package ranint.hieu.statistic;
public class SaveGame extends Information{
    public SaveGame(int HP,float CPA, int Currency, int Level, int Arc, int Year, int Credit, int TotalCredit, String age, String name, String cLass){
        super(HP,CPA,Currency,Level,Arc,Year,Credit,TotalCredit,age,name,cLass);
    }
    public int saveHP(int HP){
        int svHP = HP;
        return svHP;
    }
    public float saveCPA(float CPA){
        float svCPA = CPA;
        return svCPA;
    }
    public int saveCurrency(int Currency){
        int svCurrency = Currency;
        return svCurrency;
    }
    public int saveLevel(int Level){
        int svLevel = Level;
        return svLevel;
    }
    public int saveArc(int Arc){
        int svArc = Arc;
        return svArc;
    }
    public int saveYear( int Year){
        int svYear = Year;
        return svYear;
    }
    public int saveCredit(int Credit){
        int svCredit = Credit;
        return svCredit;
    }
    public int saveTotalCredit(int TotalCredit){
        int svTotalCredit = TotalCredit;
        return svTotalCredit;
    }
    public String saveage(String age){
        String svage = age;
        return svage;
    }
    public String savename(String name){
        String svname = name;
        return svname;
    }
    public String saveclass(String cLass){
        String svclass = cLass;
        return svclass;
    }

}