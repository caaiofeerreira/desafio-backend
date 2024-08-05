# Desafio de Backend: Empréstimo

## Descrição

Este desafio é sobre implementar um serviço de backend que determina quais modalidades de empréstimo um cliente pode acessar com base em suas características pessoais e financeiras.

## Tecnologias

* Spring Boot
    * spring-boot-starter-data-jpa
    * spring-boot-starter-web
    * spring-boot-devtools (opcional)
    * lombok (opcional)

## Funcionalidades

O serviço analisa três modalidades de empréstimo com diferentes taxas de juros:

- **Empréstimo Pessoal:** Taxa de juros de 4%.
- **Empréstimo Consignado:** Taxa de juros de 2%.
- **Empréstimo com Garantia:** Taxa de juros de 3%.

As modalidades disponíveis são baseadas nas seguintes variáveis:

- Idade
- Salário
- Localização

### Exemplo de Requisição

**Endpoint:** `POST /customer-loans`

**Request Body:**
```json
{
  "age": 26,
  "cpf": "275.484.389-23",
  "name": "Vuxaywua Zukiagou",
  "income": 7000.00,
  "location": "SP"
}

```

Resposta: (200 OK)
        
```json

{
  "customer": "Vuxaywua Zukiagou",
  "loans": [

    {
      "type": "CONSIGNMENT",
      "interest_rate": 2
    }
  ]
}
```
___
## Requisitos de Empréstimo

### Empréstimo Pessoal:

* Salário <= R$ 3000
Ou, Salário entre R$ 3000 e R$ 5000 e idade < 30 e localização é São Paulo (SP).

### Empréstimo Consignado:

* Salário >= R$ 5000

### Empréstimo com Garantia:

* Salário <= R$ 3000
Ou, Salário entre R$ 3000 e R$ 5000 e idade < 30 e localização é São Paulo (SP).