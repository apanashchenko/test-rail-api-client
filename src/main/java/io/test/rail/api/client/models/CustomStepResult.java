package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-07
 */
@Data
public class CustomStepResult {

    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("expected")
    @Expose
    private String expected;
    @SerializedName("actual")
    @Expose
    private String actual;
    @SerializedName("status_id")
    @Expose
    private Integer statusId;
}
