package coursework02;

import java.io.*;
import java.util.*;

// Класс для работы с файлами (не работает)
class FileManager
{
    private static final String SAVE_DIR = "saves";

    public static void saveGame(GameSession session)
    {
        File saveDir = new File(SAVE_DIR);
        if (!saveDir.exists())
        {
            saveDir.mkdirs();
        }
        File saveFile = new File(saveDir, session.getCurrentPlayer() + ".txt");
        try (PrintWriter writer = new PrintWriter(saveFile))
        {
            writer.println(session.getCurrentParagraphNumber());
        }
        catch (FileNotFoundException e) {
            System.out.println("Не удалось сохранить игру: " + e.getMessage());
        }
    }

    public static boolean loadGame(GameSession session)
    {
        File saveFile = new File(SAVE_DIR, session.getCurrentPlayer() + ".txt");
        if (saveFile.exists()) {
            try (Scanner scanner = new Scanner(saveFile))
            {
                if (scanner.hasNextInt())
                {
                    session.setCurrentParagraphNumber(scanner.nextInt());
                    return true;
                }
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Не удалось загрузить игру: " + e.getMessage());
            }
        }
        return false;
    }
}
