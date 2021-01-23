<!DOCTYPE html>
<html>
    <head>
        <title>CoolMeeting会议管理系统</title>
        <link rel="stylesheet" href="styles/common.css"/>
        <style type="text/css">
            
        </style>
    </head>
    <body>
    <#include './top.ftl'>
        <div class="page-body">
            <div class="page-sidebar">
                <div class="sidebar-menugroup">
                    <div class="sidebar-grouptitle">个人中心</div>
                    <ul class="sidebar-menu">
                        <li class="sidebar-menuitem"><a href="notifications.ftl">最新通知</a></li>
                        <li class="sidebar-menuitem active"><a href="mybookings.ftl">我的预定</a></li>
                        <li class="sidebar-menuitem"><a href="mymeetings.ftl">我的会议</a></li>
                    </ul>
                </div>
                <div class="sidebar-menugroup">
                    <div class="sidebar-grouptitle">人员管理</div>
                    <ul class="sidebar-menu">
                        <li class="sidebar-menuitem"><a href="departments.ftl">部门管理</></li>
                        <li class="sidebar-menuitem"><a href="register.ftl">员工注册</a></li>
                        <li class="sidebar-menuitem"><a href="approveaccount.ftl">注册审批</a></li>
                        <li class="sidebar-menuitem"><a href="searchemployees.ftl">搜索员工</a></li>
                    </ul>
                </div>
                <div class="sidebar-menugroup">
                    <div class="sidebar-grouptitle">会议预定</div>
                    <ul class="sidebar-menu">
                        <li class="sidebar-menuitem"><a href="addmeetingroom.ftl">添加会议室</a></li>
                        <li class="sidebar-menuitem"><a href="meetingrooms.ftl">查看会议室</a></li>
                        <li class="sidebar-menuitem"><a href="bookmeeting.ftl">预定会议</a></li>
                        <li class="sidebar-menuitem"><a href="searchmeetings.ftl">搜索会议</a></li>
                    </ul>
                </div>
            </div>
            <div class="page-content">
                <div class="content-nav">
                    人员管理 > 注册审批
                </div>
                <table class="listtable">
                    <caption>所有待审批注册信息：</caption>
                    <tr class="listheader">
                        <th>姓名</th>
                        <th>账号名</th>
                        <th>联系电话</th>
                        <th>电子邮件</th>
                        <th>操作</th>
                    </tr>
                    <tr>
                        <td>周海</td>
                        <td>Jerry</td>
                        <td>13800138000</td>
                        <td>jerry@chinasofti.com</td>
                        <td>
                            <input type="button" class="clickbutton" value="通过"/>
                            <input type="button" class="clickbutton" value="删除"/>
                        </td>
                    </tr>
                    <tr>
                        <td>周海</td>
                        <td>Jerry</td>
                        <td>13800138000</td>
                        <td>jerry@chinasofti.com</td>
                        <td>
                            <input type="button" class="clickbutton" value="通过"/>
                            <input type="button" class="clickbutton" value="删除"/>
                        </td>
                    </tr>
                    <tr>
                        <td>周海</td>
                        <td>Jerry</td>
                        <td>13800138000</td>
                        <td>jerry@chinasofti.com</td>
                        <td>
                            <input type="button" class="clickbutton" value="通过"/>
                            <input type="button" class="clickbutton" value="删除"/>
                        </td>
                    </tr>
                    <tr>
                        <td>周海</td>
                        <td>Jerry</td>
                        <td>13800138000</td>
                        <td>jerry@chinasofti.com</td>
                        <td>
                            <input type="button" class="clickbutton" value="通过"/>
                            <input type="button" class="clickbutton" value="删除"/>
                        </td>
                    </tr>
                    <tr>
                        <td>周海</td>
                        <td>Jerry</td>
                        <td>13800138000</td>
                        <td>jerry@chinasofti.com</td>
                        <td>
                            <a class="clickbutton" href="#">通过</a>
                            <a class="clickbutton" href="#">删除</a>
                        </td>
                    </tr>
                    <tr>
                        <td>周海</td>
                        <td>Jerry</td>
                        <td>13800138000</td>
                        <td>jerry@chinasofti.com</td>
                        <td>
                            <a class="clickbutton" href="#">通过</a>
                            <a class="clickbutton" href="#">删除</a>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
        <div class="page-footer">
            <hr/>
            更多问题，欢迎联系<a href="mailto:webmaster@eeg.com">管理员</a>
            <img src="images/footer.png" alt="CoolMeeting"/>
        </div>
    </body>
</html>