package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class CustomStepsSeparated {

    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("expected")
    @Expose
    private String expected;

}
