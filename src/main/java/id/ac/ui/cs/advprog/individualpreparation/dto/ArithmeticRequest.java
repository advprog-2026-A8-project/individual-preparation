package id.ac.ui.cs.advprog.individualpreparation.dto;

public record ArithmeticRequest(
    double operand1,
    double operand2,
    Integer exponent // Optional, only used for exponent operation
) {
}

