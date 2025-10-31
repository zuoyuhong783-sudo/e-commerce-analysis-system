电商平台数据分析与报表系统（后端演示）

项目预览
<img width="2365" height="1272" alt="5eef50a84cf17941b4052905c3c1ee89" src="https://github.com/user-attachments/assets/71ae1fff-a8a6-4e3f-b1e8-3cb802585577" />
<img width="1948" height="1226" alt="ab0f8268d4c1ce2be2bb5fe9a79e94f9" src="https://github.com/user-attachments/assets/f201bd03-7ebb-4e34-b708-f5b3ec21f69d" />


项目定位 (Project Positioning)

本项目是一个已交付的后端数据服务，其核心是为电商运营提供强大的数据分析、报表生成与业务支撑。项目的重点在于后端的数据处理、BI分析能力和接口设计，而非前端UI实现。

项目的前端（B端管理后台）被规划为调用这些API的数据可视化面板。

本项目的功能已全部通过后端的API实现，并可通过 Swagger UI 进行完整的测试与交互。

项目演示 (Project Demo)

本后端服务已集成 Swagger UI，它提供了专业且可交互的 API 文档，扮演了项目“UI界面”的角色。

如何使用:

（请在此处填写你启动后端服务的步骤，例如：运行 ECommerceApplication.java）

后端启动后，请访问：http://localhost:8080/doc.html

您可以在 Swagger 界面上浏览所有 API 接口，并直接在线测试（例如：调用报表生成接口、查询订单数据等）。

技术栈 (Tech Stack)

后端 (Backend): Spring Boot, Spring MVC, Mybatis, JWT

数据库 (Database): MySQL

中间件 (Middleware): Redis (数据缓存), RabbitMQ (高并发消息队列)

部署 (Deployment): Docker

核心API功能 (Core API Features)

本项目通过API提供了以下业务能力：

1. BI数据分析与报表 (BI & Reporting APIs)

数据仪表盘 (Dashboard): 提供API接口，实时返回营业额、用户数、订单量等核心KPI。

报表管理 (Reports):

提供 GET /api/report/sales_top10 接口，返回销量排名TOP10的商品数据。

提供 GET /api/report/export 接口，支持按时间范围导出运营数据Excel报表。

2. B端 - 核心业务管理 (Business Management APIs)

订单管理: 提供订单（接单、派单、取消）的全流程状态管理的API。

商品管理: 提供商品分类、商品（蔬菜/套餐）的增删改查及起售/停售的API。

员工管理: 提供后台员工增删改查与权限管理的API。

3. C端 - 基础功能 (User-Facing APIs)

微信登录: 提供 POST /api/user/login 接口，集成了微信API实现用户授权登录。

购物流程: 提供商品浏览、购物车管理、在线下单、订单查询等全套API。

项目亮点 (Highlights)

商业智能(BI)应用: 项目的核心价值在于其后台的数据统计与分析能力，将抽象的销售数据通过API转化为可指导运营决策的结构化数据。

高并发架构: 通过引入Redis（数据缓存）和RabbitMQ（异步处理订单），对系统性能进行了优化，确保在高并发场景下API的稳定性和良好用户体验。
