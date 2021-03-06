package com.dms.dao;

import com.dms.dto.FinanceDto;
import com.dms.dto.ProjectCommissionDto;
import com.dms.request.DataGridRequest;
import com.dms.request.ProjectCommissionFilterRequest;

import java.util.Date;
import java.util.List;

public interface ProjectCommissionDao {

	List<ProjectCommissionDto> getProjectCommissions(DataGridRequest request);

	int getProjectCommissionCount(DataGridRequest request);

	ProjectCommissionDto getProjectCommission(String acNumber);

	int getProjects(Date startDate, Date endDate);

	void saveProjectCommission(List<ProjectCommissionDto> projectCommissions);

	int saveProjectCommission(ProjectCommissionDto projectCommission);

	List<ProjectCommissionDto> getProjectCommissions(ProjectCommissionFilterRequest request);

	int getProjectCommissionCount(ProjectCommissionFilterRequest request);

	void updateProjectCommissions(List<ProjectCommissionDto> projectCommissionDtos);

	void updateProjectCommission(ProjectCommissionDto projectCommission);
}
