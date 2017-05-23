package com.nitesh.test.dto;

/**
 * Created by nitesh on 21/4/17.
 */
public class HotelChainDTO {

    String hotelId;
    String chainId;

    public HotelChainDTO(String hotelId, String chainId) {
        this.hotelId = hotelId;
        this.chainId = chainId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }
}
