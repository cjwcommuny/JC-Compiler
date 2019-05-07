import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CommonInfrastructure {
    public static boolean hasCommonKey(Map<String, ParserRuleContext> map1,
                                       Map<String, ParserRuleContext> map2) {
        for (Map.Entry<String, ?> entry: map1.entrySet()) {
            String key = entry.getKey();
            if (map2.containsKey(key)) {
                return true;
            }
        }
        return false;
    }
}
