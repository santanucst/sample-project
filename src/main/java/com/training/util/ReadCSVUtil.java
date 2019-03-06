package com.training.util;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import com.training.constant.AppConstant;

public class ReadCSVUtil {

	public void sampleRead() {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(AppConstant.SAMPLE_DATA_PATH));
			Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(reader);

			for (CSVRecord record : records) {
				System.out.println(record.get(0) + " : " + record.get(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
