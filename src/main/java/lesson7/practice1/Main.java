package lesson7.practice1;

public class Main {

    public static void main(String[] args) {
        HumanLifecycle lifecycle = new HumanLifecycle(createObserver());
        //Старт
        lifecycle.startLife();

        System.out.println("Вот и конечная остановка!");
    }

    //реализация интерфейса
    private static IHumanLifecycleObserver createObserver() {
        return new IHumanLifecycleObserver() {
            @Override
            public void onHumanWasBorn(HumanBornParam param) {
                System.out.println("Ребенок " + param.name + " родился " + param.birthday + " с весом " +
                                param.weight + ". Пол ребенка " + param.gender);
            }

            @Override
            public void onHumanWasSentToKindergarten(HumanKindergartenParam param) {
                System.out.println("Ребенка отправили в детский сад " +
                        param.date);
            }

            @Override
            public void onHumanWasSentSchool(HumanSchoolParam param) {
                System.out.println("Ребенок пошел в школу " + param.date);
            }

            @Override
            public void onHumanWentUniversity(HumanUniversityParam param) {
                System.out.println("Поступление в ВУЗ " + param.date);
            }

            @Override
            public void onHumanMarriage(HumanMarryParam param) {
                System.out.println(param.date + " Свадьба с " + param.spouse.getName());
            }

            @Override
            public void onHumanBecomeParent(HumanBecomeParentParam param) {
                System.out.println(param.date + " человек становится родителем. ребенка зовут " + param.child.getName() +
                                " пол " + param.child.getGender().toLowerCase());
            }

            @Override
            public void onHumanDie(HumanDieParam param) {
                System.out.println("Человек умер " + param.date);
            }
        };
    }
}
