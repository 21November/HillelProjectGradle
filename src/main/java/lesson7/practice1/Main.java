package lesson7.practice1;

public class Main {

    public static void main(String[] args) {
        IHumanLifecycleObserver observer = new LoggingHumanLifecycleObserver();

        HumanLifecycle lifecycle = new HumanLifecycle(observer);

        lifecycle.starterLife();
    }

    private static class LoggingHumanLifecycleObserver implements IHumanLifecycleObserver {

        @Override
        public void onHumanWasBorn(HumanBornParams params) {
            System.out.println(String.format(
                    "Child was born on %s with weight %.3f and gender %s",
                    params.birthday, params.weigh, params.gender ));
        }
    }
}
