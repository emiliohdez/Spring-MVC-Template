package mvcbase.model.entities;

/**
 * @author emiliohdez
 * This is for modeling the validations mechanism.
 */
public class InvalidEntityPropertyException extends Exception {

    public InvalidEntityPropertyException(String errorMessage) {
        super(errorMessage);
    }

}
