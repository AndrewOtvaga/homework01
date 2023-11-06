package coursework01;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//Класс ClubManager управляет абонементами и отслеживает посетителей в каждой зоне фитнес-клуба.
// В нём прописал массивы для тренажерного зала, бассейна и групповых занятий.
public class ClubManager
{
    private List<Membership> memberships;

    public ClubManager()
    {
        memberships = new ArrayList<>();
    }

    public void addMembershipToZone(String zone, Membership membership)
    {
        // Проверяем, не зарегистрировано ли уже абонемент в этой зоне
        for (Membership existingMembership : memberships)
        {
            if (existingMembership.getTypeOfMember().getZone().equals(zone))
            {
                System.out.println("Абонемент уже зарегистрирован в этой зоне.");
                return;
            }
        }

        // Устанавливаем тип абонемента
        TypeOfMember typeOfMember;
        if (zone.equals("gym"))
        {
            typeOfMember = new TypeOfMember(LocalTime.of(6, 0), LocalTime.of(22, 0), zone);
        }
        else if (zone.equals("pool"))
        {
            typeOfMember = new TypeOfMember(LocalTime.of(9, 0), LocalTime.of(18, 0), zone);
        }
        else
        {
            System.out.println("Неизвестная зона.");
            return;
        }

        membership.setTypeOfMember(typeOfMember);
        memberships.add(membership);
    }

    public void printCurrentVisitors()
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

