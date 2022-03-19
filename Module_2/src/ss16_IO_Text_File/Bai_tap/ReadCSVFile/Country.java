package ss16_IO_Text_File.Bai_tap.ReadCSVFile;

public class Country {
    private int id;
    private String codeCountry;
    private String nameCountry;

    public Country() {
    }

    public Country(int id, String codeCountry, String nameCountry) {
        this.id = id;
        this.codeCountry = codeCountry;
        this.nameCountry = nameCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", codeCountry='" + codeCountry + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                '}';
    }
}
