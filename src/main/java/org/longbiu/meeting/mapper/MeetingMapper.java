package org.longbiu.meeting.mapper;

import org.longbiu.meeting.model.Meeting;

/**
 * @Classname MeetingMapper
 * @Description
 * @Date 2021/9/11 14:14
 * @Author longbiu
 */
public interface MeetingMapper {
    Integer addMeeting(Meeting meeting);

    void addParticipants(Integer meetingid, Integer[] mps);
}
