package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Status {

    @SerializedName("color_bright")
    @Expose
    private Integer colorBright;
    @SerializedName("color_dark")
    @Expose
    private Integer colorDark;
    @SerializedName("color_medium")
    @Expose
    private Integer colorMedium;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_final")
    @Expose
    private Boolean isFinal;
    @SerializedName("is_system")
    @Expose
    private Boolean isSystem;
    @SerializedName("is_untested")
    @Expose
    private Boolean isUntested;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("name")
    @Expose
    private String name;
}
