package coursework01;

//Класс Personality - это владелец абонемента с личными данными,
// имя, фамилия и год рождения.
public class Personality
{
        private String firstName;
        private String lastName;
        private int birthYear;

        public Personality(String firstName, String lastName, int birthYear)
        //добавил проверки на Имя, Фамилию, Год рождения
        {
            if (firstName == null || firstName.length() < 2)
                throw new IllegalArgumentException("Чё у тебя за имя-то такое?");
            if (lastName == null || lastName.length() < 2)
                throw new IllegalArgumentException("Чё у тебя за фамилия такая?");
            if (birthYear < 2005)
                throw new IllegalArgumentException("Подрастёшь, приходи");
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
        }
        //Геттеры/сеттеры

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }
}


