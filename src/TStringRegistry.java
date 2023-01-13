import java.util.ArrayList;

public class TStringRegistry {
    private static final ArrayList<TString> registry = new ArrayList<>();
    public static int register(TString str){
        registry.add(str);
        return registry.size()-1;
    }

    public static void setLang(LangCode code){
        registry.forEach((str) -> {
            str.setLang(code);
        });
    }

    public TString get(int i){
        return registry.get(i);
    }

    public ArrayList<TString> getRegistry(){
        return registry;
    }
}
