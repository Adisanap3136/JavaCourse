package principleOfOop.Shrikantsirinheritance;


class ProgrammingLang {
    private String name, paradigm, creator, extension;
    int year, popularityRank;

    public ProgrammingLang() {
        super();
    }

    public ProgrammingLang(String name, String paradigm, String creator, String extension, int year, int popularityRank) {
        this.name = name;
        this.paradigm = paradigm;
        this.creator = creator;
        this.extension = extension;
        this.year = year;
        this.popularityRank = popularityRank;
    }

    public void displayLang() {
        System.out.println("Programming Language Details");
        System.out.println("Name: " + name + ", Paradigm: " + paradigm + ", Creator: " + creator +
                ", Extension: " + extension + ", Year: " + year + ", Popularity Rank: " + popularityRank);
    }
}

class Java extends ProgrammingLang {
    private String version;
    private boolean isPlatformIndependent;

    public Java() {
        super();
    }

    public Java(String version, boolean isPlatformIndependent,
                String name, String paradigm, String creator, String extension, int year, int popularityRank) {
        super(name, paradigm, creator, extension, year, popularityRank);
        this.version = version;
        this.isPlatformIndependent = isPlatformIndependent;
    }

    public void displayJava() {
        System.out.println("Java Specific Details");
        System.out.println("Version: " + version + ", Platform Independent: " + isPlatformIndependent);
    }
}

public class SingleLevel2 {
    public static void main(String[] args) {
        Java j1 = new Java("Java 21", true, "Java", "OOP", "James Gosling", ".java", 1995, 2);
        j1.displayLang();
        j1.displayJava();
    }
}
