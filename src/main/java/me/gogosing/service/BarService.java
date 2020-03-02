package me.gogosing.service;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
public interface BarService {

    /**
     * bar service 로 message publish.
     * @param contents 발행 메시지 내용.
     */
    void publishMessage(String contents);
}
