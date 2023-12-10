package coursework02;

import java.io.*;
import java.util.*;
// GameApp - главный класс приложения, запускающий игру и управляющий взаимодействием с пользователем.
public class GameApp {
    private GameSession session;
    private MainMenu mainMenu;
    private Scanner scanner;

    public GameApp()
    {
        scanner = new Scanner(System.in);
        session = new GameSession();
        mainMenu = new MainMenu(scanner, session);
    }

    // Инициализация игры с текстами параграфов и выборами
    private void initGame()
    {
        Paragraph paragraph1 = new Paragraph(
                "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением. " +
                        "Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. " +
                        "\"Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\" - подумал Лисёнок. Как поступить Лисенку?",
                false
        );
        paragraph1.addOption(2, "Вернуться домой");
        paragraph1.addOption(3, "Отправиться на поиски");

        session.addParagraph(1, paragraph1);

        Paragraph paragraph2 = new Paragraph(
                "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. " +
                        "Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! Игра завершилась успехом",
                true // Этот параграф означает конец игры
        );
        session.addParagraph(2, paragraph2);

        Paragraph paragraph3 = new Paragraph(
                "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. " +
                        "Но вдруг кто-нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.",
                false
        );
        paragraph3.addOption(4, "Попытаться разузнать о Бельчонке у лесных жителей");
        paragraph3.addOption(5, "Искать Бельчонка в одиночку");

        session.addParagraph(3, paragraph3);

        Paragraph paragraph4 = new Paragraph(
                "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. " +
                        "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?",
                false
        );
        paragraph4.addOption(6, "Расспросить Сову");
        paragraph4.addOption(7, "Расспросить Волка");

        session.addParagraph(4, paragraph4);

        Paragraph paragraph5 = new Paragraph(
                "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. " +
                        "Теперь его самого нужно искать. Игра завершилась неудачей",
                false
        );

        session.addParagraph(5, paragraph5);

        Paragraph paragraph6 = new Paragraph(
                "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. " +
                        "Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.",
                false
        );
        paragraph6.addOption(8, "Поверить Сове и отправиться вглубь леса");
        paragraph6.addOption(9, "Сове не стоит верить -> Искать Бельчонка в одиночку");

        session.addParagraph(6, paragraph6);

        Paragraph paragraph7 = new Paragraph(
                "Волк оказался вполне дружелюбным, но помочь не смог. " +
                        "Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?",
                false
        );
        paragraph7.addOption(10, "Волк прав -> Вернуться домой");
        paragraph7.addOption(11, "Искать Бельчонка в одиночку");

        session.addParagraph(7, paragraph7);

        Paragraph paragraph8 = new Paragraph(
                "В глубине леса Лисёнок встретил Медвежонка. " +
                        "Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.",
                false
        );
        paragraph8.addOption(12, "Нет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку");
        paragraph8.addOption(13, "Нужно воспользоваться шансом и раздобыть мёд");


        session.addParagraph(8, paragraph8);

        Paragraph paragraph9 = new Paragraph(
                "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел." +
                        " Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.",
                false
        );
        paragraph9.addOption(14, "Подождать, вдруг пчёлы улетят");
        paragraph9.addOption(15, "Нужно попытаться выкрасть мёд немедленно");

        session.addParagraph(9, paragraph9);

        Paragraph paragraph10 = new Paragraph(
                "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел." +
                        " Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.",
                false
        );
        paragraph10.addOption(16, "Подождать, вдруг пчёлы улетят");
        paragraph10.addOption(17, "Нужно попытаться выкрасть мёд немедленно");

        session.addParagraph(10, paragraph10);

        Paragraph paragraph11 = new Paragraph(
                "Лисёнок подождал немного, и пчёлы разлетелись." +
                        " Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?",
                false
        );
        paragraph10.addOption(18, "Подождать, вдруг пчёлы улетят");
        paragraph10.addOption(19, "Нужно попытаться выкрасть мёд немедленно");

        session.addParagraph(11, paragraph11);

        Paragraph paragraph12 = new Paragraph(
                "Это была не лучшая идея. " +
                        "Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. Игра завершилась неудачей",
                false
        );

        session.addParagraph(12, paragraph12);

        Paragraph paragraph13 = new Paragraph(
                "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его." +
                        " Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей",
                false
        );

        session.addParagraph(13, paragraph13);

        Paragraph paragraph14 = new Paragraph(
                "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. " +
                        "Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой",
                false
        );
        paragraph14.addOption(20, "Медвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку");
        paragraph14.addOption(21, "Может быть он прав и Лисёнок просто паникует -> Вернуться домой");

    }

    // Инициализация команд для главного меню
    private void initCommands()
    {
        // Начать игру
        mainMenu.addCommand("Начать игру", () ->
        {
            session.setCurrentPlayer("player1"); // имя пользователя и пароль в обозримом будущем
            session.setCurrentParagraphNumber(1); // Начало игры с первого параграфа?
            playGame();
        });

        // Вернуться к игре
        mainMenu.addCommand("Вернуться к игре", () ->
        {
            if (!FileManager.loadGame(session))
            {
                System.out.println("Нет сохраненной игры для текущего пользователя.");
                return;
            }
            playGame();
        });

        // Выйти из игры
        mainMenu.addCommand("Выйти из игры", () ->
        {
            System.out.println("Выход из игры.");
            session.stopGame();
        });

        // Сохранить игру
        mainMenu.addCommand("Сохранить игру", () ->
        {
            FileManager.saveGame(session);
            System.out.println("Игра сохранена.");
        });

        // Загрузить игру
        mainMenu.addCommand("Загрузить игру", () ->
        {
            if (FileManager.loadGame(session))
            {
                System.out.println("Игра загружена.");
                playGame();
            }
            else
            {
                System.out.println("Не удалось загрузить игру.");
            }
        });
    }


    private void playGame() //Отображение параграфов и выбора пользователя
    {
        while (session.isGameRunning())
        {
            Paragraph currentParagraph = session.getCurrentParagraph();
            System.out.println(currentParagraph.getText());
            currentParagraph.getOptions().forEach((number, option) ->
            {
                System.out.println(number + ". " + option);
            });
            System.out.print("Выберите вариант или введите '0' для выхода в главное меню: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистить буфер после ввода числа

            if (choice == 0)
            {
                // Возврат в главное меню
                return;
            }
            else if (currentParagraph.getOptions().containsKey(choice))
            {
                if (currentParagraph.isEnd())
                {
                    System.out.println("Игра окончена.");
                    session.stopGame();
                }
                else
                {
                    // Переход к выбранному параграфу
                    session.setCurrentParagraphNumber(choice);
                }
            }
            else
            {
                System.out.println("Неизвестный выбор, попробуйте снова.");
            }
        }
    }

    public static void main(String[] args)
    {
        GameApp app = new GameApp();
        app.initGame(); // База игры
        app.initCommands(); // Команды меню
        app.mainMenu.show(); // Отображение главного меню
    }
}