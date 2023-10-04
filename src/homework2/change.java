package homework2;

public class change {
    public static void main(String[] args) {
                int x = 7; //рандомное число x
                int y = 5; //рандомное число y

        //попробую ниже навести красоту видел такое в хекслете//
                System.out.println("Было:");
                System.out.println("x = " + x);
                System.out.println("y = " + y);

                // Меняю значения местами
                x = x + y;
                y = x - y;
                x = x - y;

                // Вывожу результата
                System.out.println("Стало:");
                System.out.println("a = " + x);
                System.out.println("b = " + y);
            }
        }



