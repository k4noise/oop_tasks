package ru.oop.task3;

/**
 * Класс, представляющий автобус как транспортное средство
 */
public class Bus implements Transport {
    /**
     * Создать экземпляр автобуса и посадить в него персону
     */
    public Bus(String busNumber, Person person) {}

    @Override
    public void moveTo(Position position) {}

    @Override
    public Position getPosition() {}
}
