package coursework01;

import java.time.LocalDate;
import java.time.LocalTime;

public class Membership
{
    private Personality owner;
    private String membershipId;
    private LocalDate expirationDate;
    private TypeOfMember typeOfMember;

    public Membership(String membershipId, Personality owner)
    {
        this.membershipId = membershipId;
        this.owner = owner;
    }

    public void setExpirationDate(LocalDate expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public void setTypeOfMember(TypeOfMember typeOfMember)
    {
        this.typeOfMember = typeOfMember;
    }

    public Personality getOwner()
    {
        return owner;
    }

    public String getMembershipId()
    {
        return membershipId;
    }

    public LocalDate getExpirationDate()
    {
        return expirationDate;
    }

    public TypeOfMember getTypeOfMember()
    {
        return typeOfMember;
    }
}