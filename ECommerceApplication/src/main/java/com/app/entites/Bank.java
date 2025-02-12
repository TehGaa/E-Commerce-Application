package com.app.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Data
@Table(name = "banks")
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bankId;

    @NotBlank
	@Size(min = 3, message = "Bank name must contain atleast 3 characters")
    @Column(unique = true)
    private String bankName;

    @NotBlank
    @Digits(integer = 16, fraction = 0, message = "Account number must contain only digits")
    @Size(min = 16, max = 16, message = "Account number must contain exactly 16 digits")
    private String accountNumber;
}
