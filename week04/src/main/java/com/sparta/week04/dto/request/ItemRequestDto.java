package com.sparta.week04.dto.request;

import lombok.Getter;
import org.json.JSONObject;

@Getter
public class ItemRequestDto {
    private String title;
    private String link;
    private String image;
    private int lprice;

    public ItemRequestDto(JSONObject itemJson) {
        this.title = itemJson.getString("title");
        this.link = itemJson.getString("link");
        this.image = itemJson.getString("image");
        this.lprice = itemJson.getInt("lprice");
    }

}
