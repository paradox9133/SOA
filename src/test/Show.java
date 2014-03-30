package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import test.generated.Katalog;
import test.generated.Katalog.Wieza;

public class Show {

	private String KATALOG_XML = "/home/adam/EclipseJavaEEWS/lab2/src/resources/xml/Katalog.xml";
	

	public String getKatalogXml() {
		return KATALOG_XML;
	}
/*	private String getPath() throws UnsupportedEncodingException{
		File f = new File(Show.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		
		return f.getAbsolutePath();
	}*/

	private Katalog katalog;

	public java.util.List<Wieza> getWieza() throws FileNotFoundException,
			JAXBException {

		czytaj();

		return katalog.getWieza();
	}

	public void czytaj() throws FileNotFoundException, JAXBException {
		JAXBContext context = JAXBContext.newInstance(Katalog.class);
		Unmarshaller um = context.createUnmarshaller();
		katalog = (Katalog) um.unmarshal(new FileReader(KATALOG_XML));
	}

	public void downloadLibraryXML() throws IOException {

	}

}
