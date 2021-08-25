package org.longbiu.meeting.service;

import org.longbiu.meeting.mapper.MeetingRoomMapper;
import org.longbiu.meeting.model.MeetingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname MeetingRoomService
 * @Description 会议室的 service层
 * @Date 2021/8/26 0:43
 * @Author Longbiu
 */
@Service
public class MeetingRoomService {
    @Autowired
    MeetingRoomMapper meetingRoomMapper;
    public List<MeetingRoom> getAllMr() {
        return meetingRoomMapper.getAllMr();
    }
}
