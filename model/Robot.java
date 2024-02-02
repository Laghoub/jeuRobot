package model;

public class Robot {

    private String code;

    public Robot(String code) {
        this.code = code;
    }

    public String executeCode() {
        return ("Robot en cours d'exécution avec le code : " + code);

    }
}
