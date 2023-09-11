package ru.agaf.tests.datetimedemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DemoModel {
    @NotNull
    String name;
    @NotNull
    public OffsetDateTime timestamp;
}
