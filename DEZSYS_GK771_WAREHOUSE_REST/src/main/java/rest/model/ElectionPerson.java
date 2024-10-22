package rest.model;

public class ElectionPerson {
    private int listennummer;
    private String name;
    private int anzahlvotes;

    public ElectionPerson(int listennummer, String name, int anzahlvotes) {
        this.listennummer = listennummer;
        this.name = name;
        this.anzahlvotes = anzahlvotes;
    }
    public int getListennummer() {
        return listennummer;
    }

    public void setListennummer(int listennummer) {
        this.listennummer = listennummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlvotes() {
        return anzahlvotes;
    }

    public void setAnzahlvotes(int anzahlvotes) {
        this.anzahlvotes = anzahlvotes;
    }
}
