package lesson7.practice1;

import java.util.Date;

public class HumanLifecycle {
    private final IHumanLifecycleObserver observer;

    public HumanLifecycle(IHumanLifecycleObserver observer) {
        this.observer = observer;
    }

    public void starterLife(){
        IHumanLifecycleObserver.HumanBornParams bornParams =
                new IHumanLifecycleObserver.HumanBornParams();
        bornParams.birthday = new Date();
        bornParams.weigh = 3.213f;
        bornParams.gender = "male";
        observer.onHumanWasBorn(bornParams);
    }
}
