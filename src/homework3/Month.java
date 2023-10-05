package homework3;
public class Month
{
    public static void main(String[] args)
    {
        int monthNumber = 4;
        boolean isLeap = true;
//загуглил в каких месяцах сколько дней бывает, вроде достоверная информация
        switch (monthNumber)
        {
            case 1: // Январь
            case 3: // Март
            case 5: // Май
            case 7: // Июль
            case 8: // Август
            case 10: // Октябрь
            case 12: // Декабрь
                System.out.println("В месяце 31 день");
                break;
            case 4: // Апрель
            case 6: // Июнь
            case 9: // Сентябрь
            case 11: // Ноябрь
                System.out.println("В месяце 30 дней");
                break;
            case 2: // Февраль
                if (isLeap)
                {
                    System.out.println("В месяце 29 дней");
                } else
                {
                    System.out.println("В месяце 28 дней");
                }
                break;
            default:
                System.out.println("Неправильный номер месяца");
                break;
        }
    }
}
