CREATE TABLE [dbo].[contract_info](
	[ID] [bigint] NULL,
	[ACNumber] [varchar](50) NOT NULL,
	[ERP_type] [int] NOT NULL,
	[client_id] [varchar](20) NULL,
	[contract_id] [varchar](20) NULL,
	[house_area] [float] NULL,
	[house_stype] [varchar](20) NULL,
	[contract_date] [datetime] NULL,
	[project_total] [money] NULL,
	[discount] [money] NULL,
	[contract_total] [money] NULL,
	[start_time] [datetime] NULL,
	[actual_start_time] [datetime] NULL,
	[actual_start_time2] [nvarchar](50) NULL,
	[stat_pending] [bit] NULL,
	[end_time] [datetime] NULL,
	[actual_end_time] [datetime] NULL,
	[end_proof] [datetime] NULL,
	[balance_time] [datetime] NULL,
	[end_balance] [datetime] NULL,
	[filing_time] [datetime] NULL,
	[designer] [nvarchar](50) NULL,
	[state] [int] NULL
)