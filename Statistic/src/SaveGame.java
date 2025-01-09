
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveGame{
    
    public static void save(Information gameState,String filename){
        try (FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(gameState);
            System.out.println("Game saved");
            }catch(IOException i){
                i.printStackTrace();
            }
    }

}
