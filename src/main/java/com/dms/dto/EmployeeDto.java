package com.dms.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import org.joda.time.LocalDateTime;

import com.dms.serializable.LocalDateTimeJacksonDeSerializable;
import com.dms.serializable.LocalDateTimeJacksonSerializable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class EmployeeDto implements Serializable {

	private String id;
	private String name;
	private String position;
	@JsonSerialize(using = LocalDateTimeJacksonSerializable.class)
	@JsonDeserialize(using = LocalDateTimeJacksonDeSerializable.class)
	private LocalDateTime hiredate;
	private BigDecimal baseWage;
	private BigDecimal workingAgeSubsidy;
	private BigDecimal overtime;
	private BigDecimal mealsSubsidy;
	private BigDecimal secrecySubsidy;
	private BigDecimal communicationFee;
	private String bankCardNumber;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public LocalDateTime getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDateTime hiredate) {
		this.hiredate = hiredate;
	}

	public BigDecimal getBaseWage() {
		return baseWage;
	}

	public void setBaseWage(BigDecimal baseWage) {
		this.baseWage = baseWage;
	}

	public String getBankCardNumber() {
		return bankCardNumber;
	}

	public void setBankCardNumber(String bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	public BigDecimal getWorkingAgeSubsidy() {
		return workingAgeSubsidy;
	}

	public void setWorkingAgeSubsidy(BigDecimal workingAgeSubsidy) {
		this.workingAgeSubsidy = workingAgeSubsidy;
	}

	public BigDecimal getOvertime() {
		return overtime;
	}

	public void setOvertime(BigDecimal overtime) {
		this.overtime = overtime;
	}

	public BigDecimal getMealsSubsidy() {
		return mealsSubsidy;
	}

	public void setMealsSubsidy(BigDecimal mealsSubsidy) {
		this.mealsSubsidy = mealsSubsidy;
	}

	public BigDecimal getSecrecySubsidy() {
		return secrecySubsidy;
	}

	public void setSecrecySubsidy(BigDecimal secrecySubsidy) {
		this.secrecySubsidy = secrecySubsidy;
	}

	public BigDecimal getCommunicationFee() {
		return communicationFee;
	}

	public void setCommunicationFee(BigDecimal communicationFee) {
		this.communicationFee = communicationFee;
	}
}
