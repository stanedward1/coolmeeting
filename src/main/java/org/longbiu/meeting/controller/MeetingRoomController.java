package org.longbiu.meeting.controller;

import org.longbiu.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname MeetingRoomController
 * @Description 查看会议室，会议室详情，添加会议室，会议室预定
 * @Date 2021/8/26 0:31
 * @Author Longbiu
 */
@Controller
public class MeetingRoomController {
    @Autowired
    MeetingRoomService meetingRoomService;
    @RequestMapping("/meetingrooms")
    public String mettingrooms(Model model) {
        model.addAttribute("mrs", meetingRoomService.getAllMr());
        return "meetingrooms";
    }
}
