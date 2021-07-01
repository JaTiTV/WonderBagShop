package de.jatitv.wonderbagshop.system;

import java.util.ArrayList;
import java.util.List;

public class Replace {

    public static String replace(String Text) {
        return Text.replace("[prefix]", Main.Prefix).replace("&", "§").replace("[ue]", "ü")
                .replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä");
    }

    public static List<String> replace(List<String> Text) {
        List<String> output = new ArrayList<>();
        for (String input : Text) {
            output.add(input.replace("[prefix]", Main.Prefix).replace("&", "§")
                    .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö")
                    .replace("[OE]", "Ö").replace("[ae]", "ä").replace("[AE]", "Ä"));
        }
        return output;
    }


    public static List replacePrice(List<String> Text, String price) {
        List rp = new ArrayList();
        for (String s : Text) {
            rp.add(s.replace("[prefix]", Main.Prefix).replace("&", "§")
                    .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö")
                    .replace("[OE]", "Ö").replace("[ae]", "ä").replace("[AE]", "Ä")
                    .replace("[price]", String.valueOf(price)));
        }
        return rp;
    }
}
