GO
CREATE TABLE [dbo].[Project_Commision](
	[id] [int] NULL,
	[designer] [nvarchar](50) NULL,
	[ac_number] [varchar](6) NULL,
	[contract_id] [varchar](20) NULL,
	[customer_name] [varchar](20) NULL,
	[contract_total] [decimal](18, 2) NULL,
	[purchase_agent_fee] [decimal](18, 2) NULL,
	[project_change_total] [decimal](18, 2) NULL,
	[branch] [varchar](20) NULL,
	[customer_pay] [decimal](18, 2) NULL,
	[pay_contract_ratio] [decimal](18, 2) NULL,
	[pay_project_ratio] [decimal](18, 2) NULL,
	[contract_state] [int] NULL,
	[contract_date] [datetime] NULL,
	[actual_start_time] [datetime] NULL,
	[actual_end_time] [datetime] NULL,
	[balance_time] [datetime] NULL,
	[desginer_assistant] [varchar](20) NULL,
	[first_commision] [decimal](18, 2) NULL,
	[first_commision_date] [datetime] NULL,
	[balance_commision] [decimal](18, 2) NULL,
	[balance_commision_date] [datetime] NULL,
	[design_commision_rate] [decimal](2, 2) NULL,
	[desginer_assistant_commision_rate] [decimal](2, 2) NULL
)