package ru.mirea.lab4;

public enum Season {
    WINTER(-10),
    SPRING(8),
    SUMMER(22) {
        @Override
        public String getDescription() {   // переопределение только для лета
            return "Теплое время года";
        }
    },
    AUTUMN(7);

    private final int averageTemperature;

    Season(int averageTemperature) {   // конструктор enum всегда private
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}