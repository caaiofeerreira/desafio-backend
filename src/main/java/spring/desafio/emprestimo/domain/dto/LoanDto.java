package spring.desafio.emprestimo.domain.dto;

public record LoanDto(LoanType type,
                      int interestRate) {
}