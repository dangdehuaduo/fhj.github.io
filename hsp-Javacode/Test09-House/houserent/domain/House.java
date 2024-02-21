package houserent.domain;

public class House {
    private int id;
    private String name;
    private String phone;
    private String addr;//地址
    private int rent;//租金
    private String stats;//出租状态

    public House(int id, String name, String phone, String addr, int rent, String stats) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.rent = rent;
        this.stats = stats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + phone + "\t" + addr + "\t" + rent +
                "\t" + stats;
    }
}
