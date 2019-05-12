package common;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
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

    public static String constructFullRestrictClassName(String simpleClassName,
                                                  List<String> restrictNames) {
        return constructFullRestrictClassName(simpleClassName, restrictNames, "/");
    }

    public static String constructFullRestrictClassName(String simpleClassName,
                                                  List<String> restrictNames,
                                                  String separator) {
        StringBuilder sb = new StringBuilder();
        for (String restrictName: restrictNames) {
            sb.append(restrictName);
            sb.append(separator);
        }
        sb.append(simpleClassName);
        return sb.toString();
    }

    public static String constructDefaultFullRestrictName(String simpleName, List<String> restrictNames) {
        return constructFullRestrictClassName(simpleName, restrictNames);
    }
}
