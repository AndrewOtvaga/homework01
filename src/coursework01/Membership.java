package coursework01;
//Здесь содержатся общие свойства всем типов абонементов
import java.time.LocalDate;
import java.time.LocalTime;


class Membership
{
    //id и owner инфа о валдельце
    private String id;
    private Personality owner;
    private LocalDate expirationDate;
    private TypeOfMember typeOfMember;

    public Membership(String id, Personality owner)
    {
        this.id = id;
        this.owner = owner;
    }

    public String getId()
    {
        return id;
    }

    public Personality getOwner()
    {
        return owner;
    }

    public LocalDate getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate)//дата истечения срока
    {
        this.expirationDate = expirationDate;
    }

    public TypeOfMember getTypeOfMember()
    {
        return typeOfMember;
    }

    public void setTypeOfMember(TypeOfMember typeOfMember)
    {
        this.typeOfMember = typeOfMember;
    }
}