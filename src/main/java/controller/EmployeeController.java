package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private static final String[] status = {
            "Full Time",
            "Part Time"};

    @GetMapping(value={"/", "/Input"})
    public String input(){
        logger.trace("input() is called");
        return "Input";
    }

}
