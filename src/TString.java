import java.io.Serializable;
import java.util.HashMap;

public class TString implements Serializable {
    private LangCode lang = LangCode.EN_CA;
    private String value = "TSTRING VALUE NOT SET";
    private HashMap<LangCode, String> translations = new HashMap<>();
    private int registerIndex = -1;

    public TString (LangCode defaultCode, HashMap<LangCode, String> translations){
        this.lang = defaultCode;
        this.translations = translations;
        this.value = translations.get(defaultCode);
        activate();
    }

    public TString(String defaultValue, LangCode code){
        this.value = defaultValue;
        this.lang = code;
        translations.put(lang, value);
        activate();
    }

    public TString(String defaultValue){
        this.value = defaultValue;
        translations.put(lang, value);
    }

    public TString(){
        activate();
    }

    private void activate(){
        registerIndex = TStringRegistry.register(this);
    }

    public String setLang(LangCode code){
        this.lang = code;
        value = translations.get(code);
        return toString();
    }

    @Override
    public String toString() {
        if(value == null)
            value = "TSTRING VALUE NOT SET FOR LANG '" + lang.toString() + "'";
        return value;
    }

}
