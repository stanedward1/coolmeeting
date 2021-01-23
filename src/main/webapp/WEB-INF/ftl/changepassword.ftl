<!DOCTYPE html>
<html>
    <head>
        <title>CoolMeeting会议管理系统</title>
        <link rel="stylesheet" href="styles/common.css"/>
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
                    修改密码
                </div>
                <form>
                    <fieldset>
                        <legend>修改密码信息</legend>
                        <table class="formtable" style="width:50%">
                            <tr>
                                <td>原密码:</td>
                                <td>
                                    <input id="origin" type="password" />
                                </td>
                            </tr>
                            <tr>
                                <td>新密码:</td>
                                <td>
                                    <input id="new" type="password" />
                                </td>
                            </tr>
                            <tr>
                                <td>确认新密码：</td>
                                <td>
                                    <input id="confirm" type="password"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" class="command">
                                    <input type="submit" value="确认修改" class="clickbutton"/>
                                    <input type="button" value="返回" class="clickbutton" onclick="window.history.back();"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </form>
            </div>
        </div>
        <div class="page-footer">
            <hr/>
            更多问题，欢迎联系<a href="mailto:webmaster@eeg.com">管理员</a>
            <img src="images/footer.png" alt="CoolMeeting"/>
        </div>
    </body>
</html>