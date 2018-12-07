package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Config {

    @SerializedName("context")
    @Expose
    private Context context;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("options")
    @Expose
    private Options options;
    @SerializedName("group_id")
    @Expose
    private Integer groupId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;

}
