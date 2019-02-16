package com.lemsst.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LambdaMain {

    public static void main(String[] args) {

        List<Tao> mgaTao = new ArrayList<Tao>();

        mgaTao.add(new Tao("Rodrigo Duterte", Tao.Kinatawhan.LAKI, LocalDate.of(1989,6,21)));
        mgaTao.add(new Tao("Maria Ressa", Tao.Kinatawhan.BAYE, LocalDate.of(1988,6,21)));
        mgaTao.add(new Tao("Mar Roxas", Tao.Kinatawhan.LAKI, LocalDate.of(1987,6,21)));

        // Anonymous class
        Tao.printPersons(mgaTao, new CheckPerson() {
            @Override
            public boolean test(Tao tao) {
                return tao.kinatawhan == Tao.Kinatawhan.LAKI
                        && tao.kwaangEdad() >= 18
                        && tao.kwaangEdad() <= 30;
            }
        });

        // Lambda
        Tao.printPersons(mgaTao, (Tao tao) -> tao.kwaangKinatawhan() == Tao.Kinatawhan.LAKI
        && tao.kwaangEdad() >= 18
        && tao.kwaangEdad() <= 30);

        // Using standard Functional Interface
        Tao.printPersonsWithPredicate(mgaTao,
                tao -> tao.kwaangKinatawhan() == Tao.Kinatawhan.LAKI
                        && tao.kwaangEdad() >= 18
                        && tao.kwaangEdad() <= 30);

        // Lambda
        System.out.println("--- AND ---");
        Tao.processPersonsWithFunction(mgaTao,
                tao -> tao.kwaangKinatawhan() == Tao.Kinatawhan.LAKI
                && tao.kwaangEdad() >= 18
                && tao.kwaangEdad() <= 30,
                tao -> tao.kwaangNgan(),
                ngan -> System.out.println(ngan));

        // Generic lambda
        System.out.println("--- FINALLY ---");
        Tao.processElements(mgaTao,
                tao -> tao.kwaangKinatawhan() == Tao.Kinatawhan.LAKI
                        && tao.kwaangEdad() >= 18
                        && tao.kwaangEdad() <= 30,
                p -> p.kwaangNgan(),
                ngan -> System.out.println(ngan));

        // Afterlife
        System.out.println("--- AGGREGATE ---");
        mgaTao.stream().filter(tao -> tao.kwaangKinatawhan() == Tao.Kinatawhan.LAKI
                && tao.kwaangEdad() >= 18
                && tao.kwaangEdad() <= 30).map(ngan->ngan.kwaangNgan()).forEach(ngan -> System.out.println(ngan));

    }

}
