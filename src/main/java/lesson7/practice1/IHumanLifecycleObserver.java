package lesson7.practice1;

import java.util.Date;

public interface IHumanLifecycleObserver {


    void onHumanWasBorn(HumanBornParams params);

    class HumanBornParams {
        public Date birthday;
        public float weigh;
        public String gender;
    }
}
