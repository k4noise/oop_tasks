package ru.oop.task3;


/**
 * Машина
 */
public class Car implements Transport {
    /**
     * Установить связь между машиной и персоной
     */
    public Car(Person person) {}

    /**
     * Отвезти персону на машине в наиболее близкое к возможному месту.
     * После завершения поездки у персоны будет изменена позиция.
     */
    @Override
    public void moveTo(Position position) {}

    /**
     * Вернуть местоположение машины
     */
    @Override
    public Position getPosition() {}
}
