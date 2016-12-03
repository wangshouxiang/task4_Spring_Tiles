package com;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author isaac.zhang 2016/2/18
 */
@Controller
public class CustomerController {

    private static final Log logger = LogFactory.getLog(CustomerController.class);

    @RequestMapping(value = "/customer_input")
    public String inputCustomer(){
        logger.info("inputCustomer called!");
        return "CustomerForm";
    }

    @RequestMapping(value = "/customer_save" )
    public String handleRequest(ProductForm productForm,Model model) throws Exception {
        logger.info("handleRequest called!");
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        model.addAttribute("product",product);
        return "CustomerDetail";
    }
}
