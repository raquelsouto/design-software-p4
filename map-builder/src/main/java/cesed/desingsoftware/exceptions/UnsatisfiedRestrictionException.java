package cesed.desingsoftware.exceptions;

import java.io.Serializable;

public class UnsatisfiedRestrictionException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;

    public UnsatisfiedRestrictionException () {
        super();
    }

    public UnsatisfiedRestrictionException (String error) {
        super(error);
    }
}
