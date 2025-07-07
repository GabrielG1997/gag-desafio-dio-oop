package br.com.gag;

import br.com.gag.domain.*;

import java.time.OffsetDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Content course1 = new Course("1","one",10);
        Content course2 = new Course("2","two",5);
        Content mentorship1 = new Mentorship("M1","Mentorship1",2,OffsetDateTime.now());
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java");
        bootcamp.setDescription("Bootcamp to learn the core concepts of OOP");
        bootcamp.getContentSet().add(course1);
        bootcamp.getContentSet().add(course2);
        bootcamp.getContentSet().add(mentorship1);
        Developer dev1 = new Developer("Gabriel Alves");
        Developer dev2 = new Developer("Gabriel Guimarães");

        dev1.subscribeBootcamp(bootcamp);
        dev2.subscribeBootcamp(bootcamp);

        for (int i = 0; i < bootcamp.getContentSet().size(); i++) {
            advanceDeveloperProgress(dev1);
            //advanceDeveloperProgress(dev2);
        }

    }

    private static void advanceDeveloperProgress(Developer dev) {
        dev.progress();
        System.out.println("XP: " + dev.xpTotalCalculation());


    }
}