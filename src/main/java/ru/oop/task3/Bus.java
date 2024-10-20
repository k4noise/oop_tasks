package ru.oop.task3;


/**
 * Машина
 */
public class Bus implements Transport {
    /**
     * Установить связь между автобусом и персоной
     */
    public Bus(String busNumber, Person person) {}

    /**
     * Отвезти персону на автобусе в наиболее близкое к возможному месту.
     * После завершения поездки у персоны будет изменена позиция.
     */
    @Override
    public void moveTo(Position position) {}

    /**
     * Вернуть местоположение автобуса
     */
    @Override
    public Position getPosition() {}
}
