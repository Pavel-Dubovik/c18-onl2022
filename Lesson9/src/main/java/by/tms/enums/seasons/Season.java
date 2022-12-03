package by.tms.enums.seasons;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public enum Season {
    WINTER("Зима", -15),
    SPRING("Весна", 15),
    SUMMER("Лето", 22) {
        @Override
        public String getDescription() {
            return "теплое время года";
        }
    },
    AUTUMN("Осень", 10);

    private final String name;
    private final int averageTemperature;

    Season(String name, int averageTemperature) {
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        return "холодное время года";
    }
}
