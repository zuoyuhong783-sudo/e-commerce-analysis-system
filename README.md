电商平台数据分析与报表系统
这是一个基于 Spring Boot 和 Vue.js 构建的全栈电商项目，其核心特色是强大的后台数据分析与可视化报表系统，旨在将原始交易数据转化为直观的商业洞察。

项目预览
<img width="2365" height="1272" alt="5eef50a84cf17941b4052905c3c1ee89" src="https://github.com/user-attachments/assets/71ae1fff-a8a6-4e3f-b1e8-3cb802585577" />
<img width="1948" height="1226" alt="ab0f8268d4c1ce2be2bb5fe9a79e94f9" src="https://github.com/user-attachments/assets/f201bd03-7ebb-4e34-b708-f5b3ec21f69d" />


技术栈 (Tech Stack)
后端: Spring Boot, Spring MVC, Mybatis, JWT

前端: Vue.js, Element UI

数据库: MySQL

中间件: Redis (数据缓存)

部署: Docker

核心功能 (Features)
B端 - 管理后台
数据仪表盘 (Dashboard): 实时统计营业额、用户数、订单量等核心KPI。

报表管理:

生成销量排名TOP10报表。

支持按时间范围导出运营数据Excel报表。

订单管理: 实现接单、派单、取消等全流程订单状态管理。

商品管理: 包括分类管理、商品（蔬菜/套餐）的增删改查及起售/停售。

员工管理: 完善的后台员工权限管理。

C端 - 用户端
微信登录: 集成微信API，实现用户授权登录。

商品浏览与购物车: 完整的在线购物流程。

在线下单与订单管理: 支持用户下单、查看历史订单、取消订单等。

项目亮点 (Highlights)
商业智能(BI)应用: 项目的核心价值在于其后台的数据统计与分析能力，将抽象的销售数据转化为可指导运营决策的可视化图表。

高并发架构: 通过引入Redis和RabbitMQ，对系统性能进行了优化，确保在高并发场景下的稳定性和良好用户体验。
