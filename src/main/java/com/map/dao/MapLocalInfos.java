package com.map.dao;

public class MapLocalInfos {
    private String placeName;

    private String placeId;

    private String placeTitle;

    private String placeLatitude;

    private String placeLongitude;

    private String placeIconpath;

    private String placeContent;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public void setPlaceTitle(String placeTitle) {
        this.placeTitle = placeTitle == null ? null : placeTitle.trim();
    }

    public String getPlaceLatitude() {
        return placeLatitude;
    }

    public void setPlaceLatitude(String placeLatitude) {
        this.placeLatitude = placeLatitude == null ? null : placeLatitude.trim();
    }

    public String getPlaceLongitude() {
        return placeLongitude;
    }

    public void setPlaceLongitude(String placeLongitude) {
        this.placeLongitude = placeLongitude == null ? null : placeLongitude.trim();
    }

    public String getPlaceIconpath() {
        return placeIconpath;
    }

    public void setPlaceIconpath(String placeIconpath) {
        this.placeIconpath = placeIconpath == null ? null : placeIconpath.trim();
    }

    public String getPlaceContent() {
        return placeContent;
    }

    public void setPlaceContent(String placeContent) {
        this.placeContent = placeContent == null ? null : placeContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", placeName=").append(placeName);
        sb.append(", placeId=").append(placeId);
        sb.append(", placeTitle=").append(placeTitle);
        sb.append(", placeLatitude=").append(placeLatitude);
        sb.append(", placeLongitude=").append(placeLongitude);
        sb.append(", placeIconpath=").append(placeIconpath);
        sb.append(", placeContent=").append(placeContent);
        sb.append("]");
        return sb.toString();
    }
}