/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostis.test.controller;

import kostis.test.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ktsitsas
 */
@Controller
public class WebController {

    @Autowired
    TestService report;

    @RequestMapping(value = "/")
    public String reports() {
        return "test";
    }

}
