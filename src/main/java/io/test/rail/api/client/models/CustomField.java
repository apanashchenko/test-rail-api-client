package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * Created by alpa on 2018-12-06
 */
@Data
public class CustomField {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("system_name")
    @Expose
    private String systemName;
    @SerializedName("entity_id")
    @Expose
    private Integer entityId;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;
    @SerializedName("location_id")
    @Expose
    private Integer locationId;
    @SerializedName("display_order")
    @Expose
    private Integer displayOrder;
    @SerializedName("configs")
    @Expose
    private List<Config> configs;
    @SerializedName("is_multi")
    @Expose
    private Integer isMulti;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("status_id")
    @Expose
    private Integer statusId;
    @SerializedName("is_system")
    @Expose
    private Integer isSystem;
    @SerializedName("include_all")
    @Expose
    private Integer includeAll;
    @SerializedName("template_ids")
    @Expose
    private List<Object> templateIds = null;
}
