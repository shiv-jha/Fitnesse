package com.optum.hde.fitnesse.fixtures.wiki;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.logging.Logger;

import com.optum.hde.fitnesse.HDE;
import com.optum.hde.fitnesse.Environ;
import com.optum.hde.fitnesse.domain.Aggregation;
import com.optum.hde.fitnesse.domain.RRUAggregation;
import com.optum.hde.fitnesse.repo.impl.AggrerationRepoImpl;
import com.optum.hde.fitnesse.repo.impl.RRUAggrerationRepoImpl;
import com.optum.stk.core.STK;
import com.optum.stk.errors.STKValidatorException;

public class FitWikiPage {

	private final static Logger log = Logger.getLogger(FitWikiPage.class.getName());
	private String measureName;
	private Environ env;
	
	public FitWikiPage(String envId, String projectId, String clientId, String jobId) {
		this.env = new Environ(envId, projectId, clientId,  jobId);
	}


	public void generateWikiPageTestContent(String measureName, String populationIds, String projectKey) throws STKValidatorException {

		this.measureName = measureName;

		final String path = System.getProperty("user.dir") + File.separator + "wikipage" + File.separator + measureName + ".txt";

		if (STK.validator().isValidFilePath(new File(path).toURI().getPath())) {
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(Files.newBufferedWriter(Paths.get(path), StandardCharsets.UTF_8, StandardOpenOption.WRITE));

				String[] popIds = null;
				if (populationIds.contains(",")) {
					popIds = populationIds.split(",");
					for (String pop : popIds) {
						log.info("Going to generate wiki page for population:" + pop);
						// Load idss elements
						List<Aggregation> aggregationByMeasure = new AggrerationRepoImpl().getAggregationByMeasure(env.envId, measureName, pop,
								Integer.parseInt(projectKey));
						generateWikiPage(writer, aggregationByMeasure, pop);
					}
				} else {
					// Load idss elements
					List<Aggregation> aggregationByMeasure = new AggrerationRepoImpl().getAggregationByMeasure(env.envId, measureName, populationIds,
							Integer.parseInt(projectKey));
					generateWikiPage(writer, aggregationByMeasure, populationIds);
				}
				writer.newLine();
				generateCleanUpContent(writer);
				writer.newLine();

				writer.flush();
			} catch (IOException e) {
				log.severe("Problem occurred while opening a stream connection ");
				throw new IllegalStateException("Problem occurred while opening a stream connection ");
			} finally {
				// cleanup data
				/*
				 * if (fileWriter != null) { safeClose(fileWriter); }
				 */
				if (writer != null) {
					safeClose(writer);
				}
			}
		}
	}

	public void generateWikiPageTestContentWithoutPopulation(String measureName, String projectKey) throws IOException,
			STKValidatorException {

		this.measureName = measureName;
		String path = HDE.USER_DIR + File.separator + "wikipage" + File.separator + measureName + ".txt";

		if (STK.validator().isValidFilePath(new File(path).toURI().getPath())) {
			File file = new File(path);
			FileWriter fileWriter = null;
			BufferedWriter writer = null;
			try {
				fileWriter = new FileWriter(file);
				writer = new BufferedWriter(fileWriter);
				// Load idss elements
				List<Aggregation> aggregationByMeasure = new AggrerationRepoImpl().getAggregationByProjectKey(env.envId,measureName, projectKey);
				generateWikiPageWithProjectKey(writer, aggregationByMeasure);
			} finally {
				// cleanup data
				if (fileWriter != null) {
					safeClose(fileWriter);
				}
				if (writer != null) {
					writer.newLine();
					generateCleanUpContent(writer);
					writer.newLine();

					writer.flush();

					safeClose(writer);
				}
			}
		}
	}

	public void generateWikiPageTestContentForRru(String measureName, String populationIds, int riskGroup, int year, String gender,
			String projectKey) throws IOException, NumberFormatException, STKValidatorException {

		this.measureName = measureName;

		int nextInt = -1;
		try {
			SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
			nextInt = new Integer(prng.nextInt());
		} catch (NoSuchAlgorithmException e1) {
			log.severe("Problem occurred while generating random packing file name number ");
			throw new IllegalStateException("Problem occurred while generating random packing file name number ");
		}

		String path = HDE.USER_DIR + File.separator + "wikipage" + File.separator + measureName + nextInt + ".txt";
		if (STK.validator().isValidFilePath(new File(path).toURI().getPath())) {
			File file = new File(path);

			FileWriter fileWriter = null;
			BufferedWriter writer = null;
			try {
				fileWriter = new FileWriter(file);
				writer = new BufferedWriter(fileWriter);

				log.info("Going to generate wiki page for RRU Measure:" + measureName + " Info: Risk" + riskGroup + " Year: " + year
						+ " Gender:" + gender);

				String[] popIds = null;
				if (populationIds.contains(",")) {
					popIds = populationIds.split(",");
					for (String pop : popIds) {
						log.info("Going to generate wiki page for population:" + pop);
						// Load idss elements
						List<RRUAggregation> aggregationByMeasure = new RRUAggrerationRepoImpl().getRRUAggregationByMeasure(env.envId,measureName,
								pop, riskGroup, year, gender, Integer.parseInt(projectKey));
						generateRruWikiPage(writer, aggregationByMeasure, pop, riskGroup, year, gender);
					}
				} else {
					// Load idss elements
					List<RRUAggregation> aggregationByMeasure = new RRUAggrerationRepoImpl().getRRUAggregationByMeasure(env.envId,measureName,
							populationIds, riskGroup, year, gender, Integer.parseInt(projectKey));
					generateRruWikiPage(writer, aggregationByMeasure, populationIds, riskGroup, year, gender);
				}
			} finally {
				// cleanup data
				if (fileWriter != null) {
					safeClose(fileWriter);
				}
				if (writer != null) {
					writer.newLine();
					generateCleanUpContent(writer);
					writer.newLine();

					writer.flush();

					safeClose(writer);
				}
			}
		}
	}

	public static void safeClose(Writer writer) {
		if (writer != null) {
			try {
				writer.close();
			} catch (IOException e) {
				log.severe("Problem occurred while reaseing the writer connection");
			}
		}
	}

	private void generateRruWikiPage(BufferedWriter writer, List<RRUAggregation> aggregationByMeasure, String populationId, int riskGroup,
			int year, String gender) throws IOException {
		writer.newLine();
		writer.newLine();
		writer.write("|script|");
		writer.newLine();
		// |verify results for population|RMCD |and risk group |1 |and
		// year|1844|and gender|M|
		writer.write("|verify results for population|" + populationId + "|and risk group         |" + riskGroup + "			|and year|" + year
				+ "|and gender|" + gender + "|");
		writer.newLine();
		for (RRUAggregation aggregation : aggregationByMeasure) {
			writer.write("|ensure                       |idss element name       |" + aggregation.getIdssElement() + "|and its value|"
					+ aggregation.getValue() + "|");
			writer.newLine();
		}

		writer.newLine();
		generateShowMetrics(writer, populationId);
		writer.newLine();

	}

	private void generateWikiPageWithProjectKey(BufferedWriter writer, List<Aggregation> aggregationByMeasure) throws IOException {
		writer.newLine();
		writer.newLine();
		writer.write("|script|");
		writer.newLine();
		writer.write("|verify results by project key|");
		writer.newLine();
		for (Aggregation aggregation : aggregationByMeasure) {
			writer.write("|ensure                       |idss element name       |" + aggregation.getIdssElement() + "|and its value|"
					+ aggregation.getValue() + "|");
			writer.newLine();
		}

		writer.newLine();
		generateShowMetrics(writer);
		writer.newLine();

	}

	private void generateWikiPage(BufferedWriter writer, List<Aggregation> aggregationByMeasure, String populationId) {
		try {
			writer.newLine();
			writer.newLine();
			writer.write("|script|");
			writer.newLine();
			writer.write("|verify results for population|" + populationId + "|");
			writer.newLine();
			for (Aggregation aggregation : aggregationByMeasure) {
				writer.write("|ensure                       |idss element name       |" + aggregation.getIdssElement() + "|and its value|"
						+ aggregation.getValue() + "|");
				writer.newLine();
			}

			writer.newLine();
			generateShowMetrics(writer, populationId);
			writer.newLine();
		} catch (IOException io) {
			log.severe("Problem occurred while performing io stream operation ");
			throw new IllegalStateException("Problem occurred while performing io stream operation ");
		}

	}

	private void generateCleanUpContent(BufferedWriter writer) {
		try {
			writer.write("!*> Cleanup data");
			writer.newLine();
			writer.write("|script|");
			writer.newLine();
			writer.write("|truncate partition data for measure|" + measureName + "|");
			writer.newLine();
			writer.write("*!");
			writer.newLine();
		} catch (IOException io) {
			log.severe("Problem occurred while performing io stream operation ");
			throw new IllegalStateException("Problem occurred while performing io stream operation ");
		}
	}

	private void generateShowMetrics(BufferedWriter writer, String populationId) {
		try {
			writer.write("!*> Show Metrics for population " + populationId);
			writer.newLine();
			writer.write("|script|");
			writer.newLine();
			writer.write("|show   |metrics     |" + populationId + "|");
			writer.newLine();
			writer.write("*!");
			writer.newLine();
		} catch (IOException io) {
			log.severe("Problem occurred while performing io stream operation ");
			throw new IllegalStateException("Problem occurred while performing io stream operation ");
		}
	}

	private void generateShowMetrics(BufferedWriter writer) throws IOException {
		try {
			writer.write("!*> Show Metrics ");
			writer.newLine();
			writer.write("|script|");
			writer.newLine();
			writer.write("|show   |metrics     |");
			writer.newLine();
			writer.write("*!");
			writer.newLine();
		} catch (IOException io) {
			log.severe("Problem occurred while performing io stream operation ");
			throw new IllegalStateException("Problem occurred while performing io stream operation ");
		}
	}
}
