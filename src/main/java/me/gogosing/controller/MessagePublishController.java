package me.gogosing.controller;

import me.gogosing.model.Contents;
import me.gogosing.service.BarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
@RestController
@RequestMapping("/v1")
public class MessagePublishController {

    private final BarService barService;

    public MessagePublishController(BarService barService) {
        this.barService = barService;
    }

    @PostMapping("/publish")
    public void publishMessage(@RequestBody Contents contents) {
        barService.publishMessage(contents.getText());
    }
}
