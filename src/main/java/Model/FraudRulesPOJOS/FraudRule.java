package Model.FraudRulesPOJOS;

import Model.RequestPOJOS.BrowserIP;
import Model.RequestPOJOS.City;
import Model.RequestPOJOS.Country;
import Model.RequestPOJOS.PotentialFraudRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class FraudRule {
    abstract boolean validate(PotentialFraudRequest potentialFraudRequest);
}
