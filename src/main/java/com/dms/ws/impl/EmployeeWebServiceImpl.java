package com.dms.ws.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.dms.domain.*;
import com.dms.dto.EmployeeDto;
import com.dms.service.EmployeeService;
import com.dms.ws.EmployeeWebService;

@Service("employeeWebService")
public class EmployeeWebServiceImpl implements EmployeeWebService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeWebServiceImpl.class);

	@Autowired
	private EmployeeService employeeService;

	@Override
	public List<Month> getMonths() {
		return employeeService.getMonths();
	}

	@Override
	public List<Position> getPositions() {

		LOGGER.info("get positions");

		return employeeService.getPositions();

	}

	@Override
	public void save(List<EmployeeDto> employeeDtos) {

		LOGGER.info("save employees, {}", employeeDtos);

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		for (EmployeeDto employeeDto : employeeDtos) {
			Employee employee = new Employee();
			if (StringUtils.isNotBlank(employeeDto.getId())) {
				employee.setId(Long.valueOf(employeeDto.getId()));
			}
			employee.setName(employeeDto.getName());
			employee.setPosition(employeeDto.getPosition());
			try {
				employee.setHiredate(LocalDateTime.fromDateFields(sf.parse(employeeDto.getHiredate())));
			} catch (ParseException e) {
				LOGGER.error("date parse exception", e);
				e.printStackTrace();
			}
			employee.setBaseWage(new BigDecimal(employeeDto.getBaseWage()));
			employee.setBankCardNumber(employeeDto.getBankCardNumber());
			employee.setOvertime(employeeDto.getOvertime());
			employee.setMealsSubsidy(employeeDto.getMealsSubsidy());
			employee.setSecrecySubsidy(employeeDto.getSecrecySubsidy());
			employee.setCommunicationFee(employeeDto.getCommunicationFee());
			if (StringUtils.isBlank(employeeDto.getId())) {
				employeeService.save(employee);
			} else {
				employeeService.update(employee);
			}
		}
	}

	@Override
	public MiniResponse getEmployees(String key, int pageIndex, int pageSize, String sortField, String sortOrder) {

		LOGGER.info("get employees, key {}, pageIndex {}, pageSize {}, sortField {}, sortOrder {}", key, pageIndex, pageSize, sortField, sortOrder);

		MiniRequest request = new MiniRequest();
		request.setStart(pageIndex * pageSize + 1);
		request.setEnd((pageIndex + 1) * pageSize);
		request.setKey(key);
		request.setSortField(sortField);
		request.setSortOrder(sortOrder);

		int count = employeeService.getEmployeeCount(request);
		List<Employee> employees = employeeService.getEmployees(request);

		List<EmployeeDto> employeeDtos = Lists.newArrayList();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		for (Employee employee : employees) {
			EmployeeDto employeeDto = new EmployeeDto();
			employeeDto.setId(String.valueOf(employee.getId()));
			employeeDto.setName(employee.getName());
			employeeDto.setPosition(employee.getPosition());
			employeeDto.setHiredate(sf.format(employee.getHiredate().toDate()));
			employeeDto.setBaseWage(employee.getBaseWage().toString());
			employeeDto.setBankCardNumber(employee.getBankCardNumber());
			employeeDto.setOvertime(employee.getOvertime());
			employeeDto.setMealsSubsidy(employee.getMealsSubsidy());
			employeeDto.setSecrecySubsidy(employee.getSecrecySubsidy());
			employeeDto.setCommunicationFee(employee.getCommunicationFee());
			employeeDtos.add(employeeDto);
		}

		MiniResponse<List<EmployeeDto>> response = new MiniResponse<>();
		response.setTotal(count);
		response.setData(employeeDtos);

		return response;
	}

}