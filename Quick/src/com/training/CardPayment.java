package com.training;

import java.time.LocalDate;

public class CardPayment {

	private long transactionId;
	private long cardNumber;
	private String paymentDetails;
	private double amountPaid;
	private LocalDate paymentDate;
	public CardPayment() {
		super();
	}
	public CardPayment(long transactionId, long cardNumber, String paymentDetails, double amountPaid) {
		super();
		this.transactionId = transactionId;
		this.cardNumber = cardNumber;
		this.paymentDetails = paymentDetails;
		this.amountPaid = amountPaid;
	}
	
	public CardPayment(long transactionId, long cardNumber, String paymentDetails, double amountPaid,
			LocalDate paymentDate) {
		super();
		this.transactionId = transactionId;
		this.cardNumber = cardNumber;
		this.paymentDetails = paymentDetails;
		this.amountPaid = amountPaid;
		this.paymentDate = paymentDate;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "CardPayment [transactionId=" + transactionId + ", cardNumber=" + cardNumber + ", paymentDetails="
				+ paymentDetails + ", amountPaid=" + amountPaid + ", paymentDate=" + paymentDate + "]";
	}

	
	
	
	
}
