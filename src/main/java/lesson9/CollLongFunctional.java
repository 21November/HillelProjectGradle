package lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by admin on 04.10.2019.
 */
public class CollLongFunctional {

    public static Collection<CollLong> find (Collection<CollLong> collLongs, String number){
        List<CollLong> collLongsNew = new ArrayList<CollLong>();

        for (CollLong collLong : collLongs) {
            if (collLong.getForNumber().equals(number)){
                collLongsNew.add(collLong);
            }
        }

        return collLongsNew;
    }
}
