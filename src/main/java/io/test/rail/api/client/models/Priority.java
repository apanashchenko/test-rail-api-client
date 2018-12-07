package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Priority {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("short_name")
    @Expose
    private String shortName;
}
