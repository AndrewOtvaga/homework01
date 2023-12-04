package coursework02;

import java.io.*;
import java.util.*;
// Класс, представляющий состояние игры
class GameSession
{
    private String currentPlayer;
    private int currentParagraphNumber;
    private Map<Integer, Paragraph> paragraphs;
    private boolean gameRunning;

    public GameSession()
    {
        paragraphs = new HashMap<>();
        gameRunning = true;
    }

    public void setCurrentPlayer(String currentPlayer)
    {
        this.currentPlayer = currentPlayer;
    }

    public String getCurrentPlayer()
    {
        return currentPlayer;
    }

    public void setCurrentParagraphNumber(int paragraphNumber)
    {
        this.currentParagraphNumber = paragraphNumber;
    }

    public int getCurrentParagraphNumber()
    {
        return currentParagraphNumber;
    }

    public void addParagraph(int number, Paragraph paragraph)
    {
        paragraphs.put(number, paragraph);
    }

    public Paragraph getCurrentParagraph()
    {
        return paragraphs.get(currentParagraphNumber);
    }

    public boolean isGameRunning()
    {
        return gameRunning;
    }

    public void stopGame()
    {
        gameRunning = false;
    }
}