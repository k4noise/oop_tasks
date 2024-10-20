package ru.oop.task3;

/**
 * Транспорт
 */
public interface Transport extends Positioned {
    /**
     * Отвезти персону на транспорте в наиболее близкое к возможному месту.
     * После завершения поездки у персоны будет изменена позиция.
     */
    public void moveTo(Position position);
}
