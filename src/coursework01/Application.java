package coursework01;
import java.time.LocalDate;
//Здесь создаю экземпляр класса ClubManager и добавляю в него несколько абонементов разных типов
//
public class Application
{
    public static void main(String[] args)
    {
        ClubManager clubManager = new ClubManager();

        Personality personality1 = new Personality("Billy", "Harrington", 1969);
        Personality personality2 = new Personality("Van", "Darkholme", 1972);

        GymMembership gymMembership1 = new GymMembership("001", personality1);
        gymMembership1.setExpirationDate(LocalDate.of(2022, 12, 31));

        DayMembership dayMembership1 = new DayMembership("002", personality2);
        dayMembership1.setExpirationDate(LocalDate.of(2022, 12, 31));

        FullMembership fullMembership1 = new FullMembership("003", personality1);
        fullMembership1.setExpirationDate(LocalDate.of(2022, 12, 31));

        clubManager.addMembershipToZone("gym", gymMembership1);
        clubManager.addMembershipToZone("gym", gymMembership1); // Should be rejected because membership is already registered in gym
        clubManager.addMembershipToZone("pool", dayMembership1);
        clubManager.addMembershipToZone("pool", fullMembership1); // Should be rejected because full membership does not have pool access

        clubManager.printCurrentVisitors();
    }
}