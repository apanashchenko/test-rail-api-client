package io.test.rail.api.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;


/**
 * Created by alpa on 2018-12-06
 */
@Data
public class ResultField {

    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("display_order")
    @Expose
    private Integer displayOrder;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("system_name")
    @Expose
    private String systemName;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;
    @SerializedName("configs")
    @Expose
    private List<Config> configs;

}
