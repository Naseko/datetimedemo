package ru.agaf.tests.datetimedemo.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import ru.agaf.tests.datetimedemo.model.DemoModel;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "demo")
public class DemoEntity {
    @Id
    @GeneratedValue
    private Long id;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "input_value", columnDefinition = "jsonb")
    private DemoModel inputValue;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "output_value", columnDefinition = "jsonb")
    private DemoModel outputValue;
}

