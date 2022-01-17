package com.game.canesta.model;

public class Status {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getDeveloper() {
        return developer;
    }

    private String developer = "Lokesh Deshpande";
    private String applicationName = "Canesta";
    private String status;
}
