package br.com.gag.domain;

import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final OffsetDateTime startDt = OffsetDateTime.now();
    private final OffsetDateTime endDt =  startDt.plusDays(45L);
    private Set<Developer> developersSet = new LinkedHashSet<>();
    private Set<Content> contentSet = new LinkedHashSet<>();

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Developer> getDevelopersSet() {
        return developersSet;
    }

    public Set<Content> getContentSet() {
        return contentSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDt, bootcamp.startDt) && Objects.equals(endDt, bootcamp.endDt) && Objects.equals(developersSet, bootcamp.developersSet) && Objects.equals(contentSet, bootcamp.contentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDt, endDt, developersSet, contentSet);
    }
}
