

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by rakeshprabhakaran on 5/12/2015.
 */

@Entity
public class UserDetails {
    @Id
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
