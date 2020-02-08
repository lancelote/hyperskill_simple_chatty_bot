package stage4.hw8;

class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    public Phone(String ownerName, String number) {
        this.ownerName = ownerName;
        this.number = number;
    }

    public Phone(String ownerName, String countryCode, String cityCode, String number) {
        this(ownerName, number);
        this.countryCode = countryCode;
        this.cityCode = cityCode;
    }
}
