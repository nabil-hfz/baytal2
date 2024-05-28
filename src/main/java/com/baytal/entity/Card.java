package com.baytal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_user_cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String cardNumber;

    @Column(nullable = false)
    private String cvv; // Consider not storing CVV or encrypting it

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal balance; // Using BigDecimal for monetary values

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(nullable = false)
    private LocalDate expirationDate; // Adding expiration date

    @Column(nullable = false)
    private Boolean isActive = true; // Manage card status

    @Enumerated(EnumType.STRING)
    private CardType cardType; // Enum for card types like DEBIT, CREDIT, etc.

}
