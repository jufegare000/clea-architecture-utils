package com.clean_architecture_utils.stoicism.data;

import java.util.List;

public class Messages {

    private static final Messages INSTANCE = new Messages();

    public Messages(){}

    public static Messages getInstance(){
        return INSTANCE;
    }

    public List<StoicMessage> getMotivationalMessages() {
        return List.of(senecaMessage(), marcoAurelioMessage(), epictetoMessage()
                , senecaMessage2(), marcoAurelioMessage2(), epictetoMessage2()
                , senecaMessage3(), marcoAurelioMessage3(), epictetoMessage3(), senecaMessage4());
    }

    private StoicMessage senecaMessage() {
        return new StoicMessage("Seneca",
                " 4 a.C. - 65 d.C", " No es que tengamos poco tiempo, sino que perdemos mucho." +
                "Fuente: Sobre la brevedad de la vida (49 d.C.)");
    }

    private StoicMessage marcoAurelioMessage() {
        return new StoicMessage("Marco Aurelio",
                "121 - 180 d.C.", " La felicidad de tu vida depende de la calidad de tus pensamientos. " +
                "Fuente: Meditaciones (c. 180 d.C.)");
    }

    private StoicMessage epictetoMessage() {
        return new StoicMessage("Epicteto",
                "121 - 180 d.C.",
                " No nos afecta lo que sucede, sino nuestra" +
                        " interpretación de lo que sucede. Fuente: Enchiridion (c. 135 d.C.)");
    }

    private StoicMessage senecaMessage2() {
        return new StoicMessage("Séneca",
                "4 a.C. - 65 d.C.", "Es propio de un hombre sabio conocer sus " +
                "propias limitaciones y saber cuándo detenerse " +
                "Fuente: Sobre la ira (c. 33 d.C.)");
    }

    private StoicMessage marcoAurelioMessage2() {
        return new StoicMessage("Marco Aurelio",
                " 121 - 180 d.C.", "No pierdas más tiempo discutiendo sobre lo que" +
                " debería ser un buen hombre. Sé uno." +
                "Fuente: Meditaciones (c. 180 d.C.)");
    }

    private StoicMessage epictetoMessage2() {
        return new StoicMessage("Epicteto",
                "50 - 135 d.C.",
                "La libertad es el único bien que nadie puede quitarte si no se lo das tú mismo." +
                        "Fuente: Disertaciones (c. 135 d.C.)");
    }

    private StoicMessage senecaMessage3() {
        return new StoicMessage("Seneca",
                " 4 a.C. - 65 d.C", "La vida es como una obra de teatro: no importa cuán larga sea, sino cuán bien se actúe." +
                "Fuente: Sobre la tranquilidad del ánimo (c. 59 d.C.)");
    }

    private StoicMessage marcoAurelioMessage3() {
        return new StoicMessage("Marco Aurelio",
                " 121 - 180 d.C.", "El universo está cambiando; nuestra vida es lo que nuestros pensamientos la hacen." +
                "Fuente: Meditaciones (c. 180 d.C.)");
    }

    private StoicMessage epictetoMessage3() {
        return new StoicMessage("Epicteto",
                "50 - 135 d.C.",
                " No es la muerte lo que un hombre debe temer, sino que nunca empezará a vivir." +
                        "Fuente: Disertaciones (c. 135 d.C.)");
    }

    private StoicMessage senecaMessage4() {
        return new StoicMessage("Seneca",
                " 4 a.C. - 65 d.C", "Los problemas no están en el mundo, sino en nuestra forma de ver el mundo." +
                "Fuente: Sobre la felicidad (c. 58 d.C.)");
    }

}
