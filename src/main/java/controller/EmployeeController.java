package controller;

import domain.Envelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);



    @GetMapping(value={"/", "/Input"})
    public String input(){
        logger.trace("input() is called");
        return "Input";
    }

    @GetMapping("/Process")
    public ModelAndView process(@ModelAttribute Envelope envelope){
        logger.trace("process() is called");
        logger.debug("envelope = " + envelope);
        return new ModelAndView("Output", "envelope", envelope);
    }

}
