import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadGame {
    public static Information load(String filename) {
        Information gameState = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn)){
            gameState = (Information) in.readObject();
            } catch (IOException i){
                i.printStackTrace();
            } catch (ClassNotFoundException c){
                System.out.println("Statistic class not found");
            }
            return gameState;
    }
}
