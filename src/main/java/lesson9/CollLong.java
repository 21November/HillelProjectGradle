package lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 04.10.2019.
 */
public class CollLong {
    private String forNumber;
    private Date halfTime;

    public CollLong(String forNumber, Date halfTime) {
        this.forNumber = forNumber;
        this.halfTime = halfTime;
    }

    public String getForNumber() {
        return forNumber;
    }

    public Date getHalfTime() {
        return halfTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollLong collLong = (CollLong) o;

        if (!forNumber.equals(collLong.forNumber)) return false;
        return halfTime.equals(collLong.halfTime);

    }

    @Override
    public int hashCode() {
        int result = forNumber.hashCode();
        result = 31 * result + halfTime.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CollLong{" +
                "forNumber='" + forNumber + '\'' +
                ", halfTime=" + halfTime +
                '}';
    }


}
