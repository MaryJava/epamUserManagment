USE [epam]
GO

/****** Object:  Table [dbo].[user]    Script Date: 5/16/2016 6:32:52 PM ******/
DROP TABLE [dbo].[user]
GO

/****** Object:  Table [dbo].[user]    Script Date: 5/16/2016 6:32:52 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[user](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[firstname] [varchar](255) NOT NULL,
	[lastname] [varchar](255) NOT NULL,
	[email] [varchar](255) NOT NULL,
	[password] [varchar](255) NOT NULL,
	[type_id] [int] NOT NULL,
	[status_id] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


