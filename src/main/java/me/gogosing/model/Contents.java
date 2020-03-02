package me.gogosing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
public class Contents {

    @JsonProperty(value = "text")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
