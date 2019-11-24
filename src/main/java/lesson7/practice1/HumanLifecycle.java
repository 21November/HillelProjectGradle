package lesson7.practice1;

import lesson7.practice1.factory.Factory;
import lesson7.practice1.person.Person;

import java.time.LocalDate;
import java.util.Date;

public class HumanLifecycle {
    private final IHumanLifecycleObserver observer;
    private final Person mainCharacter;

    public HumanLifecycle(IHumanLifecycleObserver observer) {
        this.observer = observer;
        this.mainCharacter = Person.of();
    }
    //Эмуляция жизненного цыкла человека
    public void startLife() {
        // Этап "Рождения"
        observer.onHumanWasBorn(new IHumanLifecycleObserver.HumanBornParam(
                mainCharacter.getBirthday(), Factory.randomInt(2000, 7000) / 1000f,
                mainCharacter.getGender(), mainCharacter.getName()));

        //генерация даты поступления в детский сад
        LocalDate kindergartenDate = mainCharacter.getBirthday().plusYears(3).plusDays(Factory.randomInt(0, 365 * 2));

        //этап "Детский сад"
        goToKindergarten(Factory.getSomeWords(3), kindergartenDate);

        //генерация даты поступления в Школу
        LocalDate schoolDate = mainCharacter.getBirthday().getMonth().getValue() <= 9 ?
                LocalDate.of(mainCharacter.getBirthday().getYear() + Factory.randomInt(6, 8), 9, 1) :
                LocalDate.of(mainCharacter.getBirthday().getYear() + Factory.randomInt(7, 8), 9, 1);

        //этап "школа"
        goToSchool(Factory.getSomeWords(3),schoolDate);

        //генерация даты вступления в ВУЗ
        LocalDate universityDate = LocalDate.of(schoolDate.getYear() + Factory.randomInt(9, 15), 8, 1);

        //Этап "Учеба в ВУЗе"
        goToUniversity(universityDate, Factory.getSomeWords(3), Factory.randomBoolean());

        //Генерация даты бракоочетания
        LocalDate marriageDate;
        if (Factory.randomBoolean()) {
            marriageDate = universityDate.plusDays(Factory.randomInt(100, 365 * 5));
        } else if (Factory.randomBoolean()) {
            marriageDate = universityDate.plusYears(5).plusDays(Factory.randomInt(0, 20 * 365));
        } else {
            marriageDate = universityDate.plusYears(20).plusDays(Factory.randomInt(0, 5 * 365));
        }

        //Этап "Брак"
        marry(marriageDate, Person.of());

        //Генерация даты "становления родителями"
        LocalDate parentDate;

        if (Factory.randomBoolean()) {
            parentDate = marriageDate.plusDays(Factory.randomInt(100, 365 * 5));
        } else if (Factory.randomBoolean()) {
            parentDate = marriageDate.plusYears(5).plusDays(Factory.randomInt(0, 365 * 5));
        } else {
            parentDate = marriageDate.plusYears(10).plusDays(Factory.randomInt(0, 365 * 5));
        }

        //Этап "Свадьба"
        if (Factory.randomBoolean() && Factory.randomBoolean()) {
            marriageDate = marriageDate.plusDays(Factory.randomInt(30, 365));
            marry(marriageDate, Person.of());
            if (Factory.randomBoolean()) {
                parentDate = marriageDate.plusDays(Factory.randomInt(100, 365));
                becomeParent(parentDate, Person.of(parentDate));
            }
        }

        //Этап "Становление родителями"
        becomeParent(parentDate, Person.of(parentDate));
        parentDate = parentDate.plusYears(1).plusDays(Factory.randomInt(60, 365));

        if (mainCharacter.getSpouse() != null) {
            if (Factory.randomBoolean()) {
                becomeParent(parentDate, Person.of(parentDate));
            }
        } else if (Factory.randomBoolean() && Factory.randomBoolean()) {
            becomeParent(parentDate, Person.of(parentDate));
        }

        //Этап "Смерть"
        LocalDate deathDate = parentDate.plusYears(Factory.randomInt(10, 20)).plusDays(Factory.randomInt(30, 300));
        die(deathDate);
    }

    //Обработка этапа "Детский сад"
    private void goToKindergarten(String kindergartenName, LocalDate date) {
        observer.onHumanWasSentToKindergarten(new IHumanLifecycleObserver.HumanKindergartenParam(kindergartenName, date));
    }

    //Обработка этапа "Школа"
    private void goToSchool(String schoolName, LocalDate date) {
        observer.onHumanWasSentSchool(new IHumanLifecycleObserver.HumanSchoolParam(date, schoolName));
    }

    //Обработка этапа "ВУЗ"
    private void goToUniversity(LocalDate date, String universityName, boolean isScholarship) {
        observer.onHumanWentUniversity(new IHumanLifecycleObserver.HumanUniversityParam(date, universityName, isScholarship));
    }

    //Обработка этапа "Бракосочетание"
    private void marry(LocalDate date, Person spouse) {
        observer.onHumanMarriage(new IHumanLifecycleObserver.HumanMarryParam(date, spouse));
        if (mainCharacter.getSpouse() == null) {
            mainCharacter.setSpouse(spouse);
        }
    }

    // Обработка этапа "Становление родителями"
    private void becomeParent(LocalDate date, Person child) {
        observer.onHumanBecomeParent(new IHumanLifecycleObserver.HumanBecomeParentParam(date, child));
        mainCharacter.addChildren(child);
    }

    //Обработка этапа "Смерть"
    private void die(LocalDate date) {
        observer.onHumanDie(new IHumanLifecycleObserver.HumanDieParam(date));
    }
}
