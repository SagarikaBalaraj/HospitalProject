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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amountPaid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
		result = prime * result + ((paymentDetails == null) ? 0 : paymentDetails.hashCode());
		result = prime * result + (int) (transactionId ^ (transactionId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardPayment other = (CardPayment) obj;
		if (Double.doubleToLongBits(amountPaid) != Double.doubleToLongBits(other.amountPaid))
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		if (paymentDetails == null) {
			if (other.paymentDetails != null)
				return false;
		} else if (!paymentDetails.equals(other.paymentDetails))
			return false;
		if (transactionId != other.transactionId)
			return false;
		return true;
	}
	
	
	
}
