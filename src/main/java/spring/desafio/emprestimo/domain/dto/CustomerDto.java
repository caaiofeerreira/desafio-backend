package spring.desafio.emprestimo.domain.dto;

import java.math.BigDecimal;

public record CustomerDto(String name,
                          String document,
                          int age,
                          BigDecimal income,
                          String location) {
}