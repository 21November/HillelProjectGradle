package lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 04.10.2019.
 */
public class Message {
    private String forNumber;
    private Date halfTime;
    private String massageText;

    public Message(String forNumber, Date halfTime, String massageText) {
        this.forNumber = forNumber;
        this.halfTime = halfTime;
        this.massageText = massageText;
    }

    public String getForNumber() {
        return forNumber;
    }

    public Date getHalfTime() {
        return halfTime;
    }

    public String getMassageText() {
        return massageText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (!forNumber.equals(message.forNumber)) return false;
        if (!halfTime.equals(message.halfTime)) return false;
        return massageText.equals(message.massageText);

    }

    @Override
    public int hashCode() {
        int result = forNumber.hashCode();
        result = 31 * result + halfTime.hashCode();
        result = 31 * result + massageText.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "forNumber='" + forNumber + '\'' +
                ", halfTime=" + halfTime +
                ", massageText='" + massageText + '\'' +
                '}';
    }


}
