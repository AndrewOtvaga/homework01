package coursework01;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//Теперь заместо списка отдельных классов используется список memberships для хранения всех абонементов
//Метод addMembershipToZone принимает на вход два параментра TypeOfMember и Membership
//И проверяет, не зарегистрирован ли уже абонемент в какой-либо зоне
//
public class ClubManager {
    private List<Membership> memberships;//список абонементов

    public ClubManager() {
        this.memberships = new ArrayList<>();
    }

    public void addMembershipToZone(TypeOfMember typeOfMember, Membership membership) {
        if (membership.getTypeOfMember() != null) {
            System.out.println("Абонемент уже зарегистрирован");
            return;
        }

        membership.setTypeOfMember(typeOfMember);
        memberships.add(membership);
    }

    public void printCurrentVisitors() //текущие посетители
    {
        for (Membership membership : memberships)
        {
            if (membership != null)
            {
                System.out.println(membership.getOwner().getLastName() + " " + membership.getOwner().getFirstName());
                System.out.println("Дата и время посещения: " + LocalDate.now() + " " + LocalTime.now());
            }
        }
    }
}

