package ru.gridusov.demodwh.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.Duration;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditDTO {
    private Long id;
    private Timestamp createdAt;
    private Long noteId;
    private Long userId;
    private Integer editTime;
}
