package me.gogosing.service.impl;

import me.gogosing.message.BarBinding;
import me.gogosing.model.message.BarMessage;
import me.gogosing.service.BarService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
@Service
@EnableBinding(BarBinding.class)
public class BarServiceImpl implements BarService {

    private final BarBinding barBinding;

    public BarServiceImpl(BarBinding barBinding) {
        this.barBinding = barBinding;
    }

    @Override
    public void publishMessage(String contents) {
        barBinding.publish()
            .send(
                MessageBuilder.withPayload(new BarMessage(contents))
                .build()
            );
    }
}
