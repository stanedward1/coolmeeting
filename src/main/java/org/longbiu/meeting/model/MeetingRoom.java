package org.longbiu.meeting.model;

/**
 * @Classname MeetingRoom
 * @Description 会议室的实体类
 * @Date 2021/8/26 0:35
 * @Author longbiu
 */
public class MeetingRoom {
    private Integer roomid;
    private Integer roomnum;
    private String roomname;
    private Integer capacity;
    private Integer status;
    private String description;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Integer roomnum) {
        this.roomnum = roomnum;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
