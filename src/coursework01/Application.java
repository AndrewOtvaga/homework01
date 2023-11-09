package coursework01;
import java.time.LocalDate;
//Созданы объекты класса Membership вместо классов GymMembership, DayMembership и FulLMembership
//Добавил метод setExpirationDate
class Application {
    public static void main(String[] args) {
        ClubManager clubManager = new ClubManager();

        Personality personality1 = new Personality("Billy", "Harrington", 1969);
        Personality personality2 = new Personality("Van", "Darkholme", 1972);

        Membership gymMembership1 = new Membership("001", personality1);
        gymMembership1.setExpirationDate(LocalDate.of(2022, 12, 31));

        Membership dayMembership1 = new Membership("002", personality2);
        dayMembership1.setExpirationDate(LocalDate.of(2022, 12, 31));

        Membership fullMembership1 = new Membership("003", personality1);
        fullMembership1.setExpirationDate(LocalDate.of(2022, 12, 31));

        clubManager.addMembershipToZone(TypeOfMember.GYM, gymMembership1);
        clubManager.addMembershipToZone(TypeOfMember.GYM, gymMembership1); // Will be rejected as the membership is already registered in the gym
        clubManager.addMembershipToZone(TypeOfMember.POOL, dayMembership1);
        clubManager.addMembershipToZone(TypeOfMember.POOL, fullMembership1); // Will be rejected as the full membership does not provide access to the pool

        clubManager.printCurrentVisitors();
    }
}