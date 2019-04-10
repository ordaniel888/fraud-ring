package Model.FraudRulesPOJOS;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;

public class FieldValue {

    @JsonProperty(value = "field", required = true)
    private String field;

    @JsonProperty(value = "value", required = true)
    private String value;

    @JsonCreator
    public FieldValue(@JsonProperty(value = "field", required = true) String field,
                      @JsonProperty(value = "value", required = true)String value) {
        this.field = field;
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
