package amitff;

public class RequiredDeviceDetails{
    public int deviceId;
    public int sourceId;
    public String uniqueAndroidId;
    public String fcmRegistrationId;
    public String androidAdId;
    public Object deviceImei;
    public String appVersionName;
    public int appVersionCode;
    public int osType;
}

public class Root{
    public ArrayList<int> lineage;
    public int type;
    public int restRequestType;
    public int userId;
    public int internalRestRequestType;
    public int mobileRestRequestType;
    public String versionId;
    public String compatibilityVersion;
    public RequiredDeviceDetails requiredDeviceDetails;
    public ArrayList<Object> permissionIds;
    public Object request2FAToken;
    public Object nomineeAuthenticationToken;
    public Object redemptionAuthToken;
    public Object purchaseAuthToken;
    public Object request1FATimestamp;
    public Object nomineeAllocationUid;
    public String email;
    public String packageName;
    public UserDeviceNSource userDeviceNSource;
    public int referrerId;
    public int campaignSource;
    public boolean isDeferredUser;
}

public class UserDeviceNSource{
    public int id;
    public int sourceId;
    public int osType;
    public String appVersion;
    public String osVersion;
    public String uniqueAndroidId;
    public String deviceMake;
    public String deviceModel;
    public Object carrier;
    public Object deviceIMEI;
    public String androidAdId;
    public String channelId;
    public String fcmRegistrationId;
    public int appState;
}



