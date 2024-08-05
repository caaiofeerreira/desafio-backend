package spring.desafio.emprestimo.domain.service;

import org.springframework.stereotype.Service;
import spring.desafio.emprestimo.domain.dto.CustomerDto;
import spring.desafio.emprestimo.domain.dto.LoanDto;
import spring.desafio.emprestimo.domain.dto.LoanType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {


    public List<LoanDto> validateLoans(CustomerDto customer) {

        int age = customer.age();
        BigDecimal income = customer.income();
        String location = customer.location();

        List<LoanDto> loans = new ArrayList<>();

        BigDecimal minIncome = new BigDecimal("3000.00");
        BigDecimal maxIncome = new BigDecimal("5000.00");


        if (income.compareTo(minIncome) <= 0) {

            loans.add(new LoanDto(LoanType.PERSONAL, 4));
            loans.add(new LoanDto(LoanType.GUARANTEED, 3));
        }

        if (income.compareTo(maxIncome) >= 0) {

            loans.add(new LoanDto(LoanType.CONSIGNMENT, 2));
        }

        if (income.compareTo(minIncome) > 0 && income.compareTo(maxIncome) <= 0 && age < 30 && "SP".equalsIgnoreCase(location)) {

            loans.add(new LoanDto(LoanType.PERSONAL, 4));
            loans.add(new LoanDto(LoanType.GUARANTEED, 3));
        }

        return loans;
    }
}