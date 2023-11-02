package coursework01;
import java.time.LocalDate;
import java.time.LocalTime;

//Абонемент в зал
class GymMembership extends Membership
{
    private LocalTime startTime;
    private LocalTime endTime;

    public GymMembership(String number, Personality personality)
    {
        super(number, personality);
        this.startTime = LocalTime.of(8, 0);
        this.endTime = LocalTime.of(22, 0);
    }

    public void ExpirationDate(LocalDate expirationDate)
    {
        if (expirationDate == null)
        {
            throw new IllegalArgumentException("Дата окончания не может быть null");
        }
        if (expirationDate.isBefore(LocalDate.now()))
        {
            throw new IllegalArgumentException("Дата окончания не может быть в прошлом");
        }
        if(expirationDate.getYear()> LocalDate.now().getYear() + 5)
        {
            throw new IllegalArgumentException("Дата окончания должна быть в течении ближайших 5 лет");
        }

        this.expirationDate = expirationDate;
    }
}

