package ru.oop.task3;

/**
 * Класс, представляющий машину как транспортное средство
 */
public class Car implements Transport {
    /**
     * Создать экземпляр машины и посадить в нее персону
     */
    public Car(Person person) {}

    @Override
    public void moveTo(Position position) {}

    @Override
    public Position getPosition() {}
}
