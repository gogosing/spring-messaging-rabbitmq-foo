package me.gogosing.message;

import me.gogosing.model.message.BarMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
@Component
@EnableBinding(BarBinding.class)
public class BarMessageListener {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @StreamListener(target = BarBinding.Subscribe)
    public void getBarMessage(BarMessage message) {
        LOGGER.info("message from bar : " + message.getContents());
    }
}
