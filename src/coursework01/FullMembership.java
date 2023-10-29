package coursework01;
import java.time.LocalTime;
//Полный абонемент
class FullMembership extends Membership
{
    private LocalTime startTime;
    private LocalTime endTime;

    public FullMembership(String number, Personality personality)
    {
        super(number, personality);
        this.startTime = LocalTime.of(8, 0);
        this.endTime = LocalTime.of(22, 0);
    }
}

