package amitff;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class APITest {

    @Test
    public void loginUser() {
        // Set base URI
        RestAssured.baseURI = "https://uat175.etmoney.tech";

        // Create payload data
        List<Integer> lineage = Arrays.asList(1, 1, 1, 114);
        RequiredDeviceDetails deviceDetails = new RequiredDeviceDetails(0, 0, "ddde5607282b32be",
                "dT-TVJaTRV2K7JOvkrdKo3:APA91bFRMdQ14JGCoby7s5NwMbk13JEd7iWFFDCTwcP24LgqBUN3TnULuUBIVBsCNkoQAj5J1YC5nIy558xjK_xzGABgg0JgFXi6E8_3s-b60bqexc9RTF8bzUuXCslI-2bbEwYELkLX", "18aec2b3-8b7e-4ef7-b48e-36866b8bb6c2", null,
                "4.28.3.4", 619, 1);

        UserDeviceNSource userDeviceNSource = new UserDeviceNSource(0, 0, 1, "4.28.3.4", "11", "ddde5607282b32be", "vivo", "V2101",
                null, null, "18aec2b3-8b7e-4ef7-b48e-36866b8bb6c2", "", "dT-TVJaTRV2K7JOvkrdKo3:APA91bFRMdQ14JGCoby7s5NwMbk13JEd7iWFFDCTwcP24LgqBUN3TnULuUBIVBsCNkoQAj5J1YC5nIy558xjK_xzGABgg0JgFXi6E8_3s-b60bqexc9RTF8bzUuXCslI-2bbEwYELkLX", 1);

        HashMap<String, Object> payloadData = new HashMap<>();
        payloadData.put("lineage", lineage);
        payloadData.put("type", 1);
        payloadData.put("restRequestType", 1);
        payloadData.put("userId", 0);
        payloadData.put("internalRestRequestType", 1);
        payloadData.put("mobileRestRequestType", 114);
        payloadData.put("versionId", "149");
        payloadData.put("compatibilityVersion", "48.0");
        payloadData.put("requiredDeviceDetails", deviceDetails);
        payloadData.put("permissionIds", Arrays.asList());
        payloadData.put("request2FAToken", null);
        payloadData.put("nomineeAuthenticationToken", null);
        payloadData.put("redemptionAuthToken", null);
        payloadData.put("purchaseAuthToken", null);
        payloadData.put("request1FATimestamp", null);
        payloadData.put("nomineeAllocationUid", null);
        payloadData.put("email", "caiwebg12@yopmail.com");
        payloadData.put("packageName", "com.smartspends");
        payloadData.put("userDeviceNSource", userDeviceNSource);
        payloadData.put("referrerId", 0);
        payloadData.put("campaignSource", 0);
        payloadData.put("isDeferredUser", false);
        payloadData.put("campaignSource", 0);
        payloadData.put("isDeferredUser", false);

        // Make API call
        given()
            .contentType(ContentType.JSON)
            .body(payloadData)
        .when()
            .post("/users/login")
        .then()
            .statusCode(200)
            .log().all();
    }

    // Define inner classes for required nested structures
    private static class RequiredDeviceDetails {
        private int deviceId;
        private int sourceId;
        private String uniqueAndroidId;
        private String fcmRegistrationId;
        private String androidAdId;
        private Object deviceImei;
        private String appVersionName;
        private int appVersionCode;
        private int osType;

        public RequiredDeviceDetails(int deviceId, int sourceId, String uniqueAndroidId, String fcmRegistrationId,
                                     String androidAdId, Object deviceImei, String appVersionName, int appVersionCode, int osType) {
            this.deviceId = deviceId;
            this.sourceId = sourceId;
            this.uniqueAndroidId = uniqueAndroidId;
            this.fcmRegistrationId = fcmRegistrationId;
            this.androidAdId = androidAdId;
            this.deviceImei = deviceImei;
            this.appVersionName = appVersionName;
            this.appVersionCode = appVersionCode;
            this.osType = osType;
        }
    }

    private static class UserDeviceNSource {
        private int id;
        private int sourceId;
        private int osType;
        private String appVersion;
        private String osVersion;
        private String uniqueAndroidId;
        private String deviceMake;
        private String deviceModel;
        private Object carrier;
        private Object deviceIMEI;
        private String androidAdId;
        private String channelId;
        private String fcmRegistrationId;
        private int appState;

        public UserDeviceNSource(int id, int sourceId, int osType, String appVersion, String osVersion, String uniqueAndroidId,
                                 String deviceMake, String deviceModel, Object carrier, Object deviceIMEI,
                                 String androidAdId, String channelId, String fcmRegistrationId, int appState) {
            this.id = id;
            this.sourceId = sourceId;
            this.osType = osType;
            this.appVersion = appVersion;
            this.osVersion = osVersion;
            this.uniqueAndroidId = uniqueAndroidId;
            this.deviceMake = deviceMake;
            this.deviceModel = deviceModel;
            this.carrier = carrier;
            this.deviceIMEI = deviceIMEI;
            this.androidAdId = androidAdId;
            this.channelId = channelId;
            this.fcmRegistrationId = fcmRegistrationId;
            this.appState = appState;
        }
    }
}
