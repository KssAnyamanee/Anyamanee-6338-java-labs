package somsuk.anyamanee.lab6;

import java.util.ArrayList;

abstract class Competition {
    protected String name;
    protected String region;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    abstract void setDescription();

    abstract void setSponsorship(ArrayList<String> sponsors);

}
