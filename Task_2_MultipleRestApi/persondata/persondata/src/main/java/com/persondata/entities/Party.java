package com.persondata.entities;

public class Party {
    private String partyId;
    private String partyEnumTypeId;

    public Party() {
    }

    public Party(String partyId, String partyEnumTypeId) {
        this.partyId = partyId;
        this.partyEnumTypeId = partyEnumTypeId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyEnumTypeId() {
        return partyEnumTypeId;
    }

    public void setPartyEnumTypeId(String partyEnumTypeId) {
        this.partyEnumTypeId = partyEnumTypeId;
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Party{" +
                "partyId='" + partyId + '\'' +
                ", partyEnumTypeId='" + partyEnumTypeId + '\'' +
                '}';
    }
}
