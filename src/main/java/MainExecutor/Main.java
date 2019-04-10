package MainExecutor;

import Model.FraudRulesPOJOS.GreaterThenRule;
import Model.RequestPOJOS.PotentialFraudRequest;
import Model.FraudRulesPOJOS.FraudRule;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private Map<String, FraudRule> fraudRules = new HashMap<>();

    public static void main(String[] args) throws IOException {

        GreaterThenRule fraudRule = GreaterThenRule.fromFile("/src/main/resources/jsonRules/1.json");
        PotentialFraudRequest potentialFraudRequest = PotentialFraudRequest.fromFile("/src/main/resources/jsonRequests/1.json");
    }
}
