package spring.desafio.emprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.desafio.emprestimo.domain.dto.CustomerDto;
import spring.desafio.emprestimo.domain.dto.LoanDto;
import spring.desafio.emprestimo.domain.service.LoanService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public Map<String, Object> getAvailableLoans(@RequestBody CustomerDto customer) {

        List<LoanDto> loans = loanService.validateLoans(customer);

        Map<String, Object> response = new HashMap<>();

        response.put("customer", customer.name());
        response.put("loans", loans);

        return response;
    }
}