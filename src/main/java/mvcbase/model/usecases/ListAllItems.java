package mvcbase.model.usecases;

import mvcbase.model.dao.ItemDAO;

/**
 * @author emiliohdez
 */

public class ListAllItems implements UseCaseModel{

    public ListAllItems () {
        // this space is for preparing you use case
    }

    @Override
    public String execute() {
        String finalResponse;
        String dbResponse = new ItemDAO().readItems(null);
        /*
        *   Here you can filter the response, and add extra information or decide to execute a plan B
         */
        finalResponse = "...";
        return finalResponse;
    }
}
