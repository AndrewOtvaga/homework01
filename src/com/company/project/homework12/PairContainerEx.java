package com.company.project.homework12;

public class PairContainerEx
{
    PairContainer<Integer, String> pair1 = new PairContainer<>(123, "строка");
    class User {
        private int id;

        public User(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    PairContainer<String, User> pair2 = new PairContainer<>("ключ", new User(456));

    PairContainer<String, PairContainer<Integer, User>> pair3 = new PairContainer<>("ключ", new PairContainer<>(789, new User("идентификатор")));

}
