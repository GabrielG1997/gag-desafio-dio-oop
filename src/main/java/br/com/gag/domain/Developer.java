package br.com.gag.domain;

import java.util.*;

public class Developer {
    public Developer(String name) {
        this.name = name;
    }

    private final String name;
    private Set<Content> subscriptionContentSet = new LinkedHashSet<>();
    private Set<Content> concludedContentSet = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        setSubscriptionContentSet(new LinkedHashSet<>(bootcamp.getContentSet()));
        bootcamp.getDevelopersSet().add(this);
        System.out.printf("""
                
                %s subscribed at %s bootcamp
                """, this.name, bootcamp.getName());
    }
    public void progress (){
        Content content = subscriptionContentSet.stream().findFirst()
                .orElse(null);
        if (content != null) {
            concludedContentSet.add(content);
            subscriptionContentSet.remove(content);
        } else {
            System.err.println("You're not subscribed in any course");
        }
    }

    public double xpTotalCalculation(){
        return this.concludedContentSet.stream().mapToDouble(Content::xpCalculation).sum();
    }

    public void setSubscriptionContentSet(Set<Content> subscriptionContentSet) {
        this.subscriptionContentSet = subscriptionContentSet;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscriptionContentSet, developer.subscriptionContentSet) && Objects.equals(concludedContentSet, developer.concludedContentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscriptionContentSet, concludedContentSet);
    }
}
