import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String in = QuickScan.get("What version of english do you speak? (CA,US): ", false);
        LangCode code = LangCode.OTHER;

        if(in.equals("CA")){
            code = LangCode.EN_CA;
        }
        else if(in.equals("US")){
            code = LangCode.EN_US;
        }

        TString t = new TString(code, new HashMap<>(Map.of(LangCode.EN_CA, "Hello World. In Canada it's colour", LangCode.EN_US, "Hello World. In America it's color")));
        System.out.println(t);
    }
}