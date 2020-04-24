package mvcbase.controllers.usecases;

/**
 * @author emiliohdez
 */

public interface UseCaseModel {

    /**
     * This methos will be en charge of executing all the necessary database interactions for accomplish the request.
     * @return is certain code that expresses if every database interactions where accomplished or something happened.
     */
    public String execute();
}
