package com.ram;

public class ClintAccountLockDTO {
	private String accountNumber;
	private String action;
	private String lockedByUser;
	private String lockedDate;
	private boolean lockStatus;

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the lockedByUser
	 */
	public String getLockedByUser() {
		return lockedByUser;
	}

	/**
	 * @param lockedByUser
	 *            the lockedByUser to set
	 */
	public void setLockedByUser(String lockedByUser) {
		this.lockedByUser = lockedByUser;
	}

	/**
	 * @return the lockedDate
	 */
	public String getLockedDate() {
		return lockedDate;
	}

	/**
	 * @param lockedDate
	 *            the lockedDate to set
	 */
	public void setLockedDate(String lockedDate) {
		this.lockedDate = lockedDate;
	}

	/**
	 * @return the lockStatus
	 */
	public boolean getLockStatus() {
		return lockStatus;
	}

	/**
	 * @param lockStatus
	 *            the lockStatus to set
	 */
	public void setLockStatus(boolean lockStatus) {
		this.lockStatus = lockStatus;
	}

}
