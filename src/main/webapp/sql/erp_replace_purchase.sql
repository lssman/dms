CREATE TABLE [dbo].[erp_budget_change](
	[ID] [int] NULL,
	[受理编号] [varbinary](50) NULL,
	[报价系统编号] [int] NULL,
	[变更号] [int] NULL,
	[变更总价] [float] NULL,
	[阶段] [int] NULL,
	[变更类型] [int] NULL,
	[工期调整] [int] NULL,
	[变更说明] [varchar](50) NULL,
	[内部说明] [varchar](50) NULL,
	[提交日期] [datetime] NULL,
	[提交人] [varchar](50) NULL,
	[初审日期] [datetime] NULL,
	[初审人] [varchar](50) NULL,
	[审核日期] [datetime] NULL,
	[审核人] [varchar](50) NULL,
	[确认日期] [datetime] NULL,
	[确认人] [varchar](50) NULL
)