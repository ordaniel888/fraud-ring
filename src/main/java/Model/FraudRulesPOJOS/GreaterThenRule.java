package Model.FraudRulesPOJOS;

import Model.RequestPOJOS.PotentialFraudRequest;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GreaterThenRule extends FraudRule{

    private final String field;

    private final String value;

    @JsonProperty(value = "gt", required = true)
    private FieldValue greaterThen;

    @JsonCreator
    public GreaterThenRule(@JsonProperty(value = "gt", required = true) FieldValue greaterThen) {
        this.field = greaterThen.getField();
        this.value = greaterThen.getValue();
        this.greaterThen = greaterThen;
    }


    public static GreaterThenRule fromFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(new File("").getAbsolutePath() + path));
        String strJson = new String(encoded, Charset.defaultCharset());
        ObjectMapper mapper = new ObjectMapper();
        return new ObjectMapper().readValue(strJson, GreaterThenRule.class);
    }

    public FieldValue getGreaterThen() {
        return greaterThen;
    }

    public void setFieldValue() {
        this.greaterThen = greaterThen;
    }

    @Override
    boolean validate(PotentialFraudRequest potentialFraudRequest) {

        return potentialFraudRequest.getField(this.field) > this.value;
    }

    public String field() {
        return field;
    }

    public String value() {
        return value;
    }
}
