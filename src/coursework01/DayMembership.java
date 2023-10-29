package coursework01;
import java.time.LocalTime;
//Дневной абонемент
class DayMembership extends Membership
{
    private LocalTime startTime;
    private LocalTime endTime;

    public DayMembership(String number, Personality personality)
    {
        super(number, personality);
        this.startTime = LocalTime.of(8, 0);
        this.endTime = LocalTime.of(16, 0);
    }
}

