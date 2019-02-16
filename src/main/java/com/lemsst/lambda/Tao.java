package com.lemsst.lambda;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Tao {

    public enum Kinatawhan {
        BAYE, LAKI
    }

    String ngalan;
    LocalDate birthday;
    Kinatawhan kinatawhan;
    String emailAddress;

    public int kwaangEdad() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public Kinatawhan kwaangKinatawhan() {
        return kinatawhan;
    }

    public String kwaangNgan() {
        return ngalan;
    }

    public void iprintKinsaNi() {
        System.out.println("Ngan: " + ngalan +
                " nga nag-edad: " + kwaangEdad() + " nga usa ka " + kwaangKinatawhan().name());
    }

    public Tao(String ngalan, Kinatawhan kinatawhan, LocalDate birthday) {
        this.ngalan = ngalan;
        this.birthday = birthday;
        this.kinatawhan = kinatawhan;
    }

    public static void printPersonsOlderThan(List<Tao> mgaTao, int edad) {
        for (Tao tao : mgaTao) {
            if (tao.kwaangEdad() >= edad)
                tao.iprintKinsaNi();
        }
    }

    public static void printPersonsWithinRange(List<Tao> mgaTao, int low, int high) {
        for (Tao tao : mgaTao) {
            if (low <= tao.kwaangEdad() && tao.kwaangEdad() < high)
                tao.iprintKinsaNi();
        }
    }

    public static void printPersons(List<Tao> mgaTao, CheckPerson tester) {
        for (Tao tao : mgaTao)
            if (tester.test(tao)) {
                System.out.print("PASSED: ");
                tao.iprintKinsaNi();
            } else {
                System.out.print("FAILED: ");
                tao.iprintKinsaNi();
            }
    }

    public static void printPersonsWithPredicate(List<Tao> mgaTao, Predicate<Tao> tester) {
        for (Tao tao : mgaTao) {
            if (tester.test(tao)) {
                System.out.print("PASSED: ");
                tao.iprintKinsaNi();
            } else {
                System.out.print("FAILED: ");
                tao.iprintKinsaNi();
            }
        }
    }

    public static void processPersonsWithFunction(List<Tao> mgaTao, Predicate<Tao> tester, Function<Tao, String> mapper, Consumer<String> block) {
        for (Tao tao : mgaTao) {
            if (tester.test(tao)) {
                String data = mapper.apply(tao);
                block.accept(data);
            }
        }
    }

    public static <X, Y> void processElements(Iterable<X> source,
                                              Predicate<X> tester,
                                              Function<X, Y> mapper,
                                              Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

}

