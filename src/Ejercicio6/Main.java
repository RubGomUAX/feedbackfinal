package Ejercicio6;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Libro> libros = new TreeSet<>();
        libros.add(new Libro("Santiago Posteguillo", "Africanus: El hijo del cónsul", 2006));
        libros.add(new Libro("Santiago Posteguillo", "Las legiones malditas", 2008));
        libros.add(new Libro("Santiago Posteguillo", "La traición de Roma", 2009));
        libros.add(new Libro("Santiago Posteguillo", "Los asesinos del emperador", 2011));
        libros.add(new Libro("Santiago Posteguillo", "Circo Máximo", 2013));
        libros.add(new Libro("Santiago Posteguillo", "La legión perdida", 2016));
        libros.add(new Libro("Santiago Posteguillo", "Yo, Julia", 2018));
        libros.add(new Libro("Santiago Posteguillo", "Y Julia retó a los dioses", 2020));
        libros.add(new Libro("Santiago Posteguillo", "Roma soy yo", 2022));
        libros.add(new Libro("Santiago Posteguillo", "Maldita Roma", 2023));
        libros.add(new Libro("Santiago Posteguillo", "La noche en que Frankenstein leyó el Quijote", 2012));
        libros.add(new Libro("Santiago Posteguillo", "La sangre de los libros", 2014));
        libros.add(new Libro("Santiago Posteguillo", "El séptimo círculo del infierno", 2017));
        libros.add(new Libro("Ben Kane", "The Forgotten Legion", 2010));
        libros.add(new Libro("Ben Kane", "The Silver Eagle", 2011));
        libros.add(new Libro("Ben Kane", "The Road to Rome", 2012));
        libros.add(new Libro("Ben Kane", "Hannibal: Enemy of Rome", 2014));
        libros.add(new Libro("Ben Kane", "Hannibal: Fall of Rome", 2015));
        libros.add(new Libro("Ben Kane", "Hannibal: Revenge of Rome", 2016));
        libros.add(new Libro("Ben Kane", "Spartacus: The Gladiator", 2012));
        libros.add(new Libro("Ben Kane", "Spartacus: The Legionary", 2013));
        libros.add(new Libro("Ben Kane", "Spartacus: The Gladiator’s War", 2014));
        libros.add(new Libro("Ben Kane", "Lionheart", 2018));
        libros.add(new Libro("Ben Kane", "The Eagle’s Prophecy", 2018));
        libros.add(new Libro("Homero", "La Ilíada", -750));
        libros.add(new Libro("Homero", "La Odisea", -725));
        libros.add(new Libro("Massimo Colomo", "Roma Felix", 2019));
        libros.add(new Libro("Massimo Colomo", "Imperium", 2021));
        libros.add(new Libro("Simon Scarrow", "Under the Eagle", 2000));
        libros.add(new Libro("Simon Scarrow", "The Eagle’s Conquest", 2001));
        libros.add(new Libro("Simon Scarrow", "When the Eagle Hunts", 2002));
        libros.add(new Libro("Simon Scarrow", "The Eagle and the Wolves", 2003));
        libros.add(new Libro("Simon Scarrow", "Centurion", 2004));
        libros.add(new Libro("Simon Scarrow", "The Gladiator", 2009));
        libros.add(new Libro("Simon Scarrow", "The Legion", 2010));
        libros.add(new Libro("Simon Scarrow", "Praetorian", 2011));
        libros.add(new Libro("Simon Scarrow", "The Blood Crows", 2013));
        libros.add(new Libro("Simon Scarrow", "Brothers in Blood", 2014));
        libros.add(new Libro("Simon Scarrow", "Britannia", 2015));
        libros.add(new Libro("Simon Scarrow", "Invictus", 2016));
        libros.add(new Libro("Simon Scarrow", "Day of the Caesars", 2017));
        libros.add(new Libro("Simon Scarrow", "The Sword of Rome", 2018));
        libros.add(new Libro("Simon Scarrow", "The Gladiator’s Master", 2020));
        libros.add(new Libro("Simon Scarrow", "The Emperor’s Exile", 2021));
        libros.add(new Libro("Simon Scarrow", "Traitors of Rome", 2022));

        String autorMasProlifico = Libro.autorConMasLibros(libros);
        System.out.println("El autor con más libros es: " + autorMasProlifico);
    }
}
