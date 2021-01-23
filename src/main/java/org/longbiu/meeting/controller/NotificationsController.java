package org.longbiu.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname NotificationsController
 * @Description TODO
 * @Date 2021/1/23 16:20
 * @Author LongBiu
 */
@Controller
public class NotificationsController {
    @GetMapping("/notifications")
    public String notifications(){
        return "notifications";
    }
}
