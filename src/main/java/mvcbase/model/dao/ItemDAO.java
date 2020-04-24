package mvcbase.model.dao;

import mvcbase.model.entities.Item;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author emiliohdez
 * This class is an implementation of the CRUD operations for each entity involved in our model.
 */
public class ItemDAO {

    /**
     * This method creates a new instance of Item in our database.
     *
     * @param item is the required information for creating a new Item.
     */
    public String createItem(Item item) {
        String response;
        try {
            Connection conn = Database.getConnection();
            /*
             * here you'll write the rest of the interaction with the database, like the query and the result processing,
             * I thin you can ise JSON format for the processing because it's interoperable :), that's why I wrote the
             * response as an String.
             */
            response = "...";
            return response;
        } catch (SQLException throwables) {
            // analyse: what happened, so you can deliver a clear response to the use case do something else
            throwables.printStackTrace();
            response = "ERROR_?";
            return response;
        }
    }

    /**
     * This method returns a list of items that fulfill a given criteria.
     *
     * @param searchCriteria is the encapsulation of the properties that an Item must fulfill. If null, all Items wil
     *                       be returned;
     */
    public String readItems(Item searchCriteria) {
        String response;
        try {
            Connection conn = Database.getConnection();
            /*
             * here you'll write the rest of the interaction with the database, like the query and the result
             * processing, I thin you can ise JSON format for the processing because it's interoperable :), that's why
             * I wrote the response as an String.
             */
            response = "...";
            return response;
        } catch (SQLException throwables) {
            // Here you can analyse what happened, so you can deliver a clear response to the use case do something else
            throwables.printStackTrace();
            response = "ERROR_?";
            return response;
        }
    }

    /**
     * This method updated certain properties of every Item that fulfill a given criteria.
     *
     * @param searchCriteria is the encapsulation of the properties that an Item must fulfill. If null, all Items wil
     *                       be selected.
     * @param update         is the encapsulation of the updates to be applied to the selected Items.
     */
    public void updateItems(Item searchCriteria, Item update) {

    }

    /**
     * This method deletes each Item in the database that fulfill a given criteria.
     *
     * @param searchCriteria the encapsulation of the properties that an Item must fulfill to be deleted.
     */
    public void deleteItems(Item searchCriteria) {

    }

}
