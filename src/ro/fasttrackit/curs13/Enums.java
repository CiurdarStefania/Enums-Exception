package ro.fasttrackit.curs13;

public enum  Enums {
    LUNI,
    MARTI,
    MIERCURI,
    JOI,
    VINERI,
    SAMBATA,
    DUMINICA
}
class Main{
    public static void main(String[] args) {
        zileleSaptamani(Enums.MARTI);
    }

    private static void zileleSaptamani(Enums enums) {
        switch (enums){
            case LUNI:
                System.out.println("Luni");
                break;
            case MARTI:
                System.out.println("Marti");
                break;
            case MIERCURI:
                System.out.println("Miercuri");
                break;
            case JOI:
                System.out.println("Joi");
                break;
            case VINERI:
                System.out.println("Viner");
                break;
            case SAMBATA:
                System.out.println("Sambata");
                break;
            case DUMINICA:
                System.out.println("Duminica");
                break;

        }
    }
}
