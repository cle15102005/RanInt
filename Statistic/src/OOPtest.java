public class OOPtest {
    public void main(String args[]){
        // Statistic character = new Statistic(2.67f,2.41f,9.8f,2,12,13);
        //float convertpoint = 4.0f;
        //System.out.println(convertpoint);

        //int TTCrGPA = character.updateTTCrGPA(character.getCredit(),character.TTCrGPA);
        //System.out.println("GPA credit: " + character.TTCrGPA);
        // System.out.println(character.GPA);
        // System.out.println(character.getCredit());
        // float newGPA = character.calculateGPA(character.GPA,convertpoint,character.getCredit(),character.TTCrGPA);
        // System.out.println("gpa " + newGPA);
        //int TTCrGPA = character.updateTTCrGPA(character.getCredit(),character.TTCrGPA);
        // int TotalCredit = character.updateTotalCredit(character.getTotalCredit(),character.TTCrGPA);
        // System.out.println("total credit " +TotalCredit);

        // float cpa = character.updateCPA(character.getCPA(),character.getGPA(),character.getTotalCredit(),character.getTTCrGPA());
        // System.out.println("cpa "+ cpa);
        // Statistic student = new Statistic(8,25,4,0);
        // float point  = student.calculatecoursePT(student.getNormalPT(),student.getMidtermexam(),student.getFinalexam(),student.getPoint());
        // System.out.println("point "+ point);
        Information gameState = new Information(37,4.0f,56,19,6,2024,24,28,"19","Hung","Cyber");
        SaveGame.save(gameState, "gameState.ser");
        Information loadGameState = LoadGame.load("gameState.ser");
        System.out.println("LoadGame State: "+ loadGameState);
    }
}
