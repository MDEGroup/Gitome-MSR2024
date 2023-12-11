package it.univaq.disim.msr.datashowcase.readme.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import readme.GitHubRepository;
import readme.Model;
import readme.ReadmeFactory;
import readme.ReadmePackage;

public class Utils {

	public static void main(String[] args) {
		Model m = loadModelFromCSV("global_no_dups.csv");
		serialize(m, "test.xmi");
		Model m1 = loadModelFromXMI("test.xmi");
		m1.getRepositories().forEach(z->System.out.println(z.getOwner()));
	}

	public static Model loadModelFromCSV(String path) {
		Model result = ReadmeFactory.eINSTANCE.createModel();
		try (Reader reader = new FileReader(path); 
				CSVParser csvParser = new CSVParser(reader, 
						CSVFormat.DEFAULT.builder().setHeader().setSkipHeaderRecord(true).build())) {
			for (CSVRecord csvRecord : csvParser) {
				try {
				String repoFullname = csvRecord.get("repo_url").toLowerCase().replace("https://github.com/", "");
				String columnTwo = csvRecord.get(1);
				GitHubRepository repo = ReadmeFactory.eINSTANCE.createGitHubRepository();
				repo.setOwner(repoFullname.trim().split("/")[0]);
				repo.setRepository(repoFullname.trim().split("/")[1]);
				
				//TODO completa la situazione. 
				System.out.println(repoFullname);
				System.out.println(columnTwo);
				result.getRepositories().add(repo);
			} catch (Exception e) {
					// TODO: handle exception
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static Model load(String fileName) {
		EPackage.Registry.INSTANCE.put(ReadmePackage.eNS_URI, ReadmePackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Model myWeb = (Model) resource.getContents().get(0);
		return myWeb;
	}
	
	
	public static Model loadModelFromXMI(String path) {
		Model result = ReadmeFactory.eINSTANCE.createModel();
		try (Reader reader = new FileReader(path); 
				CSVParser csvParser = new CSVParser(reader, 
						CSVFormat.DEFAULT.builder().setHeader().setSkipHeaderRecord(true).build())) {
			for (CSVRecord csvRecord : csvParser) {
				try {
				String repoFullname = csvRecord.get("repo_url").toLowerCase().replace("https://github.com/", "");
				String columnTwo = csvRecord.get(1);
				GitHubRepository repo = ReadmeFactory.eINSTANCE.createGitHubRepository();
				repo.setOwner(repoFullname.trim().split("/")[0]);
				repo.setRepository(repoFullname.trim().split("/")[1]);
				
				System.out.println(repoFullname);
				System.out.println(columnTwo);
				result.getRepositories().add(repo);
			} catch (Exception e) {
					// TODO: handle exception
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	public static void serialize(Model model, String path) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(path));
		resource.getContents().add(model);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
