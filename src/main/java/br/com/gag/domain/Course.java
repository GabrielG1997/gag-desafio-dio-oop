package br.com.gag.domain;

public final class Course extends Content {

    public Course(String name, String description, int workload) {
        super(name, description, workload);
    }

    @Override
    protected double xpCalculation() {
        return DEFAULT_XP + getWorkload();
    }
    @Override
    public String toString() {
        return
                "Course" +
                "   {" + "\n" +
                "       name='" + this.getName() + '\'' + ",\n" +
                "       description='" + this.getDescription() + '\'' + ",\n" +
                "       workload=" + this.getWorkload() + '\'' + "\n" +
                "   }";
    }
}
