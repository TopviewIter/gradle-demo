###gradle学习
------
缺点：<br/>
1. 无法做到像maven那样一旦pom.xml进行了修改就自动去更新那些引入的jar包,只能在每次修改了build.gradle文件后手动去refresh all<br/>
<p>
2. 用自带的jettyRun命令有点坑,它会一直卡在`Gradle Build on ****`,一直是8%...一直是8%...,虽然页面能够访问,但代码却不能进行修改了,不知道是不是我配置文件的问题,不过最后找到了解决方法,直接用tomcat跑,哈哈<br/>
<p>
3. 构建仓库文件的方式与maven不同,也就是说虽然能使用maven的本地仓库,但如果把gradle下载的jar也放到这个仓库,那么就会造成混乱<br/>