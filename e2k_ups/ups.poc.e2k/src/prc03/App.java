package prc03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String ShmChargesData;
		String ShmChargeInstanceId;
		String ShmChargeCode;
		String ShmShortDescription;
		String ShmActivationDate;
		String ShmEffectiveDate;
		String ShmEffectiveEndDate;
		String ShmIsDeletedInd;
		String ShmTypeCode;
		String ShmLegacyCode;
		String ShmLegacyCodeNi;
		String ShmRatingType;
		String ShmRatingSortGroup;
		String ShmRatingSortGroupN;
		String ShmCorporateCode;
		String ShmPostedByUserId;
		String ShmPostedTimestamp;
		String ShmUpdtByLegacyInd;
		String ShmOrigDestInd;
		String ShmDefaultPayorInd;
		String ShmIntRevAllocation;
		String ShmIntRevAllocationN;

		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		String line;

		try {
			br = new BufferedReader(new FileReader("myfile.txt"));

			while ((line = br.readLine()) != null) {

				if (sb.length() > 0) {
					sb.append("\n");
				}
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		String[] parts = sb.toString().split("\\r?\\n");

		if (parts.length == 22) {

			ShmChargesData = parts[0];
			ShmChargeInstanceId = parts[1];
			ShmChargeCode = parts[2];
			ShmShortDescription = parts[3];
			ShmActivationDate = parts[4];
			ShmEffectiveDate = parts[5];
			ShmEffectiveEndDate = parts[6];
			ShmIsDeletedInd = parts[7];
			ShmTypeCode = parts[8];
			ShmLegacyCode = parts[9];
			ShmLegacyCodeNi = parts[10];
			ShmRatingType = parts[11];
			ShmRatingSortGroup = parts[12];
			ShmRatingSortGroupN = parts[13];
			ShmCorporateCode = parts[14];
			ShmPostedByUserId = parts[15];
			ShmPostedTimestamp = parts[16];
			ShmUpdtByLegacyInd = parts[17];
			ShmOrigDestInd = parts[18];
			ShmDefaultPayorInd = parts[19];
			ShmIntRevAllocation = parts[20];
			ShmIntRevAllocationN = parts[21];
		}
	}
}
