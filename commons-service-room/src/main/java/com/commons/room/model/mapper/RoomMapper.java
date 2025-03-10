package com.commons.room.model.mapper;

import com.commons.room.model.DTO.RoomDTO;
import com.commons.room.model.DTO.RoomResponse;
import com.commons.room.model.Room;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMapper {

    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    @Mapping(target = "id", ignore = true)
    Room roomDTOToRoom(RoomDTO roomDTO);

    RoomResponse roomToRoomResponse(Room room);

    @Mapping(target = "id", ignore = true)
    Room roomResponseToRoom(RoomResponse roomResponse);


}
