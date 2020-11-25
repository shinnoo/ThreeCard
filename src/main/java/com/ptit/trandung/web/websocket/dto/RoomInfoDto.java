package com.ptit.trandung.web.websocket.dto;

import lombok.Data;

@Data
public class RoomInfoDto {
    private String id;
    private String name;
    private int userCount;
}
