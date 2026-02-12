package id.ac.ui.cs.advprog.individualpreparation.dto;

public record VectorRequest(
    double[] vector1,
    double[] vector2,
    Integer scalar // Optional, only used for scalar multiplication
) {
}

