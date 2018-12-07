package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Suite {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("is_master")
    @Expose
    private Boolean isMaster;
    @SerializedName("is_baseline")
    @Expose
    private Boolean isBaseline;
    @SerializedName("is_completed")
    @Expose
    private Boolean isCompleted;
    @SerializedName("completed_on")
    @Expose
    private Object completedOn;
    @SerializedName("url")
    @Expose
    private String url;
}
