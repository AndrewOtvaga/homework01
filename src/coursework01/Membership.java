package coursework01;
import java.time.LocalDate;
//Из всех названий абонемента на английском - это самое звучное
//Класс Membership является абстрактным классом(но в целом может быть и обычным public- работать будет),
// который представляет абонемент и содержит общие свойства, такие как номер, дата регистрации и дата окончания регистрации.
// Он также содержит ссылку на владельца абонемента
abstract class Membership
{
        private String number;
        private LocalDate registrationDate;
        public LocalDate expirationDate;
        private Personality personality;

        public Membership(String number, Personality personality)
        {
            this.number = number;
            this.personality = personality;
            this.registrationDate = LocalDate.now();
        }

        public void setExpirationDate(LocalDate expirationDate)
        {
            this.expirationDate = expirationDate;
        }

        public Personality getOwner()
        {
            return personality;
        }
}


