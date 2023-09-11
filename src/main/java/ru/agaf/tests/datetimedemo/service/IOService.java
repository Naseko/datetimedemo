package ru.agaf.tests.datetimedemo.service;

import ru.agaf.tests.datetimedemo.model.DemoModel;

import java.util.Map;

public interface IOService {
     Map<DemoModel, DemoModel> getMessages();
}
