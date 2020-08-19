package com.example.demo.recordController;

import com.example.demo.controller.RecordController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

@SpringBootTest
public class RecordControllerTest {

    @MockBean
    RecordController recordController;

    @Test
    public void testFindRecord() throws Exception{
        String id = recordController.findRecord();

        Assert.notNull("The random id return null", id);
    }
}
