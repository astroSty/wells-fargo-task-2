package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String createdDate;

    protected Portfolio() {
    }

    public Portfolio(String createdDate) {
        this.createdDate = createdDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}