package org.longbiu.meeting.service;

import org.longbiu.meeting.controller.MeetingRoomController;
import org.longbiu.meeting.mapper.MeetingRoomMapper;
import org.longbiu.meeting.model.MeetingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname MeetingRoomService
 * @Description 会议室的 service层
 * @Date 2021/8/26 0:43
 * @Author longbiu
 */
@Service
public class MeetingRoomService {
    @Autowired
    MeetingRoomMapper meetingRoomMapper;

    public List<MeetingRoom> getAllMr() {
        return meetingRoomMapper.getAllMr();
    }

    public MeetingRoom getMrById(Integer roomid) {
        return meetingRoomMapper.getMrById(roomid);
    }

    public Integer updateRoom(MeetingRoom meetingRoom) {
        return meetingRoomMapper.updateRoom(meetingRoom);
    }

    public Integer addMr(MeetingRoom meetingRoom) {
        return meetingRoomMapper.addMr(meetingRoom);
    }
}
