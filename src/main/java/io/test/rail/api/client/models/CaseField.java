package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by alpa on 2019-03-01
 */
public class CaseField {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("system_name")
    @Expose
    private String systemName;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("configs")
    @Expose
    private List<Config> configs = null;
    @SerializedName("display_order")
    @Expose
    private Integer displayOrder;
    @SerializedName("include_all")
    @Expose
    private Boolean includeAll;
    @SerializedName("template_ids")
    @Expose
    private List<Object> templateIds = null;


}
