package org.longbiu.meeting.mapper;

import org.longbiu.meeting.model.MeetingRoom;

import java.util.List;

/**
 * @Classname MeetingRoomMapper.xml
 * @Description MeetingRoom的dao层/mapper层
 * @Date 2021/8/26 0:37
 * @Author Longbiu
 */
public interface MeetingRoomMapper {
    List<MeetingRoom> getAllMr();
}
