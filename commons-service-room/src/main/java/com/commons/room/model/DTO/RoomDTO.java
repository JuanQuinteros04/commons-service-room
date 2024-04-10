package com.commons.room.model.DTO;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode
public class RoomDTO {

    private Long roomNumber;

    private String typeRoom;

    private Long roomCapacity;

    private Boolean availableRoom;

    private Double pricePerNight;

}