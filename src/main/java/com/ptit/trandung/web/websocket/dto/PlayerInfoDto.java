package com.ptit.trandung.web.websocket.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class PlayerInfoDto {
    private String sessionId;

    private String userLogin;

    private String ipAddress;

    private Instant time;

    private PlayerStatusEnum playerStatusEnum;

    private int scoreCurrent;

    private String roomId;
}
