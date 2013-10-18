package com.dodecaedro.service;

import com.dodecaedro.data.exception.NotEnoughFundsException;

public interface TransferService {
	void transferBetweenAccounts(int accountOriginId, int accountTargetId, int amount) throws NotEnoughFundsException;
	void transferBetweemCustomers(int sourceCustomerId, int targetCustomerId, int amount) throws NotEnoughFundsException;
	void payWithCreditCard(Integer creditCardId, int amount) throws NotEnoughFundsException;
}
