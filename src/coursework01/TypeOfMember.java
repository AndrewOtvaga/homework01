//Тип абонемента, который вобрал в себя общие свойства классов
//DayMembership, FullMembership, GymMembership
//startTime и localTime, а также зоны из ClubManager
package coursework01;
import java.time.LocalDate;
import java.time.LocalTime;

class TypeOfMember
{
    private LocalTime startTime;
    private LocalTime endTime;
    private String zone;

    public TypeOfMember(LocalTime startTime, LocalTime endTime, String zone)
    {
        this.startTime = startTime;
        this.endTime = endTime;
        this.zone = zone;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getZone() {
        return zone;
    }
}