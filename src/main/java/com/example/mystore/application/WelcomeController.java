package com.example.mystore.application;

import com.example.mystore.domain.Busca;
import com.example.mystore.domain.Product;
import com.example.mystore.services.ProductService;
import com.example.mystore.utils.PersonalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by andre on 05/05/2018.
 */
@Controller
public class WelcomeController {

    @Autowired
    private ProductService productService;

    @Autowired
    private PersonalDate personalDate;

    @RequestMapping(value = {
            "/",
            "/index"
    })
    public String welcome(Model model) {

        Iterable<Product> products = productService.listAll();

        String footerDate = personalDate.footerDate(new Date());

        model.addAttribute("busca", new Busca());
        model.addAttribute("produtos", products);
        model.addAttribute("dateFooter", footerDate);

        return "index";
    }

    @PostMapping("/products/search")
    public String search(Busca busca, BindingResult result, Model model) {

        Iterable<Product> products = productService.searchByName(busca.getSearch());

        String footerDate = personalDate.footerDate(new Date());

        model.addAttribute("busca", new Busca());
        model.addAttribute("produtos", products);
        model.addAttribute("dateFooter", footerDate);

        return "index";
    }

}
