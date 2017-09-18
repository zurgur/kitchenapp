package teymi15.kitchenapp.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The class controls the view render to tell it which
 * page to load
 */
@Controller
@RequestMapping("/kitchenapp")
public class ViewController {

    /**
     * The function tells the search page to be displayed at route predefined
     * in the configuration application.properties
     * @return String
     */
    @RequestMapping("/")
    public String searchPage(Model model) {
        model.addAttribute("searchResults", "");
        return "search";
    }

    /**
     * The function tells the same route should be rendered when the user confirms
     * the input. After getting the input from the user, the page should
     * display the model information on the page.
     * @return String
     */
    @RequestMapping(value="/", method = RequestMethod.POST)
    public String displayResults(@RequestParam(value = "searchResults", required = false) String searchResults, ModelMap modelMapel) {
        modelMapel.addAttribute("searchResults", searchREsults);
        return "search";
    }
}
