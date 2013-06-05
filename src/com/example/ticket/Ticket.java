package com.example.ticket;

import java.util.Arrays;

class Ticket {
    
	private boolean status;
    private String url;
    private String type;
    private String messageError;
    private String nextStep;
    private String errors;
    private Long cardNumber;
    private String date;
    private String seeBalance;
    private String prodCard;
    private String token;
    private String[] schedulings;
	private String releases;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessageError() {
		return messageError;
	}
	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}
	public String getNextStep() {
		return nextStep;
	}
	public void setNextStep(String nextStep) {
		this.nextStep = nextStep;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getSeeBalance() {
		return seeBalance;
	}
	public void setSeeBalance(String seeBalance) {
		this.seeBalance = seeBalance;
	}
	public String getProdCard() {
		return prodCard;
	}
	public void setProdCard(String prodCard) {
		this.prodCard = prodCard;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public String[] getSchedulings() {
		return schedulings;
	}
	public void setSchedulings(String[] schedulings) {
		this.schedulings = schedulings;
	}
	public String getReleases() {
		return releases;
	}
	public void setReleases(String releases) {
		this.releases = releases;
	}
	@Override
	public String toString() {
		return "Ticket [status=" + status + ", url=" + url + ", type=" + type
				+ ", messageError=" + messageError + ", nextStep=" + nextStep
				+ ", errors=" + errors + ", cardNumber=" + cardNumber
				+ ", date=" + date + ", seeBalance=" + seeBalance
				+ ", prodCard=" + prodCard + ", token=" + token
				+ ", schedulings=" + Arrays.toString(schedulings)
				+ ", releases=" + releases + "]";
	}
	
		
}