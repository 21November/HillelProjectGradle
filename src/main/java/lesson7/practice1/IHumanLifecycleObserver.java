package lesson7.practice1;

import lesson7.practice1.person.Person;

import java.time.LocalDate;
import java.util.Date;

public interface IHumanLifecycleObserver {
    //рождение человека
    void onHumanWasBorn(HumanBornParam param);
    //Детский сад
    void onHumanWasSentToKindergarten(HumanKindergartenParam param);
    //Школа
    void onHumanWasSentSchool(HumanSchoolParam param);
    //поступление в универ
    void onHumanWentUniversity(HumanUniversityParam param);
    //Бракосочетание
    void onHumanMarriage(HumanMarryParam param);
    //стали родителями
    void onHumanBecomeParent(HumanBecomeParentParam param);
    //смерть
    void onHumanDie(HumanDieParam param);

    //класс Рождение человека
    class HumanBornParam {

        public final LocalDate birthday;
        public final float weight;
        public final String gender;
        public final String name;

        public HumanBornParam(LocalDate birthday, float weight, String gender, String name) {
            this.birthday = birthday;
            this.weight = weight;
            this.gender = gender;
            this.name = name;
        }
    }

    //Детский сад
    class HumanKindergartenParam {
        public final String kindergartenName;
        public final LocalDate date;

        public HumanKindergartenParam(String kindergartenName, LocalDate date) {
            this.kindergartenName = kindergartenName;
            this.date = date;
        }
    }

    //первый класс шолы
    class HumanSchoolParam {
        public final LocalDate date;
        public final String schoolName;

        public HumanSchoolParam(LocalDate date, String schoolName) {
            this.date = date;
            this.schoolName = schoolName;
        }
    }

    //универ
    class HumanUniversityParam {
        public final LocalDate date;
        public final String universityName;
        public final boolean isScholarship;

        public HumanUniversityParam(LocalDate date, String universityName, boolean isScholarship) {
            this.date = date;
            this.universityName = universityName;
            this.isScholarship = isScholarship;
        }
    }

    //Бракосочетание
    class HumanMarryParam {
        public final LocalDate date;
        public final Person spouse;

        public HumanMarryParam(LocalDate date, Person spouse) {
            this.date = date;
            this.spouse = spouse;
        }
    }

    //Становление родителями
    class HumanBecomeParentParam {
        public final LocalDate date;
        public final Person child;

        public HumanBecomeParentParam(LocalDate date, Person child) {
            this.date = date;
            this.child = child;
        }
    }

    //Смерть человека
    class HumanDieParam {
        public final LocalDate date;

        public HumanDieParam(LocalDate date) {
            this.date = date;
        }
    }
}
