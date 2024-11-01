class Driver {
    private String name;
    private String lastname;
    private String identityNumber;
    private String licenseNumber;

    public Driver setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Driver setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getLastname() {
        return this.lastname;
    }

    public Driver setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
        return this;
    }

    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public Driver setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }
}