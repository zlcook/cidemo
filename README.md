# cidemo
持续集成项目demo，选用工具jenkins、git、github、maven、nexus。
项目是一个普通java程序。

完成的事情：通过持续集成不断的把项目的最新构件自动发布到nexus仓库中，其中会通过反馈机制返回集成的状态和错误报告。（但是反馈好像没起作用，有可能是邮箱配错了，猜测）

完成步骤：
1.搭建环境
2.在github上新建一个cidemo仓库
3.在cidemo新建一个helloword(其实应该取得名字和cidemo一样)任务，源码管理选git，配置仓库连接和git的密钥，配置maven构建命令clean deploy.
4.在A电脑上使用git克隆cidemo仓库到本地，然后手写一个普通的java程序，符合maven的结构目录要求。在提交到github上。
5.执行jenkins的任务构建工作。jenkins先是使用配置git命令从github上拉下程序到本地的工作空间，然后使用配置的maven命令进行编译，部署。项目生成的构件就会根据pom中配置的发布信息发布到nexus仓库中。


第二个demo：
cidemo项目不是一个javaEE项目，目前没有涉及到tomcat，后面会做一个javaEE项目，通过持续集成把项目自动部署到tomcat上。


