package Buoi4;

public class TacGia {
    private String id;
    private String FullName;
    private String Address;
    private String sdt;

    public TacGia() {
    }

    public TacGia(String id, String address, String sdt, String fullName) {
        this.id = id;
        Address = address;
        this.sdt = sdt;
        FullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    @Override
    public String toString() {
        return "TacGia{" +
                "id='" + id + '\'' +
                ", FullName='" + FullName + '\'' +
                ", Address='" + Address + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
