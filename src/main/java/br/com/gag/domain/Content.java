package br.com.gag.domain;

public sealed abstract class Content permits Course, Mentorship {
    protected final double  DEFAULT_XP = 10d;
    private final String name;
    private final String description;
    private final int workload;
    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    public int getWorkload() {
        return workload;
    }

    public Content(String name, String description, int workload) {
        this.name = name;
        this.description = description;
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", workload=" + workload + '\'' +
                "}";
    }

    protected abstract double xpCalculation();
}
