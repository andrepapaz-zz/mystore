package com.example.mystore.application;

import com.example.mystore.domain.Busca;
import com.example.mystore.domain.Product;
import com.example.mystore.services.ProductService;
import com.example.mystore.utils.PersonalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by andre on 05/05/2018.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private PersonalDate personalDate;

    @RequestMapping(path = "/details/{id}", method = RequestMethod.GET)
    public String productDetail(Model model, @PathVariable(value = "id") Long id) {

        Product product = productService.getById(id);

        String footerDate = personalDate.footerDate(new Date());

        model.addAttribute("busca", new Busca());
        model.addAttribute("produto", product);
        model.addAttribute("dateFooter", footerDate);

        return "detail";
    }


}
