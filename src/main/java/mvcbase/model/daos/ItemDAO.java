package mvcbase.model.daos;

import mvcbase.model.databases.SQLDatabase;
import mvcbase.model.entities.Item;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author emiliohdez
 * This class is an implementation of the CRUD operations for each entity involved in our model.
 */
public class ItemDAO {

    /**
     * This process tries to find each register in the Items table of the database, one found tries to parse them to a
     * JSON format and return this new String.
     * @return The String representation of the found database registers.
     */
    public static String getAllItems() {
        String response;
        try {
            Connection conn = SQLDatabase.getConnection();
            /*
             * here you'll write the rest of the interaction with the database, like the query and the result
             * processing, I thin you can ise JSON format for the processing because it's interoperable :), that's why
             * I wrote the response as an String.
             */
            response = "...";
            return response;
        } catch (SQLException e) {
            // Here you can analyse what happened, so you can deliver a clear response to the use case do something else
            e.printStackTrace();
            response = "ERROR_?";
            return response;
        }
    }

    /**
     * This method creates a new instance of Item in our database.
     * @param item is the required information for creating a new Item.
     */
    public static String createItem(Item item) {
        String response;
        try {
            Connection conn = SQLDatabase.getConnection();
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
     * And all the CRUD operations that, according to the use cases, you will need.
     * ...
     */

}
