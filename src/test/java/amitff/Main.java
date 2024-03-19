package amitff;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://uatweb67.etmoney.tech/api/users/entity-down-sync");
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		httpConn.setRequestMethod("POST");

		httpConn.setRequestProperty("authority", "uatweb67.etmoney.tech");
		httpConn.setRequestProperty("accept", "application/json");
		httpConn.setRequestProperty("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
		httpConn.setRequestProperty("baggage", "sentry-environment=UAT,sentry-release=5.13.13.0,sentry-transaction=%2Fdashboard%2F%3AproductType%2Fsip,sentry-public_key=aa08903fe89d4d6e868cb5a4c5c14b63,sentry-trace_id=2f90a52f0b5d44c89275392f4dc58e32,sentry-sample_rate=1");
		httpConn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
		httpConn.setRequestProperty("cookie", "_gcl_au=1.1.1383099042.1709895686; _gid=GA1.2.649856134.1710000279; afUserId=a2f5dbac-b33f-470c-878f-0c0fe090be07-p; AF_SYNC=1710039487147; _fbp=fb.1.1710039488168.2045183427; g_state={\"i_p\":1710131998366,\"i_l\":2}; ememi=Y2Fpd2ViZzEyQHlvcG1haWwuY29t; userIdEnc=TVRRNU5qRT0=; loginMethod=ZW1haWw=; JSESSIONID=4B196EF0FAC052AE4E97F86612E30EB9; RT=\"sl=12&ss=1710045591430&tt=17350&obo=0&sh=1710045803848%3D12%3A0%3A17350%2C1710045789457%3D11%3A0%3A16791%2C1710045786399%3D10%3A0%3A15788%2C1710045779991%3D9%3A0%3A15357%2C1710045777966%3D8%3A0%3A14777&dm=uatweb67.etmoney.tech&si=d2056f1a-1e4e-4473-8b0f-2b25ab261a3f&bcn=%2F%2F684d0d4c.akstat.io%2F\"; _gat_UA-61175757-2=1; _ga=GA1.1.1339139590.1709895686; _ga_4SS2NEWG4N=GS1.1.1710045594.16.1.1710045883.59.0.0; _ga_N06NDX6T5R=GS1.2.1710045594.4.1.1710045883.60.0.0");
		httpConn.setRequestProperty("origin", "https://uatweb67.etmoney.tech");
		httpConn.setRequestProperty("referer", "https://uatweb67.etmoney.tech/dashboard/mf/sip");
		httpConn.setRequestProperty("sec-ch-ua", "\"Chromium\";v=\"122\", \"Not(A:Brand\";v=\"24\", \"Google Chrome\";v=\"122\"");
		httpConn.setRequestProperty("sec-ch-ua-mobile", "?0");
		httpConn.setRequestProperty("sec-ch-ua-platform", "\"macOS\"");
		httpConn.setRequestProperty("sec-fetch-dest", "empty");
		httpConn.setRequestProperty("sec-fetch-mode", "cors");
		httpConn.setRequestProperty("sec-fetch-site", "same-origin");
		httpConn.setRequestProperty("sentry-trace", "2f90a52f0b5d44c89275392f4dc58e32-92bbcc087c674134-1");
		httpConn.setRequestProperty("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");

		httpConn.setDoOutput(true);
		OutputStreamWriter writer = new OutputStreamWriter(httpConn.getOutputStream());
		writer.write("userProfileDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&investorDetailDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&userMFHoldingAndTransactionDownSyncData=%7B%22freshCopyRequired%22%3Atrue%2C%22toBatch%22%3Afalse%7D&standingInstructionDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&mfeMandateDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&countryDownSyncData=%7B%22freshCopyRequired%22%3Afalse%7D&stateDownSyncData=%7B%22freshCopyRequired%22%3Afalse%7D&relationshipDownSyncData=%7B%22freshCopyRequired%22%3Afalse%7D&occupationDownSyncData=%7B%22freshCopyRequired%22%3Afalse%7D&npsDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&fdDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&providerAMCMappingDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&resourcesDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&ordersDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&userPFMSolutionSIPDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&riskAssessmentQuestionnaireDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&esignDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&userPFMSolutionDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&advisoryDetailDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&casPdfUserInfoDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&userSubscriptionDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&userDocumentUploadTicketDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&userStockTransactionAndItemDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&userBrokerSessionDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&userWatchlistDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&mfCentralUserInfoDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&refreshAvailableCreditLineDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&creditLineDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&axisPlDownSyncData=%7B%22freshCopyRequired%22%3Atrue%7D&email=caiwebg12%40yopmail.com&authType=2");
		writer.flush();
		writer.close();
		httpConn.getOutputStream().close();

		InputStream responseStream = httpConn.getResponseCode() / 100 == 2
				? httpConn.getInputStream()
				: httpConn.getErrorStream();
		Scanner s = new Scanner(responseStream).useDelimiter("\\A");
		String response = s.hasNext() ? s.next() : "";
		System.out.println(response);
	}
}