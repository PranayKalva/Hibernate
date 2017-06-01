package model;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * User: ranbirm
 * Date: Oct 20, 2003
 * Time: 12:42:48 PM
 * To change this template use Options | File Templates.
 */
@Entity
@Table (name="CLAIM")
public class ClaimDetails {
	@Id
	private long claimId;
	private int transactionCount;
	private String storeNumber;
	private String prescriptionNumber;
	private short refillNumber;
	private String carrierId;
	private short claimStatus;
	private float openBalance;
	private Calendar creationDate;
	private long versionNumber;
	private float initialBalanceDue;
	private int historyCount;
	private short lastStoreAction;
	private Short lastPaymentAction;
	private Calendar lastPaymentDate;
	private String lastBatchNumber;
	private Calendar lastOpenedDate;
	private Calendar lastModificationTime;
	private float netAmountPaid;

	private String payerID;
	private String facilityID;
	private short ltcFlag;
	
	private double unitReimbCost;
	private double unitAcqCost;
	private double grossProfit;
	private double grossProfitPercent;
	/**
	 * @author Mohit
	 * @see BillingSessionEJB
	 * latestPostedDate, latestPaidAmount & latestReferenceID are values corresponding to latestest
	 * claim transaction. Although this 3 fields are not part of claims table, they are displayed on
	 * single claim view page to allow user to view the values corresponding to latest transaction.
	 * Also, latest paid amount is number formatted to show decimals upto two digits.
	 */
		private String latestPostedDate;
	private String latestPaidAmount;
	private String latestReferenceId;
	private String claimTrxnDetails;
	private String claimHistoryDetails;
	private String drugDetails;
	private String patientDetails;
	private String physicianDetails;
	private String specialDetails;
	private String transferDetails;
	private String auditRecoupDetails;
	private String plan340BDetail;
	private String carrierDetail;
	public long getClaimId() {
		return claimId;
	}
	public void setClaimId(long claimId) {
		this.claimId = claimId;
	}
	public int getTransactionCount() {
		return transactionCount;
	}
	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}
	public String getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}
	public String getPrescriptionNumber() {
		return prescriptionNumber;
	}
	public void setPrescriptionNumber(String prescriptionNumber) {
		this.prescriptionNumber = prescriptionNumber;
	}
	public short getRefillNumber() {
		return refillNumber;
	}
	public void setRefillNumber(short refillNumber) {
		this.refillNumber = refillNumber;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public short getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(short claimStatus) {
		this.claimStatus = claimStatus;
	}
	public float getOpenBalance() {
		return openBalance;
	}
	public void setOpenBalance(float openBalance) {
		this.openBalance = openBalance;
	}
	public Calendar getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
	public long getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(long versionNumber) {
		this.versionNumber = versionNumber;
	}
	public float getInitialBalanceDue() {
		return initialBalanceDue;
	}
	public void setInitialBalanceDue(float initialBalanceDue) {
		this.initialBalanceDue = initialBalanceDue;
	}
	public int getHistoryCount() {
		return historyCount;
	}
	public void setHistoryCount(int historyCount) {
		this.historyCount = historyCount;
	}
	public short getLastStoreAction() {
		return lastStoreAction;
	}
	public void setLastStoreAction(short lastStoreAction) {
		this.lastStoreAction = lastStoreAction;
	}
	public Short getLastPaymentAction() {
		return lastPaymentAction;
	}
	public void setLastPaymentAction(Short lastPaymentAction) {
		this.lastPaymentAction = lastPaymentAction;
	}
	public Calendar getLastPaymentDate() {
		return lastPaymentDate;
	}
	public void setLastPaymentDate(Calendar lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}
	public String getLastBatchNumber() {
		return lastBatchNumber;
	}
	public void setLastBatchNumber(String lastBatchNumber) {
		this.lastBatchNumber = lastBatchNumber;
	}
	public Calendar getLastOpenedDate() {
		return lastOpenedDate;
	}
	public void setLastOpenedDate(Calendar lastOpenedDate) {
		this.lastOpenedDate = lastOpenedDate;
	}
	public Calendar getLastModificationTime() {
		return lastModificationTime;
	}
	public void setLastModificationTime(Calendar lastModificationTime) {
		this.lastModificationTime = lastModificationTime;
	}
	public float getNetAmountPaid() {
		return netAmountPaid;
	}
	public void setNetAmountPaid(float netAmountPaid) {
		this.netAmountPaid = netAmountPaid;
	}
	public String getPayerID() {
		return payerID;
	}
	public void setPayerID(String payerID) {
		this.payerID = payerID;
	}
	public String getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(String facilityID) {
		this.facilityID = facilityID;
	}
	public short getLtcFlag() {
		return ltcFlag;
	}
	public void setLtcFlag(short ltcFlag) {
		this.ltcFlag = ltcFlag;
	}
	public double getUnitReimbCost() {
		return unitReimbCost;
	}
	public void setUnitReimbCost(double unitReimbCost) {
		this.unitReimbCost = unitReimbCost;
	}
	public double getUnitAcqCost() {
		return unitAcqCost;
	}
	public void setUnitAcqCost(double unitAcqCost) {
		this.unitAcqCost = unitAcqCost;
	}
	public double getGrossProfit() {
		return grossProfit;
	}
	public void setGrossProfit(double grossProfit) {
		this.grossProfit = grossProfit;
	}
	public double getGrossProfitPercent() {
		return grossProfitPercent;
	}
	public void setGrossProfitPercent(double grossProfitPercent) {
		this.grossProfitPercent = grossProfitPercent;
	}
	public String getLatestPostedDate() {
		return latestPostedDate;
	}
	public void setLatestPostedDate(String latestPostedDate) {
		this.latestPostedDate = latestPostedDate;
	}
	public String getLatestPaidAmount() {
		return latestPaidAmount;
	}
	public void setLatestPaidAmount(String latestPaidAmount) {
		this.latestPaidAmount = latestPaidAmount;
	}
	public String getLatestReferenceId() {
		return latestReferenceId;
	}
	public void setLatestReferenceId(String latestReferenceId) {
		this.latestReferenceId = latestReferenceId;
	}
	public String getClaimTrxnDetails() {
		return claimTrxnDetails;
	}
	public void setClaimTrxnDetails(String claimTrxnDetails) {
		this.claimTrxnDetails = claimTrxnDetails;
	}
	public String getClaimHistoryDetails() {
		return claimHistoryDetails;
	}
	public void setClaimHistoryDetails(String claimHistoryDetails) {
		this.claimHistoryDetails = claimHistoryDetails;
	}
	public String getDrugDetails() {
		return drugDetails;
	}
	public void setDrugDetails(String drugDetails) {
		this.drugDetails = drugDetails;
	}
	public String getPatientDetails() {
		return patientDetails;
	}
	public void setPatientDetails(String patientDetails) {
		this.patientDetails = patientDetails;
	}
	public String getPhysicianDetails() {
		return physicianDetails;
	}
	public void setPhysicianDetails(String physicianDetails) {
		this.physicianDetails = physicianDetails;
	}
	public String getSpecialDetails() {
		return specialDetails;
	}
	public void setSpecialDetails(String specialDetails) {
		this.specialDetails = specialDetails;
	}
	public String getTransferDetails() {
		return transferDetails;
	}
	public void setTransferDetails(String transferDetails) {
		this.transferDetails = transferDetails;
	}

	public String getAuditRecoupDetails() {
		return auditRecoupDetails;
	}
	public void setAuditRecoupDetails(String auditRecoupDetails) {
		this.auditRecoupDetails = auditRecoupDetails;
	}
	public String getPlan340BDetail() {
		return plan340BDetail;
	}
	public void setPlan340BDetail(String plan340bDetail) {
		plan340BDetail = plan340bDetail;
	}
	public String getCarrierDetail() {
		return carrierDetail;
	}
	public void setCarrierDetail(String carrierDetail) {
		this.carrierDetail = carrierDetail;
	}
	
	
	
	/**
	 * Default Constructor
	 */
	

}
