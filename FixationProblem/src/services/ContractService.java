package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService ops;
	
	public ContractService() {
	}
	
	

	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}


	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getContractDate(), i);
			double updatedQuota = basicQuota + ops.interest(basicQuota, i);
			double fullQuota = updatedQuota + ops.paymentFee(updatedQuota);

			contract.addInstallments(new Installment(fullQuota, date));
		}
	}

	private Date addMonths(Date contractDate, int i) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(contractDate);
		cal.add(Calendar.MONTH, i);
		return cal.getTime();
	}
}
