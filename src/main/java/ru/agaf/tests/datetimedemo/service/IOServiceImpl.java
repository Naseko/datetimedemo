package ru.agaf.tests.datetimedemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.agaf.tests.datetimedemo.model.DemoModel;
import ru.agaf.tests.datetimedemo.entity.DemoEntity;
import ru.agaf.tests.datetimedemo.repository.DemoRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class IOServiceImpl implements IOService {

    @Autowired
    DemoRepository demoRepository;
    @Override
    public Map<DemoModel, DemoModel> getMessages() {
        log.info("Fetching messages...");
        List<DemoEntity> list = demoRepository.findAll();
        log.info("List: {}", list);
        HashMap<DemoModel, DemoModel> map = new HashMap<>();
        for (DemoEntity en : list ) {
            DemoModel inputMessage = en.getInputValue();
            DemoModel outputMessage = en.getOutputValue();
            map.put(inputMessage,outputMessage);
        }
        log.info("Found {} messages", map.size());
        log.info("Map: {}", map);
        return map;
    }
}
