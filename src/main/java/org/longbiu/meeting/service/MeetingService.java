package org.longbiu.meeting.service;

import org.longbiu.meeting.mapper.MeetingMapper;
import org.longbiu.meeting.model.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Classname MeetingService
 * @Description
 * @Date 2021/9/11 14:13
 * @Author longbiu
 */
@Service
public class MeetingService {
    @Autowired
    MeetingMapper meetingMapper;
    public Integer addMeeting(Meeting meeting, Integer[] mps) {
        //会议发起的时间
        meeting.setReservationtime(new Date());
        Integer result = meetingMapper.addMeeting(meeting);
        meetingMapper.addParticipants(meeting.getMeetingid(), mps);
        return result;
    }
}
