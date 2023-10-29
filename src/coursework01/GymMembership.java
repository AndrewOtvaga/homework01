package coursework01;
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
}

