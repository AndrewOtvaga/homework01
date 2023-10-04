package homework2;

public class letters {
    public static void main(String[] args) {
        int allLetters = 10; // задал значение всех писем
        int sendingLetters = 5; //задал значение отправленных
        int mustToSend = allLetters - sendingLetters; // формула для результата
        System.out.println("необходимо отправить еще: " + mustToSend + " писем");
    }
}
