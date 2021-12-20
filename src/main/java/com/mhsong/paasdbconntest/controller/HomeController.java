package com.mhsong.paasdbconntest.controller;

<<<<<<< HEAD
=======

>>>>>>> 77be04b410cae12be36d53fee30cc2337f06c4f4
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
<<<<<<< HEAD
    final static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home() {
        logger.info("HOME CONTROLLER, PATH : /test");
        return "PATH : / <br>SPRING WAR TEST";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {
        logger.info("HOME CONTROLLER, PATH : /test");
        return "PATH : /test";
=======
    static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home() {
        logger.info("HOME CONTROLLER, PATH: /");
        return "PATH: /";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {
        logger.info("HOME CONTROLLER, PATH: /test");
        return "PATH: /test";
>>>>>>> 77be04b410cae12be36d53fee30cc2337f06c4f4
    }
}
