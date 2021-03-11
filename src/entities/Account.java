package entities;

import model.exception.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance, withdrawLimit;
	
	public Account () {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit (Double amount) {
		balance += amount;
	}
	
	public void withdrawn (Double amount) throws DomainException {
		if (amount > withdrawLimit) {
			throw new DomainException ("valor ultrapassa o limite de saque");
		}
		if (amount > balance) {
			throw new DomainException("valor nao disponivel");
		}
	}
}





























