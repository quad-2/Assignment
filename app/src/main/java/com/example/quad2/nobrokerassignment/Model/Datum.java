
package com.example.quad2.nobrokerassignment.Model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("shortlistedByLoggedInUser")
    @Expose
    private boolean shortlistedByLoggedInUser;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("leaseType")
    @Expose
    private String leaseType;
    @SerializedName("floor")
    @Expose
    private long floor;
    @SerializedName("totalFloor")
    @Expose
    private long totalFloor;
    @SerializedName("propertySize")
    @Expose
    private long propertySize;
    @SerializedName("latitude")
    @Expose
    private double latitude;
    @SerializedName("longitude")
    @Expose
    private double longitude;
    @SerializedName("propertyAge")
    @Expose
    private long propertyAge;
    @SerializedName("accurateLocation")
    @Expose
    private boolean accurateLocation;
    @SerializedName("pinCode")
    @Expose
    private long pinCode;
    @SerializedName("active")
    @Expose
    private boolean active;
    @SerializedName("negotiable")
    @Expose
    private boolean negotiable;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("society")
    @Expose
    private String society;
    @SerializedName("propertyType")
    @Expose
    private String propertyType;
    @SerializedName("bathroom")
    @Expose
    private long bathroom;
    @SerializedName("cupBoard")
    @Expose
    private long cupBoard;
    @SerializedName("parking")
    @Expose
    private String parking;
    @SerializedName("inactiveReason")
    @Expose
    private Object inactiveReason;
    @SerializedName("swimmingPool")
    @Expose
    private boolean swimmingPool;
    @SerializedName("gym")
    @Expose
    private boolean gym;
    @SerializedName("furnishing")
    @Expose
    private String furnishing;
    @SerializedName("lift")
    @Expose
    private boolean lift;
    @SerializedName("propertyCode")
    @Expose
    private Object propertyCode;
    @SerializedName("amenities")
    @Expose
    private String amenities;
    @SerializedName("availableFrom")
    @Expose
    private long availableFrom;
    @SerializedName("creationDate")
    @Expose
    private long creationDate;
    @SerializedName("lastUpdateDate")
    @Expose
    private long lastUpdateDate;
    @SerializedName("activationDate")
    @Expose
    private long activationDate;
    @SerializedName("facing")
    @Expose
    private String facing;
    @SerializedName("localityId")
    @Expose
    private String localityId;
    @SerializedName("nbLocality")
    @Expose
    private String nbLocality;
    @SerializedName("managed")
    @Expose
    private Object managed;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("amenitiesMap")
    @Expose
    private AmenitiesMap amenitiesMap;
    @SerializedName("powerBackup")
    @Expose
    private String powerBackup;
    @SerializedName("waterSupply")
    @Expose
    private String waterSupply;
    @SerializedName("rent")
    @Expose
    private long rent;
    @SerializedName("deposit")
    @Expose
    private long deposit;
    @SerializedName("sharedAccomodation")
    @Expose
    private boolean sharedAccomodation;
    @SerializedName("accomodationType")
    @Expose
    private String accomodationType;
    @SerializedName("balconies")
    @Expose
    private long balconies;
    @SerializedName("buildingType")
    @Expose
    private String buildingType;
    @SerializedName("forLease")
    @Expose
    private Object forLease;
    @SerializedName("typeDesc")
    @Expose
    private String typeDesc;
    @SerializedName("detailUrl")
    @Expose
    private String detailUrl;
    @SerializedName("propertyTitle")
    @Expose
    private String propertyTitle;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("tenantTypeDesc")
    @Expose
    private String tenantTypeDesc;
    @SerializedName("loanAvailable")
    @Expose
    private boolean loanAvailable;
    @SerializedName("dateOnly")
    @Expose
    private long dateOnly;
    @SerializedName("accomodationTypeDesc")
    @Expose
    private String accomodationTypeDesc;
    @SerializedName("furnishingDesc")
    @Expose
    private String furnishingDesc;
    @SerializedName("secondaryTitle")
    @Expose
    private String secondaryTitle;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("photoAvailable")
    @Expose
    private boolean photoAvailable;
    @SerializedName("adminEvent")
    @Expose
    private String adminEvent;
    @SerializedName("facingDesc")
    @Expose
    private String facingDesc;
    @SerializedName("parkingDesc")
    @Expose
    private String parkingDesc;

    public Datum() {
    }

    public Datum(boolean shortlistedByLoggedInUser, String id, String shortUrl, String description, String leaseType,
                 long floor, long totalFloor, long propertySize, double latitude, double longitude, long propertyAge,
                 boolean accurateLocation, long pinCode, boolean active, boolean negotiable, String type, String city,
                 String locality, String street, String society, String propertyType, long bathroom, long cupBoard,
                 String parking, Object inactiveReason, boolean swimmingPool, boolean gym, String furnishing,
                 boolean lift, Object propertyCode, String amenities, long availableFrom, long creationDate,
                 long lastUpdateDate, long activationDate, String facing, String localityId, String nbLocality,
                 Object managed, String location, Score score, String ownerId, AmenitiesMap amenitiesMap,
                 String powerBackup, String waterSupply, long rent, long deposit, boolean sharedAccomodation,
                 String accomodationType, long balconies, String buildingType, Object forLease, String typeDesc,
                 String detailUrl, String propertyTitle, String title, String tenantTypeDesc, boolean loanAvailable,
                 long dateOnly, String accomodationTypeDesc, String furnishingDesc, String secondaryTitle, List<Photo> photos,
                 boolean photoAvailable, String adminEvent, String facingDesc, String parkingDesc) {
        super();
        this.shortlistedByLoggedInUser = shortlistedByLoggedInUser;
        this.id = id;
        this.shortUrl = shortUrl;
        this.description = description;
        this.leaseType = leaseType;
        this.floor = floor;
        this.totalFloor = totalFloor;
        this.propertySize = propertySize;
        this.latitude = latitude;
        this.longitude = longitude;
        this.propertyAge = propertyAge;
        this.accurateLocation = accurateLocation;
        this.pinCode = pinCode;
        this.active = active;
        this.negotiable = negotiable;
        this.type = type;
        this.city = city;
        this.locality = locality;
        this.street = street;
        this.society = society;
        this.propertyType = propertyType;
        this.bathroom = bathroom;
        this.cupBoard = cupBoard;
        this.parking = parking;
        this.inactiveReason = inactiveReason;
        this.swimmingPool = swimmingPool;
        this.gym = gym;
        this.furnishing = furnishing;
        this.lift = lift;
        this.propertyCode = propertyCode;
        this.amenities = amenities;
        this.availableFrom = availableFrom;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.activationDate = activationDate;
        this.facing = facing;
        this.localityId = localityId;
        this.nbLocality = nbLocality;
        this.managed = managed;
        this.location = location;
        this.score = score;
        this.ownerId = ownerId;
        this.amenitiesMap = amenitiesMap;
        this.powerBackup = powerBackup;
        this.waterSupply = waterSupply;
        this.rent = rent;
        this.deposit = deposit;
        this.sharedAccomodation = sharedAccomodation;
        this.accomodationType = accomodationType;
        this.balconies = balconies;
        this.buildingType = buildingType;
        this.forLease = forLease;
        this.typeDesc = typeDesc;
        this.detailUrl = detailUrl;
        this.propertyTitle = propertyTitle;
        this.title = title;
        this.tenantTypeDesc = tenantTypeDesc;
        this.loanAvailable = loanAvailable;
        this.dateOnly = dateOnly;
        this.accomodationTypeDesc = accomodationTypeDesc;
        this.furnishingDesc = furnishingDesc;
        this.secondaryTitle = secondaryTitle;
        this.photos = photos;
        this.photoAvailable = photoAvailable;
        this.adminEvent = adminEvent;
        this.facingDesc = facingDesc;
        this.parkingDesc = parkingDesc;
    }

    public boolean isShortlistedByLoggedInUser() {
        return shortlistedByLoggedInUser;
    }

    public void setShortlistedByLoggedInUser(boolean shortlistedByLoggedInUser) {
        this.shortlistedByLoggedInUser = shortlistedByLoggedInUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    public long getFloor() {
        return floor;
    }

    public void setFloor(long floor) {
        this.floor = floor;
    }

    public long getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(long totalFloor) {
        this.totalFloor = totalFloor;
    }

    public long getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(long propertySize) {
        this.propertySize = propertySize;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(long propertyAge) {
        this.propertyAge = propertyAge;
    }

    public boolean isAccurateLocation() {
        return accurateLocation;
    }

    public void setAccurateLocation(boolean accurateLocation) {
        this.accurateLocation = accurateLocation;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isNegotiable() {
        return negotiable;
    }

    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public long getBathroom() {
        return bathroom;
    }

    public void setBathroom(long bathroom) {
        this.bathroom = bathroom;
    }

    public long getCupBoard() {
        return cupBoard;
    }

    public void setCupBoard(long cupBoard) {
        this.cupBoard = cupBoard;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public Object getInactiveReason() {
        return inactiveReason;
    }

    public void setInactiveReason(Object inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public String getFurnishing() {
        return furnishing;
    }

    public void setFurnishing(String furnishing) {
        this.furnishing = furnishing;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public Object getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(Object propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public long getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(long availableFrom) {
        this.availableFrom = availableFrom;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public long getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(long activationDate) {
        this.activationDate = activationDate;
    }

    public String getFacing() {
        return facing;
    }

    public void setFacing(String facing) {
        this.facing = facing;
    }

    public String getLocalityId() {
        return localityId;
    }

    public void setLocalityId(String localityId) {
        this.localityId = localityId;
    }

    public String getNbLocality() {
        return nbLocality;
    }

    public void setNbLocality(String nbLocality) {
        this.nbLocality = nbLocality;
    }

    public Object getManaged() {
        return managed;
    }

    public void setManaged(Object managed) {
        this.managed = managed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public AmenitiesMap getAmenitiesMap() {
        return amenitiesMap;
    }

    public void setAmenitiesMap(AmenitiesMap amenitiesMap) {
        this.amenitiesMap = amenitiesMap;
    }

    public String getPowerBackup() {
        return powerBackup;
    }

    public void setPowerBackup(String powerBackup) {
        this.powerBackup = powerBackup;
    }

    public String getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(String waterSupply) {
        this.waterSupply = waterSupply;
    }

    public long getRent() {
        return rent;
    }

    public void setRent(long rent) {
        this.rent = rent;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public boolean isSharedAccomodation() {
        return sharedAccomodation;
    }

    public void setSharedAccomodation(boolean sharedAccomodation) {
        this.sharedAccomodation = sharedAccomodation;
    }

    public String getAccomodationType() {
        return accomodationType;
    }

    public void setAccomodationType(String accomodationType) {
        this.accomodationType = accomodationType;
    }

    public long getBalconies() {
        return balconies;
    }

    public void setBalconies(long balconies) {
        this.balconies = balconies;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public Object getForLease() {
        return forLease;
    }

    public void setForLease(Object forLease) {
        this.forLease = forLease;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getPropertyTitle() {
        return propertyTitle;
    }

    public void setPropertyTitle(String propertyTitle) {
        this.propertyTitle = propertyTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTenantTypeDesc() {
        return tenantTypeDesc;
    }

    public void setTenantTypeDesc(String tenantTypeDesc) {
        this.tenantTypeDesc = tenantTypeDesc;
    }

    public boolean isLoanAvailable() {
        return loanAvailable;
    }

    public void setLoanAvailable(boolean loanAvailable) {
        this.loanAvailable = loanAvailable;
    }

    public long getDateOnly() {
        return dateOnly;
    }

    public void setDateOnly(long dateOnly) {
        this.dateOnly = dateOnly;
    }

    public String getAccomodationTypeDesc() {
        return accomodationTypeDesc;
    }

    public void setAccomodationTypeDesc(String accomodationTypeDesc) {
        this.accomodationTypeDesc = accomodationTypeDesc;
    }

    public String getFurnishingDesc() {
        return furnishingDesc;
    }

    public void setFurnishingDesc(String furnishingDesc) {
        this.furnishingDesc = furnishingDesc;
    }

    public String getSecondaryTitle() {
        return secondaryTitle;
    }

    public void setSecondaryTitle(String secondaryTitle) {
        this.secondaryTitle = secondaryTitle;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public boolean isPhotoAvailable() {
        return photoAvailable;
    }

    public void setPhotoAvailable(boolean photoAvailable) {
        this.photoAvailable = photoAvailable;
    }

    public String getAdminEvent() {
        return adminEvent;
    }

    public void setAdminEvent(String adminEvent) {
        this.adminEvent = adminEvent;
    }

    public String getFacingDesc() {
        return facingDesc;
    }

    public void setFacingDesc(String facingDesc) {
        this.facingDesc = facingDesc;
    }

    public String getParkingDesc() {
        return parkingDesc;
    }

    public void setParkingDesc(String parkingDesc) {
        this.parkingDesc = parkingDesc;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "shortlistedByLoggedInUser=" + shortlistedByLoggedInUser +
                ", id='" + id + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", description='" + description + '\'' +
                ", leaseType='" + leaseType + '\'' +
                ", floor=" + floor +
                ", totalFloor=" + totalFloor +
                ", propertySize=" + propertySize +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", propertyAge=" + propertyAge +
                ", accurateLocation=" + accurateLocation +
                ", pinCode=" + pinCode +
                ", active=" + active +
                ", negotiable=" + negotiable +
                ", type='" + type + '\'' +
                ", city='" + city + '\'' +
                ", locality='" + locality + '\'' +
                ", street='" + street + '\'' +
                ", society='" + society + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", bathroom=" + bathroom +
                ", cupBoard=" + cupBoard +
                ", parking='" + parking + '\'' +
                ", inactiveReason=" + inactiveReason +
                ", swimmingPool=" + swimmingPool +
                ", gym=" + gym +
                ", furnishing='" + furnishing + '\'' +
                ", lift=" + lift +
                ", propertyCode=" + propertyCode +
                ", amenities='" + amenities + '\'' +
                ", availableFrom=" + availableFrom +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", activationDate=" + activationDate +
                ", facing='" + facing + '\'' +
                ", localityId='" + localityId + '\'' +
                ", nbLocality='" + nbLocality + '\'' +
                ", managed=" + managed +
                ", location='" + location + '\'' +
                ", score=" + score +
                ", ownerId='" + ownerId + '\'' +
                ", amenitiesMap=" + amenitiesMap +
                ", powerBackup='" + powerBackup + '\'' +
                ", waterSupply='" + waterSupply + '\'' +
                ", rent=" + rent +
                ", deposit=" + deposit +
                ", sharedAccomodation=" + sharedAccomodation +
                ", accomodationType='" + accomodationType + '\'' +
                ", balconies=" + balconies +
                ", buildingType='" + buildingType + '\'' +
                ", forLease=" + forLease +
                ", typeDesc='" + typeDesc + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", propertyTitle='" + propertyTitle + '\'' +
                ", title='" + title + '\'' +
                ", tenantTypeDesc='" + tenantTypeDesc + '\'' +
                ", loanAvailable=" + loanAvailable +
                ", dateOnly=" + dateOnly +
                ", accomodationTypeDesc='" + accomodationTypeDesc + '\'' +
                ", furnishingDesc='" + furnishingDesc + '\'' +
                ", secondaryTitle='" + secondaryTitle + '\'' +
                ", photos=" + photos +
                ", photoAvailable=" + photoAvailable +
                ", adminEvent='" + adminEvent + '\'' +
                ", facingDesc='" + facingDesc + '\'' +
                ", parkingDesc='" + parkingDesc + '\'' +
                '}';
    }
}
