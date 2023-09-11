package ru.agaf.tests.datetimedemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.agaf.tests.datetimedemo.model.DemoModel;

import java.util.Map;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {
    private final IOService ioService;

    public DemoServiceImpl(IOService ioService){
        this.ioService = ioService;
    }
    @Override
    public void start(){
        Map<DemoModel, DemoModel> messages = ioService.getMessages();
        for(DemoModel demo : messages.values()){
            log.info("Next value: {}", demo);
        }
    }
}
