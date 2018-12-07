package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-07
 */
@Data
public class Milestone {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("start_on")
    @Expose
    private Integer startOn;
    @SerializedName("started_on")
    @Expose
    private Object startedOn;
    @SerializedName("is_started")
    @Expose
    private Boolean isStarted;
    @SerializedName("due_on")
    @Expose
    private Integer dueOn;
    @SerializedName("is_completed")
    @Expose
    private Boolean isCompleted;
    @SerializedName("completed_on")
    @Expose
    private Object completedOn;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("parent_id")
    @Expose
    private Object parentId;
    @SerializedName("url")
    @Expose
    private String url;
}
