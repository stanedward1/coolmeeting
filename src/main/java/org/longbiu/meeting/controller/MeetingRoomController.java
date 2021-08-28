package org.longbiu.meeting.controller;

import org.longbiu.meeting.model.MeetingRoom;
import org.longbiu.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname MeetingRoomController
 * @Description 查看会议室，会议室详情，添加会议室，会议室预定
 * @Date 2021/8/26 0:31
 * @Author longbiu
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

    @RequestMapping("/roomdetails")
    public String roomdetails(Integer roomid, Model model) {
        model.addAttribute("mr", meetingRoomService.getMrById(roomid));
        return "roomdetails";
    }

    @RequestMapping("/updateroom")
    public String updateroom(MeetingRoom meetingRoom) {
        Integer result = meetingRoomService.updateRoom(meetingRoom);
        if (result == 1) {
            return "redirect:/meetingrooms";
        } else {
            return "forward:/roomdetails";
        }
    }

    @RequestMapping("/admin/addmeetingroom")
    public String addmeetingroom() {
        return "addmeetingroom";
    }

    @RequestMapping("/admin/doAddMr")
    public String doAddMr(MeetingRoom meetingRoom) {
        Integer result = meetingRoomService.addMr(meetingRoom);
        return "redirect:/meetingrooms";
    }
}
