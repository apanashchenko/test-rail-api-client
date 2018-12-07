package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class Context {
    @SerializedName("is_global")
    @Expose
    private Boolean isGlobal;
    @SerializedName("project_ids")
    @Expose
    private Object projectIds;

}
