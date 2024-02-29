package com.compass.challenge.msnotification.application.dto.mapper;

import com.compass.challenge.msnotification.application.Notification;
import com.compass.challenge.msnotification.application.dto.DataNotification;
import com.compass.challenge.msnotification.application.dto.UserResponseDto;
import org.modelmapper.ModelMapper;

public class NotificationMapper {
    public static DataNotification toDto(UserResponseDto userResponseDto) {
        return new ModelMapper().map(userResponseDto, DataNotification.class);
    }

    public static UserResponseDto toUserResponseDto(DataNotification dto) {
        return new ModelMapper().map(dto, UserResponseDto.class);
    }
    public static Notification toNotification(DataNotification dto) {
        return new ModelMapper().map(dto, Notification.class);
    }


}
