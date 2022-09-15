package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date contractDate;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<Installment>();
	

	public Contract(Integer number, Date contactDate, Double value) {
		this.number = number;
		this.contractDate = contactDate;
		this.totalValue = value;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallments(Installment installment) {
		installments.add(installment);
	}
}
