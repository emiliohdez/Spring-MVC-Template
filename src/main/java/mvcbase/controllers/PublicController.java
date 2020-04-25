package mvcbase.controllers;

import mvcbase.model.usecases.ListAllItems;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author emiliohdez
 */

@Controller
public class PublicController {
    static ModelAndView modelView;

    @RequestMapping("/")
    public ModelAndView showList() {
        modelView = new ModelAndView();
        String actionResult = new ListAllItems(/*If the use case need some params, here.*/).execute();
        /*
        * I recommend you to make a final filter to the response, and according to the case, you can add a clever
        * message for building the interface and an specific HTTP status if needed.
         */
        modelView.addObject("list", actionResult);
        modelView.setViewName("index");
        return modelView;
    }

    // This will work for a POST request
    @RequestMapping(value = "/SignUp", method = RequestMethod.POST)
    public ModelAndView receiveParamPOST(@RequestParam("key") String param){
        //In this case, the parameter sent via the POST request identified by tha name "key", will be stored in param.
        modelView = new ModelAndView();
        /*
        Here we can execute a process associated to the function, and the return the view.
         */
        //modelView.setViewName("VIEW_NAME");
        return modelView;
    }
}
