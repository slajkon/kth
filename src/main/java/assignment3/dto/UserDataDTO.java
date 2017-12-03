package assignment3.dto;

import java.io.Serializable;

public interface UserDataDTO extends Serializable {
    
    /** 
     * @return The ID of the user.
     */
    public long getUserID();
    
    /** 
     * @return The username of the user.
     */
    public String getUsername();
}
