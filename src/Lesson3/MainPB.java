package Lesson3;

class MainPB {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add(443827457, "Ivanov");
        phonebook.add(854874747, "Petrov");
        phonebook.add(948729743, "Petrov");
        phonebook.add(214693743, "Kovaleva");
        phonebook.add(139847399, "Frolov");
        phonebook.add(973475793, "Ivanov");

        phonebook.get("Petrov");
        phonebook.get("Smirnov");
    }
}