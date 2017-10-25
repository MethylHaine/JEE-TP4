package main.java.controller;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;

import main.java.business.ProductManager;
import main.java.model.Product;


@Controller()
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductManager manager;

    protected final Log logger = LogFactory.getLog(getClass());

    @ModelAttribute("products")
    Collection<Product> products() {
        logger.info("Making list of products");
        return manager.findAll();
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listProducts2() {
        logger.info("List of products");
        return "productsList";
    }

}