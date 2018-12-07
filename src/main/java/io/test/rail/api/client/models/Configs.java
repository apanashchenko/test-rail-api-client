package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Configs {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("configs")
    @Expose
    private List<Config> configs;

}
