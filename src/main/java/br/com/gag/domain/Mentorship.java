package br.com.gag.domain;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public final class Mentorship extends Content {
    private final OffsetDateTime date;

    public Mentorship(String name, String description, int workload, OffsetDateTime date) {
        super(name, description, workload);
        this.date = date;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    @Override
    public double xpCalculation() {
        return DEFAULT_XP * this.getWorkload();
    }

    @Override
    public String toString() {
        return
                "Mentorship" +
                "   {" + "\n" +
                "       name='" + this.getName() + '\'' + ",\n" +
                "       description='" + this.getDescription() + '\'' + ",\n" +
                "       workload=" + this.getWorkload() + '\'' + "\n" +
                "       date=" + this.getDate().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")) + '\'' + "\n" +
                "   }";
    }
}
