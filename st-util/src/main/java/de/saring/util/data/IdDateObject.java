package de.saring.util.data;

import java.util.Date;

/**
 * Abstract base class for all objects which needs to have an ID for
 * referencing and contain a date.
 * 
 * @author  Stefan Saring
 * @version 1.0
 */
public abstract class IdDateObject extends IdObject {

    /** The date and time of this object. */
    private Date date;

    /**
     * Standard c'tor.
     * @param id the ID of the object
     */
    public IdDateObject (int id) {
        super (id);
    }

    /***** BEGIN: Generated Getters and Setters *****/

    public Date getDate () {
        return date;
    }

    public void setDate (Date date) {
        this.date = date;
    }

    /***** END: Generated Getters and Setters *****/

    /** 
     * Returns a string representation of this object. 
     * @return string with object content
     */
    @Override
    public String toString () {
        StringBuilder sBuilder = new StringBuilder ();
        sBuilder.append (this.getClass ().getName () + ":\n");
        sBuilder.append (" [id=" + this.getId () + "\n");
        sBuilder.append ("  date=" + this.date + "]\n");
        return sBuilder.toString ();
    }
}