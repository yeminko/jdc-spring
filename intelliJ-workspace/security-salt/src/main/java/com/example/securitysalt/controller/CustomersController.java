package com.example.securitysalt.controller;

import com.example.securitysalt.dao.CustomersDao;
import com.example.securitysalt.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CustomersController {


    @Autowired
    private CustomersDao customersDao;




//    @IsCustomersRead
    @GetMapping("/customers")
    public ModelAndView index(){
        return new ModelAndView("customers","customers",customersDao.findAll());
    }

//    @IsCustomersCreate
    @GetMapping("/customers/create")
    public ModelAndView create(){
        return new ModelAndView("customer-create","customer",new Customer());
    }
//    @IsCustomersCreate
    @PostMapping("/customers/create")
    public String create(@ModelAttribute @Valid Customer customer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "customer-create";
        }
        else{
            customersDao.save(customer);
        }
        return "redirect:/customers";
    }
//    @IsCustomersDelete
    @GetMapping("/customers/delete/{id}")
    public String delete(@PathVariable Integer id){
        customersDao.deleteById(id);
        return "redirect:/customers";
    }


}
