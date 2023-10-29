package coursework01;
import java.time.LocalDate;
import java.time.LocalTime;
//Класс ClubManager управляет абонементами и отслеживает посетителей в каждой зоне фитнес-клуба.
// В нём прописал массивы  для тренажерного зала, бассейна и групповых занятий.
class ClubManager
{
    private Membership[] gymMemberships;
    private Membership[] poolMemberships;
    private Membership[] groupClassMemberships;

    public ClubManager()
    {
        this.gymMemberships = new Membership[20];
        this.poolMemberships = new Membership[20];
        this.groupClassMemberships = new Membership[20];
    }

    public void addMembershipToZone(String zone, Membership membership)
    {
        switch (zone)
        {
            case "gym":
                addMembershipToZoneHelper(gymMemberships, membership, "тренажерный зал");
                break;
            case "pool":
                addMembershipToZoneHelper(poolMemberships, membership, "бассейн");
                break;
            case "groupClass":
                addMembershipToZoneHelper(groupClassMemberships, membership, "групповые занятия");
                break;
            default:
                System.out.println("Ошибка зоны посещения");
        }
    }

    private void addMembershipToZoneHelper(Membership[] memberships, Membership membership, String zoneName) //Метод добавляет абонемент в одну из зон
    //Проверяю следующие условия:
    //1.Может ли абонемент получить доступ к желаемой зоне и есть ли в ней свободные места.
    //2.Является ли абонемент просроченным.
    //3.зарегистрирован ли абонемент уже в одной из зон.
    //Если все условия выполняются, абонемент добавляется в выбранную зону,
    //а в консоль выводится информация о посетителе и дате и времени его посещения.
    //В противном случае выводится ошибка.
    {
        if (membershipHasAccessToZone(membership, memberships) && zoneHasCapacity(memberships))
        {
            for (int i = 0; i < memberships.length; i++)
            {
                if (memberships[i] == null)
                {
                    memberships[i] = membership;
                    System.out.println(membership.getOwner().getLastName() + " " + membership.getOwner().getFirstName() + " " + zoneName);
                    System.out.println("Дата и время посещения: " + LocalDate.now() + " " + LocalTime.now());
                    break;
                }
            }
        }
        else
        {
            System.out.println("Отказ в доступе для " + membership.getOwner().getLastName() + " " + membership.getOwner().getFirstName() + " в зону " + zoneName);
        }
    }

    private boolean membershipHasAccessToZone(Membership membership, Membership[] memberships)
    {
        for (Membership existingMembership : memberships)
        {
            if (existingMembership != null && existingMembership.getOwner().equals(membership.getOwner()))
            {
                return false;
            }
        }
        return true;
    }

    private boolean zoneHasCapacity(Membership[] memberships)
    {
        int count = 0;
        for
        (Membership membership : memberships)
        {
            if (membership != null)
            {
                count++;
            }
        }
        return count < 20;
    }
    public void printCurrentVisitors() //выводит информацию о текущих посетителях каждой зоны.
    {
        System.out.println("Посетители тренажерного зала:");
        printVisitors(gymMemberships);

        System.out.println("Посетители бассейна:");
        printVisitors(poolMemberships);

        System.out.println("Посетители групповых занятий:");
        printVisitors(groupClassMemberships);
    }

    private void printVisitors(Membership[] memberships)
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


